package calculadoracli;

public class CalculadoraCLI {

    public static void main(String[] args) {

        String operacao = args[0];
        String strX = args[1];
        String strY = args[2];

        if (operacao.equals("soma")){
            int[] nums = parseNumerosInteiros(strX, strY);
            soma(nums[0], nums[1]);

        }

        else if (operacao.equals("subtração")) {
            int[] nums = parseNumerosInteiros(strX, strY);
            subtracao(nums[0], nums[1]);
        }

        else if (operacao.equals("multiplicação")) {
            int[] nums = parseNumerosInteiros(strX, strY);
            multiplicacao(nums[0], nums[1]);
        }

        else if (args[0].equals("divisão")) {
            double x = Double.parseDouble(args[1]);
            double y = Double.parseDouble(args[2]);
            divisao(x, y);
        }

    }

    static int[] parseNumerosInteiros(String str1, String str2) {
        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);

        int[] numeros = {x, y};
        return numeros;
    }

    static void soma(int x, int y) {

        System.out.println("O resultado da soma é " + (x + y));

    }

    static void subtracao(int x, int y) {

        System.out.println("O resultado da subtração é " + (x - y));

    }

    static void multiplicacao(int x, int y) {

        System.out.println("O resultado da multiplicação é " + (x * y));

    }

    static void divisao(double x, double y) {

        System.out.println("O resultado da divisão é " + (x / y) + " com resto " + (x % y));

    }

} 