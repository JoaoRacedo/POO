public class AvionGuerra extends Avion{
    private String armamento;
    private boolean misil;

    public AvionGuerra(int numMotores, int numCabina, String armamento, boolean misil) {
        super(numMotores, numCabina);
        this.armamento = armamento;
        this.misil = misil;
    }
    public String getArmamento() {
        return armamento;
    }
    public void setArmamento(String armamento) {
        this.armamento = armamento;
    }
    public boolean isMisil() {
        return misil;
    }
    public void setMisil(boolean misil) {
        this.misil = misil;
    }
    
    public static void Reconocimiento(){
        System.out.println("Reconociendo");
    }

    public static void Disparar(){
        System.out.println("pew pew");
    }
}
