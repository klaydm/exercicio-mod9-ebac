import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversaoNumerica {

    private int numeroPrimitivo;
    private Integer numeroWrapper;

    public Integer converterNumeros() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número primitivo: ");
        try {
            numeroPrimitivo = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor inválido digitado. Digite um número inteiro.");
            return null;
        }

        if (numeroPrimitivo > Integer.MAX_VALUE || numeroPrimitivo < Integer.MIN_VALUE) {
            System.out.println("Erro: Valor digitado está fora da faixa de valores válidos para um número inteiro.");
            return null;
        }

        numeroWrapper = Integer.valueOf(numeroPrimitivo);
        System.out.println("Valor convertido para o tipo wrapper: " + numeroWrapper);

        return numeroWrapper;

    }
}

