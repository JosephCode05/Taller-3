public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", true);
        Libro libro3 = new Libro();
        libro3.setTitulo("La casa de los espíritus");
        libro3.setAutor("Isabel Allende");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        biblioteca.mostrarCatalogo();
        biblioteca.buscarPorAutor("Gabriel García Márquez");

        System.out.println("\n---- Préstamo y devolución ----");
        libro1.prestar();
        libro1.prestar();
        libro1.mostrarInformacion();
        libro1.devolver();
        libro1.mostrarInformacion();
    }
}
