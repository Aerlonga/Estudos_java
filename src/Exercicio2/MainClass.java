package Exercicio2;

import java.util.Scanner;

public class MainClass {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.printf("Voce digitou: %s", x);

        sc.close();
    }
}
