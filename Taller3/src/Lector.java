public class Lector {
    private String nombre;
    private String cedula;
    private Libro libroActual;

    // Constructor vacío
    public Lector() {
    }
    public Lector(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    // getters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Libro getLibroActual() {
        return libroActual;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setLibroActual(Libro libroActual) {
        this.libroActual = libroActual;
    }

    //tomar libro prestado
    public void tomarLibroPrestado(Libro libro) {
        if (libroActual != null) {
            System.out.println("El lector " + nombre + " ya tiene un libro prestado: " + libroActual.getTitulo()+". Debe devolverlo antes de tomar otro.");
        }else {
            if (libro.prestar()) {
                libroActual = libro;
            }
        }
}

    //devolver libro
    public void regresarLibro() {
        if (libroActual == null) {
            System.out.println("El lector " + nombre + " no tiene ningún libro prestado.");
        } else {
            libroActual.devolver();
            libroActual = null;
        }
    }

    //mostrar el estado del lector
    public void mostrarEstado() {
        String estadoLibro = (libroActual != null) ? libroActual.getTitulo() : "Ninguno";
        System.out.println("lector: " + nombre + " | cédula: " + cedula + " | libro prestado: " + estadoLibro);
}

}