public class DesafioTemperatura {

    public static void main(String[] args) {
        double tempC = 26.4;
        double tempF = (tempC * 1.8) + 32;

        System.out.printf("\nA temperatura de %f Celsius é equivalente a %f Fahrenheit\n", tempC, tempF);
        System.out.println("A temperatura em Fahrenheit inteira é: " + (int) tempF);
    }
}
