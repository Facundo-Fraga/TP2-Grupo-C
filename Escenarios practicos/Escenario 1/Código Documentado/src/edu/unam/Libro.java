package edu.unam;

/**
 * La clase Libro representa un libro dentro del sistema de biblioteca. 
 * Contiene información sobre el título, autor, número de páginas, y el estado del libro.
 */
public class Libro {

    /**
     * El título del libro.
     */
    private String titulo;

    /**
     * El autor del libro.
     */
    private String autor;

    /**
     * El número de páginas del libro.
     */
    private int paginas;

    /**
     * El estado del libro, que indica si está disponible, prestado, etc.
     * Por defecto, se inicializa en DISPONIBLE.
     */
    private EstadoLibro estado = EstadoLibro.DISPONIBLE;

    /**
     * Constructor para crear un nuevo libro con un título, autor y número de páginas.
     * 
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param paginas El número de páginas del libro.
     * @throws IllegalArgumentException si el título, autor están en blanco o si el número de páginas es menor que 1.
     */
    public Libro(String titulo, String autor, int paginas) {
        if(!titulo.isBlank() && !autor.isBlank() && paginas >= 1){
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
        } else {
            throw new IllegalArgumentException("VALOR EN BLANCO O NULO");
        }
    }

    /**
     * Devuelve el título del libro.
     * 
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el autor del libro.
     * 
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Devuelve el número de páginas del libro.
     * 
     * @return El número de páginas del libro.
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * Devuelve el estado actual del libro.
     * 
     * @return El estado del libro (por ejemplo, DISPONIBLE, PRESTADO).
     */
    public EstadoLibro getEstado() {
        return estado;
    }

    /**
     * Establece un nuevo estado para el libro.
     * 
     * @param estado El nuevo estado del libro.
     */
    public void setEstado(EstadoLibro estado) {
        this.estado = estado;
    }
}
