public class App {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry");

        // Crear lectores
        Lector lector1 = new Lector("Juan Pérez", "123456789");
        Lector lector2 = new Lector("María López", "987654321");

        // cada lector toma prestado un libro
        lector1.tomarLibroPrestado(libro1);
        lector2.tomarLibroPrestado(libro2);

        // Mostrar estado inicial de los lectores
        System.out.println("\nEstado inicial de los lectores:");
        lector1.mostrarEstado();
        lector2.mostrarEstado();

        // intenta otro libro sin devolvwer el actual
        System.out.println("\nIntentando que Juan tome otro libro sin devolver el actual:");
        lector1.tomarLibroPrestado(libro2);

        //lector1 devuelve su libro y toma otro libro
        System.out.println("\nJuan devuelve su libro:");
        lector1.regresarLibro();
        System.out.println("\nMaría devuelve su libro:");
        lector2.regresarLibro();
        lector1.tomarLibroPrestado(libro2);
        System.out.println("\nJuan toma el libro: " + lector1.getLibroActual().getTitulo());
    }
}
