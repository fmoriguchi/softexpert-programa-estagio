package calc;

import java.util.Arrays;
import java.util.Scanner;

public class CalculadoraConsole {

    public static void main(String args[]) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número:");
            double n1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double n2 = scanner.nextDouble();

            System.out.println("Informe a operação:\n"+Arrays.toString(Operacoes.values()));

            String choosed = scanner.next();
            Operacoes op = Operacoes.valueOf(choosed.toUpperCase());

            double result = op.calcula(n1, n2);
            System.out.printf("Resultado da %s é %.02f\n", op.getNome(), result);
            
        }finally {
            System.out.println("Fim!");
        }
    }
}
