package Exercicio4;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor para a primeira soma: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o primeiro valor para a primeira soma: ");
        int n2 = sc.nextInt();

        int soma1 = n1 + n2;

        int[] numeros = new int[3];

        System.out.println("Digite o primeiro valor para a segunda soma: ");
        numeros [0] = sc.nextInt();
        System.out.println("Digite o segundo valor para a segunda soma: ");
        numeros [1] = sc.nextInt();
        System.out.println("Digite o terceiro valor para a segunda soma: ");
        numeros [2] = sc.nextInt();

        int soma2 = numeros[0] + numeros[1] + numeros[2];

        System.out.println("Resultado primeira soma: " + soma1);

        System.out.println("Resultado segunda soma: " + soma2);


    }
}
