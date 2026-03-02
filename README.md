# 🍕 Proyecto La Fogata - Sistema de Gestión de Pizzería

Aplicación web desarrollada con **Spring Boot** para la gestión de pizzas y pedidos en la pizzería *La Fogata*.  
El sistema permite visualizar pizzas, ver detalles y realizar pedidos desde una interfaz web dinámica.

---

## 🚀 Tecnologías Utilizadas

- Java 17+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- MySQL (o H2 según configuración)
- Maven
- Bootstrap

---

## 📁 Estructura del Proyecto
src/
├── main/
│ ├── java/com/pizzeria/proyectoLafogata/
│ │ ├── controller/
│ │ │ └── PizzaController.java
│ │ ├── model/
│ │ │ └── Pizza.java
│ │ ├── repository/
│ │ │ └── PizzaRepository.java
│ │
│ ├── resources/
│ │ ├── templates/
│ │ │ ├── layouts/
│ │ │ │ └── plantillas.html
│ │ │ ├── pizzas.html
│ │ │ ├── pizza-detalle.html
│ │ │ └── pedido.html
│ │ └── application.properties
