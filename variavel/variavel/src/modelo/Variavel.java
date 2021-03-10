package modelo;

public class Variavel {
    public double var;

    public double getVar() {
        return var;
    }

    public void setVar(double var) {
        this.var = var;
    }
    public double dobro(){
        return +getVar() * 2;
    }
    public double triploDobro(){
        return +dobro() * 3;
    }
    public double metadeTriplo(){
        return +triploDobro() / 2;
    }
    public double quadrado(){
        return +getVar() * +getVar();
    }
    public double quinta(){
        return +dobro() / 5;
    }
    public String Total(){
        return "Dobro: "+dobro()+
                "\nTriplo do dobro: "+triploDobro()+
                "\nMetade do triplo do dobro: "+metadeTriplo()+
                "\nQuadrado: "+quadrado()+
                "\nQuinta parte do dobro: "+quinta();
    }
}
