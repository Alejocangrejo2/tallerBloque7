/**
 * Enumeracion que define los idiomas disponibles para un Video.
 */
public enum Idioma {
    ESPAÑOL,
    INGLES,
    PORTUGUES;

    /**
     * Retorna el nombre del idioma en formato legible.
     */
    public String obtenerNombre() {
        switch (this) {
            case ESPAÑOL: return "Español";
            case INGLES: return "Inglés";
            case PORTUGUES: return "Portugués";
            default: return "Desconocido";
        }
    }
}