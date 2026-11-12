public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor vacio
    public Libro() {
        this.disponible = true;
 }
    //constructor con titilo y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // constructor con titulo, autor y disponibilidad
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Setters
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("El título no puede estar vacío o ser nulo.");
        }
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método para mostrar la información del libro
    public void mostrarInformacion() {
        System.out.println("----Libro----");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }
    // Método para prestar el libro
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
            return true;
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible para préstamo.");
            return false;
        }
    }
    // Método para devolver el libro
    public boolean devolver() {
    disponible = true;
        System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
        return true;
    }
}