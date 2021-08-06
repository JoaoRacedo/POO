import java.util.Scanner;
public class Producto {
    private String Codigo;
    private double PrecioCompra;
    private double PrecioVenta;
    private int CantidadBodega;
    private int CantidadMinima;
    private int CantidadMaxima;
    private final double PorcentajeDcto = 5.0;

    public String getCodigo() {
        return this.Codigo;
    }
    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }
    public double getPrecioCompra() {
        return this.PrecioCompra;
    }
    public void setPrecioCompra(double precioCompra) {
        this.PrecioCompra = precioCompra;
    }
    public double getPrecioVenta() {
        return this.PrecioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.PrecioVenta = precioVenta;
    }
    public int getCantidadBodega() {
        return this.CantidadBodega;
    }
    public void setCantidadBodega(int cantidadBodega) {
        this.CantidadBodega = cantidadBodega;
    }
    public int getCantidadMinima() {
        return this.CantidadMinima;
    }
    public void setCantidadMinima(int cantidadMinima) {
        this.CantidadMinima = cantidadMinima;
    }
    public int getCantidadMaxima() {
        return this.CantidadMaxima;
    }
    public void setCantidadMaxima(int cantidadMaxima) {
        this.CantidadMaxima = cantidadMaxima;
    }
    public double getPorcentajeDcto() {
        return this.PorcentajeDcto;
    }
    
    public static Producto[] readData(int cantidadProducto, Scanner leer){
        String linea_datos, datos[];
        Producto resultado[], prodTemp;
        resultado = new Producto[cantidadProducto];

        for(int i = 0; i<cantidadProducto;i++){
            System.out.println("Digite los datos del producto separado por espacio");
            // Codigo PrecioCompra PrecioVenta CantidadBodega CantidadMinima CantidadMaxima
            linea_datos = leer.nextLine();
            datos = linea_datos.split(" ");
            
            prodTemp = new Producto();
            prodTemp.setCodigo(datos[0]);
            prodTemp.setPrecioCompra(Double.parseDouble(datos[1]));
            prodTemp.setPrecioVenta(Double.parseDouble(datos[2]));
            prodTemp.setCantidadBodega(Integer.parseInt(datos[3]));
            prodTemp.setCantidadMinima(Integer.parseInt(datos[4]));
            prodTemp.setCantidadMaxima(Integer.parseInt(datos[5]));

            resultado[i] = prodTemp;
        }
        return resultado;
    }
    public static double CalcularTotalPedido(Producto[] vectorProductos, Scanner leer) {
        int cantidadApedir;
        String codProducto;
        System.out.println("Digite el codigo del producto a pedir");
        codProducto = leer.nextLine();
        System.out.println("Digite la cantidad del codigo a pedir");
        cantidadApedir = Integer.parseInt(leer.nextLine());

        for (int i = 0; i < vectorProductos.length; i++){
            if (vectorProductos[i].getCodigo().equals(codProducto)){
                vectorProductos[i].setCantidadBodega(vectorProductos[i].getCantidadBodega() - cantidadApedir);
                return vectorProductos[i].CalcularTotal(cantidadApedir);
                //return (vectorProductos[i].getPrecioVenta() - (vectorProductos[i].getPrecioVenta()*(vectorProductos[i].getPorcentajeDcto()/100))) * cantidadApedir;
            }
        }
        return 0;
    }
    public double CalcularTotal(int cantidadApedir) {
        return (this.PrecioVenta - (this.PrecioVenta * (this.PorcentajeDcto/100))) *cantidadApedir;
    }
    public static void MostrarBodega(Producto[] vectorProductos) {
        for(int i = 0; i < vectorProductos.length ; i++)
            System.out.println(vectorProductos[i].getCodigo() + " "+vectorProductos[i].getCantidadBodega());
    }
}
