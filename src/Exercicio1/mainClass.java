package Exercicio1;

public class mainClass {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double prince1 = 2100.00;
        double prince2 = 650.50;

        System.out.println("Products: ");
        System.out.println(product1 + ", which price is $ " + prince1);
        System.out.println(product2 + ", witch price is $ " + prince2);
        System.out.println("Record: " + age + " years old, " + "code " + code + " and gender: " + gender);
        System.out.printf("Record: %d years old, code %s and gender: %s%n", age, code, gender);
    }

    //%d = numero inteiro
    //%s = string
    //%n = quebra de linha
}