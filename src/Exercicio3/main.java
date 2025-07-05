package Exercicio3;

import java.util.Scanner;

//public class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String s1 = "", s2 = "", s3 = "";
//
//        System.out.printf("Digite os valores: %s %s %s\n", s1, s2, s3);
////        System.out.printf("Mensagem: %s %s %s\n", s1, s2, s3);
////        System.out.println(s2 = sc.nextLine());
////        System.out.println(s3 = sc.nextLine());
//
//        System.out.println("dados digitados: ");
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//    }
//}

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        String s1 = sc.nextLine();

        System.out.println("Digite o segundo valor: ");
        String s2 = sc.nextLine();

        System.out.println("Digite o terceiro valor: ");

        String s3 = sc.nextLine();

        System.out.println("Dados digitados: ");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
