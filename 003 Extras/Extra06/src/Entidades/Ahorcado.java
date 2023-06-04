package Entidades;

public class Ahorcado {

    private String[] buscar;
    private String[] espejo;
    private int encontradas;
    private int jugadasMax;
    private String acumulador;

    public Ahorcado() {
    }

    public Ahorcado(String[] buscar, String[] espejo, int encontradas, int jugadasMax, String acumulador) {
        this.buscar = buscar;
        this.espejo = espejo;
        this.encontradas = encontradas;
        this.jugadasMax = jugadasMax;
        this.acumulador = acumulador;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public String[] getEspejo() {
        return espejo;
    }

    public void setEspejo(String[] espejo) {
        this.espejo = espejo;
    }

    public String getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(String acumulador) {
        this.acumulador = acumulador;
    }

}
