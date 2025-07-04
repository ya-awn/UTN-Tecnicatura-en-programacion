# Trabajo Integrador – Virtualización con VirtualBox

**Materia:** Arquitectura y Sistemas Operativos  
**Alumnos:**  
- Kenyi Meza – mezakenyi@gmail.com  
- Roberto Méndez – robermen02@gmail.com  
**Profesor:** Ariel Enferrel

---

## 📌 Objetivo

Explorar la virtualización usando Oracle VirtualBox sobre Debian 12. Se creó una máquina virtual con Ubuntu Server, donde se instaló Docker para desplegar un contenedor con un servidor web Apache.

---

## 🧠 Marco Teórico

- **Virtualización:** Ejecutar múltiples sistemas operativos sobre un mismo hardware físico.
- **Hypervisores:**  
  - *Tipo 1:* Bare-metal (ej. VMware ESXi)  
  - *Tipo 2:* Sobre SO (ej. VirtualBox)  
- **VirtualBox:** Hipervisor tipo 2, libre y educativo.  
- **Docker:** Plataforma para ejecutar aplicaciones en contenedores livianos y aislados.

---

## ⚙️ Caso Práctico

Se instaló VirtualBox 7.1 en Debian 12 y se creó una VM con Ubuntu Server 22.04.  
Dentro de la VM se instaló Docker y se desplegó un contenedor con Apache.  
Desde el navegador del host se accedió al servidor web mediante la IP de la VM.

### Comandos esenciales:

**Instalación de VirtualBox:**
```bash
sudo apt install virtualbox-7.1
```

**Instalación de Docker en Ubuntu Server:**
```bash
sudo apt update
sudo apt install docker.io
sudo systemctl enable docker
sudo systemctl start docker
```

**Despliegue de Apache en contenedor Docker:**
```bash
docker run -dit --name apache-docker -p 8080:80 httpd
```

**Acceso desde el host:**
```
http://192.168.10.236:8080/
```

---

## 🧪 Resultados Obtenidos

- VirtualBox y Docker instalados correctamente.
- VM funcional y conectada en red puente.
- Apache accesible desde el navegador del host mediante contenedor Docker.

---

## 🧾 Conclusión

Se logró simular un entorno moderno de servidor usando tecnologías de virtualización y contenedores. La práctica ayudó a integrar herramientas clave para entornos de desarrollo y administración de sistemas.

---

## 🔗 Bibliografía

- [Docker – Instalación en Ubuntu](https://docs.docker.com/engine/install/ubuntu/)
- [Sitio oficial de VirtualBox](https://www.virtualbox.org)
- [Ubuntu Server](https://ubuntu.com)
