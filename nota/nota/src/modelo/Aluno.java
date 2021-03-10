package modelo;

public class Aluno {
    public String nome;
    public double notaUm;
    public double notaDois;
    public double notaTres;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }
    public double calculoNotas(){
        return ((+getNotaUm()) + (+getNotaDois()) + (+getNotaTres())) / 3 ;
    }
    public String Resultado(){
        return "Nome do Aluno: "+getNome()+
                  "\nNota Final: "+ calculoNotas();
    }
}
