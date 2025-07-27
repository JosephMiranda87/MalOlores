# Java Code Smells – Ejemplos y Refactorizaciones

Este repositorio contiene ejemplos **educativos y prácticos** de *code smells* en Java, también conocidos como **malos olores de código**. Cada ejemplo incluye un caso en un package con el nombre del mal olor y la palabra**"Before"** (antes del refactor) y **"After"** (después del refactor), con el objetivo de demostrar cómo mejorar la calidad del software.

> Los code smells no son bugs, pero son síntomas de mal diseño que dificultan el mantenimiento, la comprensión y la evolución del código.

---

## 📁 Estructura del Repositorio

Cada carpeta representa un tipo de *code smell*. Dentro de ella encontrarás:

- `MalOlor.Before`: Código con el problema.
- `MaLOlor.After`: Código refactorizado y mejorado.

---

## Categorías de Code Smells

### 🔸 1. Bloaters
Smells relacionados con clases o métodos que **han crecido demasiado**.

| Carpeta                   | Descripción |
|---------------------------|-------------|
| `LongMethod/`             | Métodos muy largos que hacen demasiadas cosas. |
| `LargeClass/`             | Clases con demasiadas responsabilidades. |
| `PrimitiveObsession/`     | Uso excesivo de tipos primitivos en lugar de objetos. |
| `LongParameterList/`      | Métodos con demasiados parámetros. |
| `DataClumps/`             | Grupos de datos que siempre aparecen juntos. |

---

### 🔸 2. Object-Orientation Abusers
Mal uso de la programación orientada a objetos.

| Carpeta                                       | Descripción |
|-----------------------------------------------|-------------|
| `AlternativeClassesWithDifferentInterfaces/`  | Clases similares con interfaces distintas. |
| `RefusedBequest/`                             | Subclases que no usan o rompen la herencia. |
| `TemporaryField/`                             | Atributos que solo se usan temporalmente. |
| `SwitchStatements/`                           | Uso excesivo de `switch` en lugar de polimorfismo. |

---

### 🔸 3. Change Preventers
Olores que dificultan el cambio y mantenimiento del software.

| Carpeta                         | Descripción |
|---------------------------------|-------------|
| `DivergentChange/`             | Una clase cambia por múltiples razones. |
| `ParallelInheritance/`         | Jerarquías de herencia paralelas que evolucionan juntas. |
| `ShotgunSurgery/`              | Un cambio requiere tocar muchas clases a la vez. |

---

### 🔸 4. Dispensables
Código innecesario que puede ser eliminado.

| Carpeta                | Descripción |
|------------------------|-------------|
| `Comments/`            | Comentarios innecesarios que el código bien escrito debería evitar. |
| `DataClass/`           | Clases con solo getters/setters sin lógica. |
| `LazyClass/`           | Clases que no hacen lo suficiente para justificar su existencia. |
| `DuplicateCode/`       | Código repetido en varios lugares. |
| `DeadCode/`            | Código que nunca se usa o ejecuta. |
| `SpeculativeGenerality/` | Código escrito para necesidades futuras que nunca llegan. |

---

### 🔸 5. Couplers
Acoplamientos innecesarios o delegación excesiva entre clases.

| Carpeta                    | Descripción |
|----------------------------|-------------|
| `FeatureEnvy/`             | Una clase usa más datos de otra que de sí misma. |
| `InappropriateIntimacy/`   | Clases que conocen demasiado la estructura interna de otras. |
| `MessageChains/`           | Cadenas largas de llamadas (`a.getB().getC().getD()`...). |
| `IncompleteLibraryClass/`  | Clases de librería que no proveen suficiente funcionalidad. |
| `MiddleMan/`               | Clases que solo delegan llamadas sin aportar lógica. |

---

## 🛠️ Cómo usar este repositorio

1. Explora cada carpeta por tipo de *code smell*.
2. Revisa el package `Before` para entender el problema.
3. Abre el package `After` para ver cómo refactorizar correctamente.
4. Usa estos ejemplos como referencia en tus propios proyectos o para fines educativos.

---

## 📚 Recursos recomendados

- 📘 *Refactoring: Improving the Design of Existing Code* – Martin Fowler
- 🌐 [https://refactoring.guru/](https://refactoring.guru/)

---

## 🧑‍💻 Autor

Proyecto educativo mantenido por [Joseph Miranda] 

---

