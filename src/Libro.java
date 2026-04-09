/**
 * Subclase de Publicacion que representa un Libro.
 * Incluye numero de paginas y año de publicacion.
 */
public class Libro extends Publicacion {

    private int paginas;
    private int anio;

    // Constructor vacio
    public Libro() {
        super();
        this.paginas = 0;
        this.anio = 0;
    }

    // Constructor con todos los datos
    public Libro(String elTitulo, double elPrecio, int lasPaginas, int elAnio) {
        super(elTitulo, elPrecio);
        this.paginas = lasPaginas;
        this.anio = elAnio;
    }

    // Getters
    public int getPaginas() {
        return this.paginas;
    }

    public int getAnio() {
        return this.anio;
    }

    // Setters
    public void setPaginas(int lasPaginas) {
        this.paginas = lasPaginas;
    }

    public void setAnio(int elAnio) {
        this.anio = elAnio;
    }

    /**
     * Muestra toda la informacion del libro por consola.
     */
    @Override
    public void mostrar() {
        System.out.println("--- Datos del Libro ---");
        super.mostrar();
        System.out.println("  Paginas: " + this.paginas);
        System.out.println("  Año: " + this.anio);
        System.out.println("-----------------------");
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + getTitulo() + ", precio=" + getPrecio()
                + ", paginas=" + paginas + ", anio=" + anio + "]";
    }
}
