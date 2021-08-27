import java.util.Scanner;

public class Prendas extends Producto implements Vistas{
    private String Talla[];
    private boolean Permite_plancado;


    public String[] getTalla() {
        return Talla;
    }

    public void setTalla(String[] talla) {
        Talla = talla;
    }

    public boolean isPermite_plancado() {
        return Permite_plancado;
    }

    public void setPermite_plancado(boolean permite_plancado) {
        Permite_plancado = permite_plancado;
    }
    @Override
    public boolean Solicitar_pedido(){
        return false;
    }
    @Override
    public double Calcular_total_pagar(int cantyidad){
        return 0.0;
    }

    @Override
    public void metodo3() {
        // TODO Auto-generated method stub
        System.out.println("metodo3");
        
    }

    @Override
    public void metodo1() {
        // TODO Auto-generated method stub
        System.out.println(this.getCodigo());
        
    }

    @Override
    public void metodo2() {
        // TODO Auto-generated method stub
        System.out.println("metodo2");
        
    }

    public static Prendas[] readData(int cantidadPrenda, Scanner leer){
        String linea_datos, datos[];
        Prendas resultado[], prodTemp;
        resultado = new Prendas[cantidadPrenda];

        for(int i = 0; i<cantidadPrenda;i++){
            System.out.println("Digite los datos del Prenda separado por espacio");
            //Codigo PrecioCompra PrecioVenta CantidadBodega CantidadMinima CantidadMaxima
            // Talla PermitePlancado 
            linea_datos = leer.nextLine();
            datos = linea_datos.split(" ");
            
            prodTemp = new Prendas();
            prodTemp.setCodigo(datos[0]);
            prodTemp.setPrecioCompra(Double.parseDouble(datos[1]));
            prodTemp.setPrecioVenta(Double.parseDouble(datos[2]));
            prodTemp.setCantidadBodega(Integer.parseInt(datos[3]));
            prodTemp.setCantidadMinima(Integer.parseInt(datos[4]));
            prodTemp.setCantidadMaxima(Integer.parseInt(datos[5]));
            //String tallas[] = {datos[6]};
            prodTemp.setTalla(new String[]{datos[6]});
            prodTemp.setPermite_plancado(Boolean.parseBoolean(datos[7]));
            prodTemp.metodo1();
            resultado[i] = prodTemp;

            
        }
        return resultado;
    } 

}
