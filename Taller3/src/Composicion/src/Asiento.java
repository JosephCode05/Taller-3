public class Asiento {
    private String codigo;
    private boolean ocupado;

// constructor
    public Asiento(String codigo) {
        this.codigo = codigo;
        this.ocupado = false;
    }
    // getter
    public String getCodigo() {
        return codigo;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    // setter
    public void ocupar() {
        if (ocupado) {
            System.out.println("El asiento " + codigo + " ya está ocupado.");
        } else {
            ocupado = true;
            System.out.println("El asiento " + codigo + " ha sido ocupado.");
        }
    }
    // método para desocupar el asiento
    public void desocupar() {
        if (ocupado) {
            ocupado = false;
            System.out.println("El asiento " + codigo + " ya está libre.");
        }

    }
    public void mostrarEstado() {
        System.out.println("El asiento " + codigo + " está " + (ocupado ? "ocupado" : "libre") + ".");
    }
    
}