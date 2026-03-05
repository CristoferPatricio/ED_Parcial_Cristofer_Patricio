============================================================

ALGORITHMIC BENCHMARK Y BIG-O ANALYSIS

============================================================

Facultad de Ingenieria en Sistemas | Universidad Da Vinci de Guatemala

DESCRIPCION GENERAL

Este proyecto es una herramienta disenada para medir y analizar el rendimiento computacional de algoritmos fundamentales. A traves de un motor de Benchmark, comparamos implementaciones iterativas frente a recursivas, evaluando el impacto del uso de la memoria (Memory Stack) y validando experimentalmente las curvas de crecimiento de la notacion Big-O.

ESTRUCTURA DEL PROYECTO (Rutas)

Aqui se detalla la organizacion de las carpetas y archivos para facilitar la navegacion:

ProyectoED_Demo/
├── bin/                       # Archivos compilados (.class)
├── src/                       # Codigo fuente del proyecto
│   ├── algorithms/            # Implementaciones de logica
│   │   ├── Factorial.java
│   │   ├── Fibonacci.java
│   │   ├── BusquedaLineal.java
│   │   └── OrdenamientoBurbuja.java
│   └── benchmark/             # Motor de medicion
│       └── Main.java          # Punto de entrada principal
├── docs/                      # Documentacion y graficas
│   ├── Graficas_Excel.png
│   └── Reporte_Tecnico.pdf
└── README.md                  # Guia del repositorio


ALGORITMOS ANALIZADOS Y COMPLEJIDAD

Se midieron los siguientes algoritmos segun su categoria:

A1 - Factorial

Categoria: Aritmetico | Complejidad: O(n)

A2 - Fibonacci

Categoria: Sucesion | Complejidad: O(n) vs O(2^n)

A3 - Busqueda Lineal

Categoria: Busqueda | Complejidad: O(n)

A4 - Ordenamiento Burbuja

Categoria: Ordenacion | Complejidad: O(n^2)

TECNOLOGIAS Y REQUISITOS

Lenguaje: Java 17 o superior.

Entorno: Visual Studio Code / IntelliJ IDEA.

Documentacion: Reporte tecnico en formato PDF.

Analisis: Microsoft Excel para generacion de graficas.

GUIA DE INSTALACION Y EJECUCION

1. Clonar el repositorio

git clone [https://github.com/CristoferPatricio/ProyectoED_Demo.git](https://github.com/CristoferPatricio/ProyectoED_Demo.git)
cd ProyectoED_Demo


2. Compilacion (CLI)

Para compilar todas las clases y generar los binarios:

javac -d bin src/algorithms/*.java src/benchmark/*.java


3. Ejecucion del Benchmark

Para iniciar las pruebas de rendimiento:

java -cp bin benchmark.Main


RESULTADOS Y VISUALIZACIONES

Graficas de Tendencia: Visualizacion de crecimiento cuadratico y exponencial.

Reporte Tecnico: Justificacion de resultados y analisis propio.

Datos Crudos: Tiempos de las 5 ejecuciones realizadas.

Video de Presentacion: [Enlace a YouTube] (Reemplaza con tu link)

AUTOR

Nombre: Cristofer Patricio

Carne: 202500553

Carrera: Ingenieria en Sistemas

Institucion: Universidad Da Vinci de Guatemala

(c) 2026 Cristofer Patricio - Todos los derechos reservados.
