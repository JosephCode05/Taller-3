public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[] asientos;

    // constructor
    public Vuelo() {
     }
    // Al crear un vuelo, también se crean sus asientos.
    public Vuelo(String numero, String origen, String destino, int capacidadMaxima) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        this.asientos = new Asiento[capacidadMaxima];
        for (int i = 0; i < capacidadMaxima; i++) {
            String codigoAsiento = "A" + (i + 1);
            asientos[i] = new Asiento("A" + (i + 1));
        }
    }
    // getters
    public String getNumero() {
        return numero;
    }
    public void mostrarInformacion() {
        System.out.println("Vuelo " + numero + " - Origen: " + origen + ", Destino: " + destino + ", Capacidad máxima: " + capacidadMaxima);
    }
    //muestra el estado de los asientos del vuelo
    public void mostrarAsientos() {
        System.out.println("Asientos del vuelo " + numero + ":");
        for (Asiento a : asientos) {
            a.mostrarEstado();
        }
    }
    //busca un asiento por codigo y lo ocupa si está libre
    public void embarcar(String codigoAsiento) {
        for (Asiento a : asientos) {
            if (a.getCodigo().equals(codigoAsiento)) {
                a.ocupar();
                return;
            }
        }
        System.out.println("El asiento " + codigoAsiento + " no existe en el vuelo " + numero + ".");
    }
    //busca un asiento por codigo y lo desocupa si está ocupado
    public void desembarcar(String codigoAsiento) {
        for (Asiento a : asientos) {
            if (a.getCodigo().equals(codigoAsiento)) {
                a.desocupar();
                return;
            }
        }
        System.out.println("El asiento " + codigoAsiento + " no existe en el vuelo " + numero + ".");
    }
}