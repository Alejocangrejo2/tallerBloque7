/**
 * Clase base que representa una publicacion generica de la editorial.
 * Almacena los datos comunes: titulo y precio.
 */
public class Publicacion {

    // Atributos protegidos para que las subclases puedan acceder
    private String titulo;
    private double precio;

    // Constructor por defecto
    public Publicacion() {
        this.titulo = "Sin titulo";
        this.precio = 0.0;
    }

    // Constructor parametrizado
    public Publicacion(String elTitulo, double elPrecio) {
        this.titulo = elTitulo;
        this.precio = elPrecio;
    }

    // Metodo para mostrar informacion basica
    public void mostrar() {
        System.out.println("  Titulo: " + this.titulo);
        System.out.println("  Precio: $" + this.precio);
    }

    // Getters y Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}
