package Exercicio5;

import java.util.Scanner;


//Pede o nome e a idade da pessoa pelo Scanner
//
//Se a idade for > = 18, exibe “Maior de idade”.
//
//Se não, exibe “Menor de idade”.

//public class exercicio5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite o seu nome: ");
//        String nome = sc.nextLine();
//        System.out.println("Digite o sua idade: ");
//        int idade = sc.nextInt();
//
//        System.out.println("Seu nome: ");
//
//        if (idade >= 18){
//            System.out.println("Maior de idade.");
//        }
//        else{
//            System.out.println("Menor de idade.");
//        }
//    }
//}


//Pede o nome e a idade de 3 pessoas (use um laço for).
//
//Depois, exibe para cada uma se é maior ou menor de idade.
//
//(Opcional) Mostre ao final a média das idades.

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome da terceira pessoa: ");
        String nome3 = sc.nextLine();

        System.out.print("Digite a idade da terceira pessoa: ");
        int idade3 = sc.nextInt();
        sc.nextLine();

        String[] arrayDeNomes = {nome1, nome2, nome3};

        int[] arrayDeIdades = {idade1, idade2, idade3};

        int soma = 0;

        for (int i = 0; i < arrayDeIdades.length; i++) {
            System.out.print(arrayDeNomes[i] + " - ");

            if (arrayDeIdades[i] >= 18) {
                System.out.println("Maior de idade.");
            }
            else{
                System.out.println("Menor de idade.");
            }
            soma += arrayDeIdades[i];
        }

        double media = (double) soma / arrayDeIdades.length;

        System.out.println("A media das idade é: " + media);
    }
}


















































