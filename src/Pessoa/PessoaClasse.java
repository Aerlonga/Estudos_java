package Pessoa;
import Classes.Pessoa;
import java.util.Scanner;

public class PessoaClasse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Testando classe e método");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        Pessoa p = new Pessoa();
        p.setNome(nome);
        p.setIdade(idade);

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Maior de idade? " + p.getMaiordeIdade());


    }
}
