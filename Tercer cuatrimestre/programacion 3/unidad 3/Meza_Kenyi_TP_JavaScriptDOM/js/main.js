// =============================================
// js/main.js — Lógica de renderizado del DOM
// =============================================

// --- Función: Renderizar Categorías ---
const cargarCategorias = () => {
  const lista = document.getElementById("lista-categorias");

  categorias.forEach(categoria => {
    const li = document.createElement("li");
    li.classList.add("categoria-item");

    const a = document.createElement("a");
    a.href = "#";
    a.textContent = categoria;

    a.addEventListener("click", (e) => {
      e.preventDefault();
      filtrarPorCategoria(categoria);
      document.querySelectorAll(".categoria-item a").forEach(link => link.classList.remove("activo"));
      a.classList.add("activo");
    });

    li.appendChild(a);
    lista.appendChild(li);
  });
};

// --- Función: Renderizar Productos ---
const cargarProductos = (listado = productos) => {
  const contenedor = document.getElementById("contenedor-productos");
  contenedor.innerHTML = "";

  if (listado.length === 0) {
    contenedor.innerHTML = `<p class="sin-resultados">No se encontraron productos.</p>`;
    return;
  }

  listado.forEach(producto => {
    const article = document.createElement("article");
    article.classList.add("producto-card");

    article.innerHTML = `
      <img src="${producto.imagen}" alt="${producto.nombre}" width="300" height="200" loading="lazy" />
      <div class="producto-info">
        <span class="producto-categoria">${producto.categoria}</span>
        <h3>${producto.nombre}</h3>
        <p>${producto.descripcion}</p>
        <p class="producto-precio">$${producto.precio.toLocaleString("es-AR")}</p>
        <button class="btn-agregar" data-id="${producto.id}" data-nombre="${producto.nombre}">
          🛒 Agregar al carrito
        </button>
      </div>
    `;

    const btn = article.querySelector(".btn-agregar");
    btn.addEventListener("click", () => {
      alert(`✅ "${producto.nombre}" agregado al carrito.`);
    });

    contenedor.appendChild(article);
  });
};

// --- Función: Filtrar por categoría ---
const filtrarPorCategoria = (categoria) => {
  const filtrados = productos.filter(p => p.categoria === categoria);
  cargarProductos(filtrados);
  document.querySelector("main h2").textContent = `Categoría: ${categoria}`;
};

// --- Función: Buscador ---
const iniciarBuscador = () => {
  const form = document.getElementById("form-busqueda");
  const input = document.getElementById("input-busqueda");

  form.addEventListener("submit", (e) => {
    e.preventDefault();
    const termino = input.value.trim().toLowerCase();

    if (!termino) {
      cargarProductos();
      document.querySelector("main h2").textContent = "Productos Destacados";
      return;
    }

    const resultados = productos.filter(p =>
      p.nombre.toLowerCase().includes(termino) ||
      p.descripcion.toLowerCase().includes(termino) ||
      p.categoria.toLowerCase().includes(termino)
    );

    cargarProductos(resultados);
    document.querySelector("main h2").textContent = `Resultados para: "${termino}"`;
    document.querySelectorAll(".categoria-item a").forEach(link => link.classList.remove("activo"));
  });
};

// --- Botón "Todos" ---
const agregarBotonTodos = () => {
  const lista = document.getElementById("lista-categorias");
  const li = document.createElement("li");
  li.classList.add("categoria-item");

  const a = document.createElement("a");
  a.href = "#";
  a.textContent = "Todos";
  a.classList.add("activo");

  a.addEventListener("click", (e) => {
    e.preventDefault();
    cargarProductos();
    document.querySelector("main h2").textContent = "Productos Destacados";
    document.querySelectorAll(".categoria-item a").forEach(link => link.classList.remove("activo"));
    a.classList.add("activo");
  });

  li.appendChild(a);
  lista.insertBefore(li, lista.firstChild);
};

// --- Inicialización ---
document.addEventListener("DOMContentLoaded", () => {
  cargarCategorias();
  agregarBotonTodos();
  cargarProductos();
  iniciarBuscador();
});
