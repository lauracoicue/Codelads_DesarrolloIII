# Attribute-Driven Design (ADD) y su Relación con Clean Architecture

---
## ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?

Attribute-Driven Design (ADD) es un método que utilizamos para diseñar la arquitectura de un sistema partiendo de los atributos de calidad que este debe cumplir. Estos atributos pueden ser rendimiento, escalabilidad, seguridad, entre otros. El propósito de ADD es guiarnos paso a paso en la toma de decisiones arquitectónicas, enfocándonos siempre en las necesidades del negocio y del sistema.

---

## ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?

ADD se enfoca en definir la arquitectura a partir de los atributos de calidad, mientras que Clean Architecture organiza esa arquitectura en capas bien definidas que permiten una alta mantenibilidad, independencia y facilidad de prueba. Al combinar ambas, ADD nos dice *qué* necesita el sistema y Clean Architecture nos ayuda a definir *cómo* estructurarlo de una manera clara y ordenada.

---

## ¿Cuáles son los pasos principales del método ADD para definir una arquitectura de software?

1. **Identificar los estímulos y atributos de calidad** (requisitos no funcionales).
2. **Dividir el sistema en módulos o componentes** según los requerimientos.
3. **Asignar responsabilidades a cada módulo** para cumplir con los atributos de calidad.
4. **Seleccionar patrones arquitectónicos apropiados**.
5. **Validar que las decisiones arquitectónicas cumplan con los objetivos del sistema.**

---

## ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?

Se identifican analizando los requisitos no funcionales y las expectativas del negocio, usuarios y contexto del sistema. Son importantes porque definen cómo debe comportarse el sistema más allá de sus funciones, por ejemplo: qué tan rápido debe responder, cuán seguro debe ser, o cuán fácil será de mantener.

---

## ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?

Porque Clean Architecture proporciona una estructura clara y desacoplada que facilita implementar las decisiones arquitectónicas tomadas en ADD. Al estar organizada en capas, permite que los cambios en una parte del sistema no afecten otras, lo que ayuda a mantener los atributos de calidad definidos desde el inicio.

---

## ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?

Debemos considerar:

* Independencia de frameworks.
* Independencia de bases de datos o servicios externos.
* Separación clara entre lógica de negocio y detalles de implementación.
* Reglas de dependencia (hacia adentro y nunca hacia afuera).

Todo esto permite cumplir los atributos de calidad como mantenibilidad, testabilidad y flexibilidad.

---

## ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?

ADD nos obliga a pensar en las prioridades del negocio desde el inicio. Por ejemplo, si el negocio necesita alta disponibilidad, tomaremos decisiones que garanticen redundancia o balanceo de carga. Así, cada decisión arquitectónica está alineada con objetivos reales del proyecto.

---

## ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?

* Se construyen servicios que cumplen con atributos de calidad desde su diseño.
* La separación por capas facilita definir límites claros en cada microservicio.
* Se promueve el bajo acoplamiento y alta cohesión, ideales para microservicios.
* La mantenibilidad y escalabilidad del sistema mejora notablemente.

---

## ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?

A través de revisiones arquitectónicas, prototipos, pruebas de concepto y validaciones con las partes interesadas. También es clave documentar las decisiones y verificar que cada componente cumple con los atributos de calidad esperados.

---

## ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?

* **Modelado con UML** para visualizar componentes y sus relaciones.
* **ADR (Architecture Decision Records)** para registrar las decisiones.
* **Pruebas de rendimiento, seguridad y carga**.
* **Herramientas de análisis estático** para verificar buenas prácticas.
* **Revisiones entre pares o revisiones arquitectónicas formales.**
