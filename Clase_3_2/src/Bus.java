public class Bus extends Vehiculo{
    private int numPuesto;
    private String tipoMotor;
    
    public Bus(int numPuesto, String tipoMotor) {
        this.numPuesto = numPuesto;
        this.tipoMotor = tipoMotor;
    }

    public int getNumPuesto() {
        return numPuesto;
    }

    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    
}
