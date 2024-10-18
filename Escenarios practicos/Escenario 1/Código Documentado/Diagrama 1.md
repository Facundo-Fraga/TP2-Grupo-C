# Trabajo Práctico 1: Practica de UML

## Sistema de Biblioteca

Se desea modelar un sistema simplificado para una biblioteca. La biblioteca tiene libros que pueden ser prestados a los usuarios registrados. Cada usuario puede prestar varios libros, pero un libro solo puede estar en posesión de un usuario a la vez. Si el libro no está prestado, está disponible para el próximo usuario.

### 1. Diagrama

```mermaid
classDiagram

    class Libro {
        - String titulo
        - String autor
        - int paginas
        - EstadoLibro estado
    }

    class Usuario {
        - int id
        - String nombre
        + Prestamo prestarLibro(Libro libro)
        + Prestamo devolverLibro(Prestamo prestamo)
    }

    class Prestamo {
        - LocalDate fechaPrestamo
        - LocalDate fechaVencimiento
        - LocalDate fechaDevolucion
        - EstadoPrestamo estado
    }

    class EstadoLibro {
        <<Enumeration>>
        DISPONIBLE
        PRESTADO
    }

    class EstadoPrestamo {
        <<Enumeration>>
        ACTIVO
        COMPLETADO
    }
    
    Usuario "0" *-- "*" Prestamo : realiza
    Libro "0" *-- "1" Prestamo: incluido
    Libro --> EstadoLibro : usa
    Prestamo --> EstadoPrestamo : usa
```

### 2. Relaciones

- **Usuario y Préstamo (Composición):** Un Usuario realiza de 0 a muchos Préstamos. Si el Usuario desaparece, sus Préstamos también desaparecen.
- **Libro y Préstamo (Composición):** Un Libro está incluido en de 0 a muchos Préstamos. Si el Libro desaparece, sus Préstamos también desaparecen.
