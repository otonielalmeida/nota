package modelo;

public class Circunferencia {
    public double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double diametro(){
        return +getRaio() + (+getRaio());
    }
    public double quadrante(){
        return (3.14 * diametro() / 4);
    }
    public String Total(){
        return "Diametro: "+diametro()+
                "\nUm Quadrante: "+quadrante();
    }

}
