# Taller Bloque 7 - Herencia y Polimorfismo en Java

## Información general
| Campo | Detalle |
|-------|---------|
| **Estudiante** | David Alejandro Tutalcha Cabrera|
| **Asignatura** | Diseño de Software |
| **Tema** | Polimorfismo |

---

## Descripción del ejercicio

El objetivo de este taller es poner en práctica los conceptos de **herencia** y **polimorfismo** dentro del paradigma de Programación Orientada a Objetos (POO).

### Planteamiento

Se requiere modelar un sistema para una editorial que maneja diferentes tipos de publicaciones. La clase base **Publicacion** contiene los atributos comunes: `titulo` (cadena de texto) y `precio` (valor decimal).

A partir de ella se derivan tres subclases:

1. **Libro** → agrega `numeroPaginas` (entero), `anioPublicacion` (entero) y `precio` (flotante).
2. **Disco** → agrega `duracionMinutos` (flotante) y `precio` (entero).
3. **Video** → agrega `idioma` (enumeración: español, inglés, portugués) y `duracionHoras` (flotante).

Todas las clases implementan el método `mostrar()` para visualizar la información en consola.

## Diagrama de clases
<img width="1425" height="591" alt="image" src="https://github.com/user-attachments/assets/501a2bb5-b04d-42fb-937a-283e933942e5" />

## Cómo ejecutar

```bash
cd src
javac *.java
java Main
```

## Estructura del proyecto

```
tallerBloque7/
├── README.md
└── src/
    ├── Main.java
    ├── Publicacion.java
    ├── Libro.java
    ├── Disco.java
    ├── Video.java
    └── Idioma.java
```
