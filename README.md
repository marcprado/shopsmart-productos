# ShopSmart - Microservicio de Productos

Microservicio REST desarrollado con **Spring Boot 3** para la gestión de productos de la plataforma ShopSmart.

## Tecnologías

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- H2 Database (en memoria)
- Lombok
- Maven

## Endpoints disponibles

| Método | Ruta              | Descripción                    |
|--------|-------------------|--------------------------------|
| GET    | /productos        | Retorna lista de productos     |
| GET    | /productos/{id}   | Retorna un producto por ID     |
| POST   | /productos        | Agrega un nuevo producto       |
| PUT    | /productos/{id}   | Actualiza un producto          |
| DELETE | /productos/{id}   | Elimina un producto            |

## Cómo ejecutar

```bash
# Clonar repositorio
git clone https://github.com/tu-usuario/shopsmart-productos.git
cd shopsmart-productos

# Ejecutar con Maven
./mvnw spring-boot:run
```

El servicio corre en: `http://localhost:8081`

## Ejemplos de uso con Postman

### GET /productos
```
GET http://localhost:8081/productos
```

### POST /productos
```json
POST http://localhost:8081/productos
Content-Type: application/json

{
  "nombre": "Notebook Dell Inspiron",
  "descripcion": "Core i5, 16GB RAM, 256GB SSD",
  "precio": 749990.0,
  "stock": 8,
  "categoria": "Computación"
}
```

### PUT /productos/1
```json
PUT http://localhost:8081/productos/1
Content-Type: application/json

{
  "nombre": "Laptop HP Pavilion 15",
  "descripcion": "Actualizada 16GB RAM",
  "precio": 649990.0,
  "stock": 12,
  "categoria": "Computación"
}
```

## Consola H2 (desarrollo)

Disponible en: `http://localhost:8081/h2-console`  
JDBC URL: `jdbc:h2:mem:shopsmart_db`  
Usuario: `sa` | Contraseña: *(vacía)*
