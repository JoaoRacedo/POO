public class Camioneta extends Automovil{
    private double capacidadCarga;
    private boolean is4x4;

    
    public Camioneta(int numPuesto, String tipoMotor, double capacidadCarga) {
        super(numPuesto, tipoMotor);
        this.capacidadCarga = capacidadCarga;
    }
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public boolean isIs4x4() {
        return is4x4;
    }
    public void setIs4x4(boolean is4x4) {
        this.is4x4 = is4x4;
    }

    
}
