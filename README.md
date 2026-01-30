
# TicTacToe

Un juego interactivo por dos jugadores, para jugar directamente en vuestro terminal !

## 🛠️ Tecnologías Utilizadas

- **Java 21** – Lenguaje de programación principal  
- **Maven** – Gestión de dependencias y ciclo de vida del proyecto  
- **JUnit** – Pruebas unitarias  
- **GitHub** – Control de versiones y repositorio  
- **Jira** – Gestión de tareas y seguimiento del proyecto  
- **Lucidchart** – Diagramas de arquitectura y flujo  

---

## 📂 Estructura del Proyecto
```
src/
├── main/
│ └── java/
│ └── com/tictactoe/
│ ├── App.java # Clase principal de ejecución
│ ├── Board.java # Lógica del tablero de juego
│ ├── Colors.java # Manejo de colores en consola
│ ├── Counter.java # Contador de turnos o movimientos
│ ├── Game.java # Control principal del flujo del juego
│ └── Player.java # Representación del jugador
│
├── test/
│ └── java/
│ └── com/tictactoe/
│ ├── AppTest.java # Pruebas de la clase App
│ ├── BoardTest.java # Pruebas unitarias del tablero
│ ├── GameTest.java # Pruebas de la lógica del juego
│ └── PlayerTest.java # Pruebas de la entidad Player
│
├── target/
│ ├── classes/ # Clases compiladas
│ └── test-classes/ # Clases de pruebas compiladas
│
├── pom.xml # Configuración de Maven
└── README.md # Documentación del proyecto
```
---

## ⚙️ Instalación

1. Clonar el repositorio:  
```bash
git clone https://github.com/Eva-87/Proyecto-TicTacToe.git
```
## 📊 Diagramas y Documentación

El proyecto incluye diagramas de arquitectura y flujo creados con **Lucidchart**, que describen el funcionamiento de la aplicación:

<details>
<summary>Ver detalles de diagramas</summary>

- Inicio de la aplicación
- Flujo de una partida
- Asignación aleatoria de jugadores (X y O)
- Validación de coordenadas
- Control de turnos
- Condiciones de victoria y empate
- Contador de partidas
- Finalización o reinicio del juego

📄 **Diagrama de flujo del juego (PDF)**:  
👉 [Ver diagrama en PDF](#)

</details>

---

## 👩‍💻 Equipo de Desarrollo

- Manon Godfroy
- María Eva Martín
- Guadalupe Peña
- Ingrid

---

## 🤝 Metodología de Trabajo

Se utilizó **Mob Programming**, con roles rotativos:

- **Driver**: escribe el código
- **Navigator**: guía la lógica y revisa el código
- **Designated Navigator**: valida decisiones técnicas y buenas prácticas

**Beneficios de esta metodología:**

- Mejora de la calidad del código
- Compartición de conocimiento entre el equipo
- Reducción de errores y duplicidad de trabajo
- Mantener una visión común del proyecto

---

## 🎨 Experiencia de Usuario en Terminal (ANSI Colors)

Aunque no tiene interfaz gráfica, la UX fue optimizada usando **colores ANSI**:

- Diferenciación visual de mensajes informativos, errores y acciones
- Mejor legibilidad del tablero y del estado de la partida
- Guía al usuario durante la interacción por consola
- Experiencia de juego más intuitiva y agradable

> Una buena UX no depende solo de la interfaz gráfica, también puede lograrse en la terminal.
