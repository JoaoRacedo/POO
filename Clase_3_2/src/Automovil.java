public class Automovil extends Vehiculo{
    private int numPuesto;
    private String TipoMotor;
    public Automovil(int numPuesto, String tipoMotor) {
        this.numPuesto = numPuesto;
        TipoMotor = tipoMotor;
    }
    public int getNumPuesto() {
        return numPuesto;
    }
    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }
    public String getTipoMotor() {
        return TipoMotor;
    }
    public void setTipoMotor(String tipoMotor) {
        TipoMotor = tipoMotor;
    }

    

}
