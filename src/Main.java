import java.util.Scanner;

/**
 * Clase principal del programa.
 * Permite al usuario registrar publicaciones de tipo Libro, Disco y Video.
 */
public class Main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   Sistema de Registro de Publicaciones");
        System.out.println("========================================\n");

        // ---- Registro del Libro ----
        System.out.println(">> Ingrese los datos del LIBRO:");

        System.out.print("   Titulo: ");
        String tituloLibro = lector.nextLine();

        System.out.print("   Precio: ");
        double precioLibro = lector.nextDouble();

        System.out.print("   Numero de paginas: ");
        int paginasLibro = lector.nextInt();

        System.out.print("   Año de publicacion: ");
        int anioLibro = lector.nextInt();

        Libro objLibro = new Libro(tituloLibro, precioLibro, paginasLibro, anioLibro);
        System.out.println();
        objLibro.mostrar();

        // Limpiar el buffer
        lector.nextLine();

        // ---- Registro del Disco ----
        System.out.println("\n>> Ingrese los datos del DISCO:");

        System.out.print("   Titulo: ");
        String tituloDisco = lector.nextLine();

        System.out.print("   Precio: ");
        double precioDisco = lector.nextDouble();

        System.out.print("   Duracion (minutos): ");
        float minDisco = lector.nextFloat();

        Disco objDisco = new Disco(tituloDisco, precioDisco, minDisco);
        System.out.println();
        objDisco.mostrar();

        // Limpiar el buffer
        lector.nextLine();

        // ---- Registro del Video ----
        System.out.println("\n>> Ingrese los datos del VIDEO:");

        System.out.print("   Titulo: ");
        String tituloVideo = lector.nextLine();

        System.out.print("   Precio: ");
        double precioVideo = lector.nextDouble();

        System.out.print("   Duracion (horas): ");
        float horasVideo = lector.nextFloat();

        System.out.println("   Seleccione un idioma:");
        System.out.println("     1 -> Español");
        System.out.println("     2 -> Inglés");
        System.out.println("     3 -> Portugués");
        System.out.print("   Opcion: ");
        int seleccion = lector.nextInt();

        Idioma idiomaElegido;
        switch (seleccion) {
            case 1:
                idiomaElegido = Idioma.ESPAÑOL;
                break;
            case 2:
                idiomaElegido = Idioma.INGLES;
                break;
            case 3:
                idiomaElegido = Idioma.PORTUGUES;
                break;
            default:
                System.out.println("   * Opcion invalida. Se asigna Español.");
                idiomaElegido = Idioma.ESPAÑOL;
                break;
        }

        Video objVideo = new Video(tituloVideo, precioVideo, idiomaElegido, horasVideo);
        System.out.println();
        objVideo.mostrar();

        // Resumen final
        System.out.println("\n========================================");
        System.out.println("         Resumen de publicaciones");
        System.out.println("========================================");
        System.out.println(objLibro);
        System.out.println(objDisco);
        System.out.println(objVideo);
        System.out.println("========================================");

        lector.close();
    }
}
