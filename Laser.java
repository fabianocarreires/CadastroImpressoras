package aula07_2010;

public class Laser extends Impressora {
    private double capacidadeToner;
    private boolean frenteVerso;
          

    public double getCapacidadeToner() {
        return capacidadeToner;
    }

    public void setCapacidadeToner(double capacidadeToner) {
        this.capacidadeToner = capacidadeToner;
    }

    public boolean isFrenteVerso() {
        return frenteVerso;
    }

    public void setFrenteVerso(boolean frenteVerso) {
        this.frenteVerso = frenteVerso;
    }
    
}
