public class Biblioteca {
    private String nombre;
    private Libro[] Catalogo;
    private int cantidad;

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.Catalogo = new Libro[10]; // Capacidad máxima de 10 libros
        this.cantidad = 0;
    }
    // Getters
    public String getNombre() {
        return nombre;
    }
    // Método para agregar un libro al catálogo
    public void agregarLibro(Libro libro) {
        if (cantidad < Catalogo.length) {
            Catalogo[cantidad] = libro;
            cantidad++;
            System.out.println("Libro agregado al catálogo: " + libro.getTitulo());
        } else {
            System.out.println("El catálogo está lleno. No se puede agregar más libros.");
        }
    }
    //imprime todos los libros del catalogo
    public void mostrarCatalogo() {
        System.out.println("----Catálogo: " + nombre + "----");
     if (cantidad == 0) {
            System.out.println("El catálogo está vacío.");
        } else {
            for (int i = 0; i < cantidad; i++) {
                Catalogo[i].mostrarInformacion();
                System.out.println();
            }
        }
    }
    // buscar libros por autor
    public void buscarPorAutor(String autor) {
        System.out.println("----Libros del autor: " + autor + "----");
        boolean encontrado = false;
        for (int i = 0; i < cantidad; i++) {
            if (Catalogo[i].getAutor().equalsIgnoreCase(autor)) {
                System.out.println("--" + Catalogo[i].getTitulo() + " --");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron libros del autor: " + autor);
        }
    }
}
