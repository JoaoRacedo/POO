public abstract class Figura {
    private int NumLados;

    public Figura(int numLados) {
        this.NumLados = numLados;
    }

    public void Hola(){
        System.out.println("Hola");
    }

    public abstract double suma(double a,double b);
}
