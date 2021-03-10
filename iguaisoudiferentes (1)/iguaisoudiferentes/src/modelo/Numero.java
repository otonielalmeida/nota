package modelo;

public class Numero {
    public double a;
    public double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    public String ab(){
        if(getA() == getB()) {
            return "Numeros iguais";
        }else {
            return "Diferentes";
        }
    }
}
