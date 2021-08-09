public class Avion {
    private int numMotores;
    private int numCabina;
    
    public Avion(int numMotores, int numCabina) {
        this.numMotores = numMotores;
        this.numCabina = numCabina;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public int getNumCabina() {
        return numCabina;
    }

    public void setNumCabina(int numCabina) {
        this.numCabina = numCabina;
    }

    public static void Despegar(){
        System.out.println("Despegue");
    }
    public static void Aterrizar(){
        System.out.println("Aterrizar");
    }
}
