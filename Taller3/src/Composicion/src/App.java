public class App {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo("AC101", "Santiago", "Lima", 3);

        vuelo.mostrarInformacion();
        vuelo.mostrarAsientos();

        System.out.println("\n---- Embarque ----");
        vuelo.embarcar("A1");
        vuelo.embarcar("A2");
        vuelo.embarcar("A1");
        vuelo.mostrarAsientos();

        System.out.println("\n---- Desembarque ----");
        vuelo.desembarcar("A1");
        vuelo.mostrarAsientos();
    }
}
