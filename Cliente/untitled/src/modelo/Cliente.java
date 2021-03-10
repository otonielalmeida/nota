package modelo;

public class Cliente {
    String nome;
    int idade;
    double renda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    public String classificarIdade(){
        if(getIdade() > 17){
            return "Maior de idade";
        }else{
            return "Menor de idade";
        }
    }
    public String classificarRenda(){
        if(getRenda() > 15000){
            return "Rico";
        }else{
        }return "Nao rico";
    }
}
