public class AvionCarga extends Avion{
    private double pesoMax;

    public AvionCarga(int numMotores, int numCabina, double pesoMax) {
        super(numMotores, numCabina);
        this.pesoMax = pesoMax;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }
    
}
