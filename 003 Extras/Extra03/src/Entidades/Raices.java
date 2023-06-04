package Entidades;

public class Raices {

    private double coeficienteA;
    private double coeficienteB;
    private double coeficienteC;

    public Raices() {
    }

    public Raices(double coeficienteA, double coeficienteB, double coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    public double getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(double coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public double getCoeficienteB() {
        return coeficienteB;
    }

    public void setCoeficienteB(double coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public double getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteC(double coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

}
