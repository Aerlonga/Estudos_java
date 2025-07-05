package Classes;

public class Pessoa {
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isMaiordeIdade() {
        return idade >=18;
    }

    public String getMaiordeIdade(){
        if (isMaiordeIdade()){
            return "Maior de idade!";
        }
        else{
            return "Menor de idade!";
        }
    }

//    public String isMaiordeIdade(){
//        if (idade >= 18) {
//            return "Maior de idade!";
//        }
//        else {
//            return "Menor de idade!";
//        }
//    }
}
