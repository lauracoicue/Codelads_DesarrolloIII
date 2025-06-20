# Domain-Driven Design (DDD)

## Preguntas y Respuestas

### 1. ¿Qué es Domain-Driven Design (DDD) y cuál es su objetivo principal?

Domain-Driven Design es una metodología de diseño de software enfocada en el dominio del negocio. Su objetivo principal es alinear el modelo de software con los procesos y reglas del negocio, permitiendo una mayor comprensión, comunicación y evolución del sistema.

---

### 2. ¿Cuál es la diferencia entre una Entidad y un Objeto de Valor en DDD?

Una **Entidad** es un objeto que tiene una identidad única que se mantiene a lo largo del tiempo, incluso si sus atributos cambian (por ejemplo, un cliente con su ID). Un **Objeto de Valor** representa una descripción o característica sin identidad propia, y se considera igual si sus valores son iguales (como una dirección o una fecha).

---

### 3. ¿Qué es un Bounded Context y por qué es importante en DDD?

Un **Bounded Context** delimita claramente los límites de aplicación de un modelo de dominio. Es importante porque permite definir un lenguaje específico y evitar ambigüedades entre conceptos que pueden tener distintos significados en diferentes contextos del sistema.

---

### 4. ¿Cuál es el propósito del Lenguaje Ubicuo (Ubiquitous Language) en DDD?

El **Lenguaje Ubicuo** es un lenguaje compartido entre desarrolladores, expertos del dominio y stakeholders. Su propósito es mejorar la comunicación y evitar malentendidos, asegurando que todos usen los mismos términos para referirse a los mismos conceptos del dominio.

---

### 5. ¿Qué es un Agregado (Aggregate) y cómo garantiza la consistencia en el dominio?

Un **Agregado** es un conjunto de entidades y objetos de valor que se tratan como una unidad para cambios de datos. Tiene una raíz (Aggregate Root) que controla el acceso y las modificaciones. Garantiza la consistencia limitando las operaciones al interior del agregado y respetando las reglas del dominio.

---

### 6. ¿Cómo se relacionan los Repositorios en DDD con la infraestructura de persistencia?

Los **Repositorios** actúan como puentes entre el dominio y la infraestructura. Permiten obtener y guardar agregados sin exponer detalles de persistencia como bases de datos. Así, el dominio permanece limpio y desacoplado de la infraestructura técnica.

---

### 7. ¿Qué son los Eventos de Dominio y cómo mejoran la comunicación entre Bounded Contexts?

Los **Eventos de Dominio** representan algo que ha ocurrido dentro del dominio y que puede ser relevante para otros componentes. Mejoran la comunicación entre **Bounded Contexts** al permitir una integración basada en eventos, promoviendo un sistema más desacoplado y reactivo.

---

### 8. ¿Cómo se diferencian los Servicios de Aplicación y los Servicios de Dominio en DDD?

- **Servicios de Aplicación**: coordinan tareas y orquestan la lógica, actuando como puente entre la capa de presentación y el dominio.
- **Servicios de Dominio**: contienen lógica del negocio que no pertenece a una entidad u objeto de valor específico, pero que sigue siendo parte del modelo del dominio.

---

### 9. ¿Cómo DDD facilita el diseño de software en sistemas complejos y escalables?

DDD facilita la gestión de la complejidad dividiendo el sistema en contextos claramente delimitados, usando modelos bien definidos y tácticas de diseño centradas en el negocio. Esto permite escalar el sistema de forma modular y mantenible, con equipos enfocados en áreas específicas del dominio.

---

### 10. ¿Cómo se puede combinar DDD con Clean Architecture en una aplicación de microservicios?

DDD y Clean Architecture son altamente complementarios. En una arquitectura de microservicios:

- DDD define el modelo del dominio y los Bounded Contexts.
- Clean Architecture organiza el código en capas (entidades, casos de uso, interfaces) separando claramente la lógica de negocio de los detalles técnicos.

Cada microservicio puede representar un Bounded Context, manteniendo independencia y escalabilidad, mientras se aplica Clean Architecture para estructurar internamente el servicio.

---
