public class calc {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);

        double resultado = "-".equals(args[1]) ? num1 - num2 : 0;
        resultado = "+".equals(args[1]) ? num1 + num2 : resultado;
        resultado = "*".equals(args[1]) ? num1 * num2 : resultado;
        resultado = "/".equals(args[1]) ? num1 / num2 : resultado;
        resultado = "%".equals(args[1]) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f\n", num1, args[1], num2, resultado);
    }
}
