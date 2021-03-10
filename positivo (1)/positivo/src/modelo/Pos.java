package modelo;

public class Pos {
    public double numero;

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    public String num(){
       if(getNumero() >= 0){
            return "Numero positivo";
        } else if (getNumero()<0){
                return "Numero negativo";

        }
        return null;
    }
}
