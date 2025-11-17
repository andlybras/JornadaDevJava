public class NutricionistaDigital {

    public static void main(String[] args) {

        String genero = args[0];
        float massa = Float.parseFloat(args[1]);
        float altura = Float.parseFloat(args[2]);
        float idade = Float.parseFloat(args[3]);

        if (genero.equals("M") || genero.equals("m")) {

            imc(massa, altura);
            tmbM(massa, altura, idade);

        }

        else if (genero.equals("F") || genero.equals("f")) {

            imc(massa, altura);
            tmbF(massa, altura, idade);

        }

    }

    static void imc(float massa, float altura) {

        float alturaMetros = altura / 100.0f;

        float resultadoIMC = massa / (alturaMetros * alturaMetros);
        System.out.println("O IMC do paciente é " + resultadoIMC);

    }

    static void tmbM(float massa, float altura, float idade) {

         float CONS1 = 88.36f;
         float CONS2 = 13.4f;
         float CONS3 = 4.8f;
         float CONS4 = 5.7f;

         float tmbM = CONS1 + (CONS2 * massa) + (CONS3 * altura) - (CONS4 * idade);
        System.out.println("O TMB do paciente é " + tmbM);

    }

    static void tmbF(float massa, float altura, float idade) {

        float CONS1 = 447.6f;
        float CONS2 = 9.2f;
        float CONS3 = 3.1f;
        float CONS4 = 4.3f;

        float tmbF = CONS1 + (CONS2 * massa) + (CONS3 * altura) - (CONS4 * idade);
        System.out.println("O TMB do paciente é " + tmbF);

    }

}