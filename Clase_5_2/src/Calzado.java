public class Calzado extends Producto implements Vista_metodo3{

    private int Talla;

    public Calzado(int talla) {
        Talla = talla;
    }

    public int getTalla() {
        return Talla;
    }
    public void setTalla(int talla) {
        Talla = talla;
    }

    @Override
    public void metodo3() {
        // TODO Auto-generated method stub
        System.out.println("metodo3");
        
    }

    @Override
    public boolean Solicitar_pedido() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public double Calcular_total_pagar(int cantyidad) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
