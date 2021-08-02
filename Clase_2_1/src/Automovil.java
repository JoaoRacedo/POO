public class Automovil {
    // Definicion de atributos
    private String placa, marca, modelo, serialMotor, propietario;
    private int numPasajeros;

    // Constructor
    public Automovil(String placa, String marca, String modelo, String serialMotor, String propietario,
            int numPasajeros) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.serialMotor = serialMotor;
        this.propietario = propietario;
        this.numPasajeros = numPasajeros;
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerialMotor() {
        return serialMotor;
    }

    public void setSerialMotor(String serialMotor) {
        this.serialMotor = serialMotor;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
}
