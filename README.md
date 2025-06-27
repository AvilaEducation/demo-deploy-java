# 🛍️ Product API - by Talent Tech

API REST para gestionar productos

---

## 🚀 Características principales

- Gestión completa de productos: crear, leer, actualizar y eliminar.
- Búsqueda avanzada por nombre de producto.
- Soporte para imágenes, stock, categorías y descripciones detalladas.
- Configuración CORS para integración segura con frontend.
- DTOs para una comunicación limpia entre cliente y servidor.
- Código desarrollado con Spring Boot para máxima robustez y escalabilidad.

---

## 🔗 Enlaces importantes

| Aplicación           | URL                                                                                                        |
|----------------------|------------------------------------------------------------------------------------------------------------|
| 🌐 Frontend          | [https://frontend-techlab.up.railway.app](https://frontend-techlab.up.railway.app)                         |
| 🔧 Backend API       | [https://backend-java-techlab.up.railway.app](https://backend-java-techlab.up.railway.app)                 |
| 📄 Documentación API | [https://backend-java-techlab.up.railway.app/docs](https://backend-java-techlab.up.railway.app/docs)       |
| 📄 Front-end Repo    | [https://github.com/AvilaEducation/demo-deploy-react](https://github.com/AvilaEducation/demo-deploy-react) |

---

## 📋 Endpoints disponibles

- `POST /products` – Crear un nuevo producto.
- `GET /products` – Listar todos los productos.
- `GET /products/search?queryName=` – Buscar productos por nombre.
- `GET /products/{id}` – Obtener un producto por ID.
- `PUT /products/{id}` – Actualizar un producto existente.
- `DELETE /products/{id}` – Eliminar un producto por ID.

Para más detalles, consultar
la [documentación completa](https://backend-java-techlab.up.railway.app/docs).

---

## 🛠️ Tecnologías utilizadas

- Java
- Spring Boot
- Maven
- REST API
- DTO pattern
- CORS
- Tailwind CSS (en el frontend)

---

## ⚙️ Instalación y ejecución local

1. **Clonar el repositorio**

   ```bash
   git clone git@github.com:AvilaEducation/demo-deploy-java.git
   ```

2. **Ejecuta la aplicación**
    * Puedes abrir la aplicación con tu IDE favorito y ejecutar el archivo **DeployJavaApplication**
    * Si tienes maven instalado puedes usar:
   ```bash
    cd demo-deploy-java
    mvn spring-boot:run
   ```