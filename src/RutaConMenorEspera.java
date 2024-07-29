public class RutaConMenorEspera implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB) {
        return "Ruta con menor espera en semáforos entre " + puntoA + " y " + puntoB;
    }
}