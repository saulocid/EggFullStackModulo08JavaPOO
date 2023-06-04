package Entidades;

public class Arreglo {
    
    private double[] A = new double[50];
    private double[] B = new double[20];

    public Arreglo() {
    }
    
    public Arreglo(double [] A, double [] B) {
        this.A = A;
        this.B = B;
    }

    public double[] getA() {
        return A;
    }

    public void setA(double[] A) {
        this.A = A;
    }

    public double[] getB() {
        return B;
    }

    public void setB(double[] B) {
        this.B = B;
    }
    
}
