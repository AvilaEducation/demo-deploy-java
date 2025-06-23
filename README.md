# 🛍️ Product API - Uso

API REST para gestionar productos. Permite crear, listar y buscar productos.

---

## ➕ Crear producto

**Método:** `POST`  
**URL:** `/product/`

**Request Body (JSON):**
```json
{
  "name": "Laptop",
  "price": "1200.00",
  "description": "...",
  "img": "https://www...."
}
```

**Response (200 OK):**
```json
{
  "id": 1,
  "name": "Laptop",
  "price": "1200.00",
  "description": "...",
  "img": "https://www...."
}
```

---

## 📋 Obtener todos los productos

**Método:** `GET`  
**URL:** `/product/`

**Response (200 OK):**
```json
[
  {
    "id": 1,
    "name": "Laptop",
    "price": "1200.00",
    "description": "...",
    "img": "https://www...."
  },
  {
    "id": 2,
    "name": "Mouse",
    "price": "25.00",
    "description": "...",
    "img": "https://www...."
  }
]
```

---

## 🔍 Buscar productos por nombre

**Método:** `GET`  
**URL:** `/product/search?queryName={nombre}`

**Parámetro:**  
- `queryName`: Nombre (o parte del nombre) del producto a buscar

**Ejemplo:**  
```
/product/search?queryName=lap
```

**Response (200 OK):**
```json
[
  {
    "id": 1,
    "name": "Laptop",
    "price": "1200.00",
    "description": "...",
    "img": "https://www...."
  }
]
```
