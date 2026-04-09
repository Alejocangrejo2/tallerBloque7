/**
 * Subclase de Publicacion que representa un Video.
 * Contiene el idioma (enumeracion) y la duracion en horas.
 */
public class Video extends Publicacion {

    private Idioma lenguaje;
    private float horas;

    // Constructor por defecto
    public Video() {
        super();
        this.lenguaje = Idioma.ESPAÑOL;
        this.horas = 0.0f;
    }

    // Constructor con parametros
    public Video(String elTitulo, double elPrecio, Idioma elLenguaje, float lasHoras) {
        super(elTitulo, elPrecio);
        this.lenguaje = elLenguaje;
        this.horas = lasHoras;
    }

    // Getters
    public Idioma getLenguaje() {
        return this.lenguaje;
    }

    public float getHoras() {
        return this.horas;
    }

    // Setters
    public void setLenguaje(Idioma elLenguaje) {
        this.lenguaje = elLenguaje;
    }

    public void setHoras(float lasHoras) {
        this.horas = lasHoras;
    }

    /**
     * Muestra los datos completos del video en consola.
     */
    @Override
    public void mostrar() {
        System.out.println("--- Datos del Video ---");
        super.mostrar();
        System.out.println("  Idioma: " + this.lenguaje.obtenerNombre());
        System.out.println("  Duracion: " + this.horas + " horas");
        System.out.println("-----------------------");
    }

    @Override
    public String toString() {
        return "Video [titulo=" + getTitulo() + ", precio=" + getPrecio()
                + ", idioma=" + lenguaje.obtenerNombre() + ", horas=" + horas + "]";
    }
}
