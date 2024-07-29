public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("Ciudad A", "Ciudad B");

        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("Ciudad A", "Ciudad B");

        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("Ciudad A", "Ciudad B");

        gps.setRutaStrategy(new RutaConMenorEspera());
        gps.calcularRuta("Ciudad A", "Ciudad B");
    }
}