public class ConversorMonedas {
    private static final double DOLAR_A_EURO = 0.85;
    private static final double PESO_A_DOLAR = 0.05;
    public static double dolaresAEuros(double dolares) {
        return dolares * DOLAR_A_EURO;
    }
    public static double eurosADolares(double euros) {
        return euros / DOLAR_A_EURO;
    }
    public static double pesosADolares(double pesos) {
        return pesos * PESO_A_DOLAR;
    }
    public static double dolaresAPesos(double dolares) {
        return dolares / PESO_A_DOLAR;
    }
}
