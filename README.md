# ALGORITHMIC BENCHMARK Y BIG-O ANALYSIS

Facultad de Ingenieria en Sistemas  
Universidad Da Vinci de Guatemala  

---

## 📌 DESCRIPCION GENERAL

Este proyecto es una herramienta diseñada para medir y analizar el rendimiento computacional de algoritmos fundamentales.  
A través de un motor de Benchmark, se comparan implementaciones iterativas frente a recursivas, evaluando el impacto del uso de memoria (Memory Stack) y validando experimentalmente las curvas de crecimiento de la notación Big-O.

---

## 📂 ESTRUCTURA DEL PROYECTO

Copia exactamente este bloque para que se vea alineado en GitHub:

```
ProyectoED_Demo/
|-- bin/                       # Archivos compilados (.class)
|-- src/                       # Codigo fuente del proyecto
|   |-- algorithms/            # Implementaciones de logica
|   |   |-- Factorial.java
|   |   |-- Fibonacci.java
|   |   |-- BusquedaLineal.java
|   |   `-- OrdenamientoBurbuja.java
|   `-- benchmark/             # Motor de medicion
|       `-- Main.java          # Punto de entrada principal
|-- docs/                      # Documentacion y graficas
|   |-- Graficas_Excel.png
|   `-- Reporte_Tecnico.pdf
`-- README.md                  # Guia del repositorio
```

---

## 🧠 ALGORITMOS ANALIZADOS

### A1 - Factorial
**Categoria:** Aritmetico  
**Complejidad:** O(n)

### A2 - Fibonacci
**Categoria:** Sucesion  
**Complejidad:** O(n) vs O(2^n)

### A3 - Busqueda Lineal
**Categoria:** Busqueda  
**Complejidad:** O(n)

### A4 - Ordenamiento Burbuja
**Categoria:** Ordenacion  
**Complejidad:** O(n^2)

---

## ⚙️ GUIA DE INSTALACION Y EJECUCION

### 1️⃣ Clonar el repositorio

```
git clone https://github.com/CristoferPatricio/ProyectoED_Demo.git
cd ProyectoED_Demo
```

### 2️⃣ Compilacion (CLI)

```
javac -d bin src/algorithms/*.java src/benchmark/*.java
```

### 3️⃣ Ejecucion

```
java -cp bin benchmark.Main
```

---

## 📊 RESULTADOS Y ENTREGABLES

**Graficas:** Visualizacion de crecimiento cuadratico y exponencial en Excel.  

**Reporte:** Documentacion tecnica detallada en PDF.  

**Video:** [Pega aqui tu enlace de YouTube]

---

## 👨‍💻 AUTOR

**Nombre:** Cristofer Patricio  
**Carne:** 202500553  
**Institucion:** Universidad Da Vinci de Guatemala  

---

© 2026 Cristofer Patricio - Todos los derechos reservados.
