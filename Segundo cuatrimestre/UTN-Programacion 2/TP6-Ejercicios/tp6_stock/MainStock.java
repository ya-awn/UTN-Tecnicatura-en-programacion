package tp6_stock;

import java.util.List;

public class MainStock {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // 1. Crear y agregar al menos cinco productos
        inv.agregarProducto(new Producto("P001", "Arroz", 1200.0, 50, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P002", "Celular X", 25000.0, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P003", "Remera", 1500.0, 30, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P004", "Licuadora", 4500.0, 5, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P005", "Cereal", 900.0, 20, CategoriaProducto.ALIMENTOS));

        System.out.println("=== Listado de productos ===");
        inv.listarProductos();

        System.out.println("
=== Buscar producto por ID (P002) ===");
        Producto buscado = inv.buscarProductoPorId("P002");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("
=== Filtrar por categoria: ALIMENTOS ===");
        List<Producto> alimentos = inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        alimentos.forEach(Producto::mostrarInfo);

        System.out.println("
=== Eliminar producto P005 ===");
        inv.eliminarProducto("P005");
        inv.listarProductos();

        System.out.println("
=== Actualizar stock P003 a 40 ===");
        inv.actualizarStock("P003", 40);
        inv.buscarProductoPorId("P003").mostrarInfo();

        System.out.println("
=== Total de stock disponible ===");
        System.out.println(inv.obtenerTotalStock());

        System.out.println("
=== Producto con mayor stock ===");
        Producto mayor = inv.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();

        System.out.println("
=== Filtrar productos con precio entre 1000 y 3000 ===");
        inv.filtrarProductosPorPrecio(1000, 3000).forEach(Producto::mostrarInfo);

        System.out.println("
=== Categorias disponibles ===");
        inv.mostrarCategoriasDisponibles();
    }
}
