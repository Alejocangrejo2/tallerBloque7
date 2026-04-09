/**
 * Subclase de Publicacion que modela un Disco.
 * Agrega la duracion expresada en minutos.
 */
public class Disco extends Publicacion {

    private float minutos;

    // Constructor sin argumentos
    public Disco() {
        super();
        this.minutos = 0.0f;
    }

    // Constructor completo
    public Disco(String elTitulo, double elPrecio, float losMinutos) {
        super(elTitulo, elPrecio);
        this.minutos = losMinutos;
    }

    // Getter
    public float getMinutos() {
        return this.minutos;
    }

    // Setter
    public void setMinutos(float losMinutos) {
        this.minutos = losMinutos;
    }

    /**
     * Imprime los datos del disco en consola.
     */
    @Override
    public void mostrar() {
        System.out.println("--- Datos del Disco ---");
        super.mostrar();
        System.out.println("  Duracion: " + this.minutos + " min");
        System.out.println("-----------------------");
    }

    @Override
    public String toString() {
        return "Disco [titulo=" + getTitulo() + ", precio=" + getPrecio()
                + ", minutos=" + minutos + "]";
    }
}
