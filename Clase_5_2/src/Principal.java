import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op = 0, cantidadProductos = 0;;
        Producto[] vectorProductos = null; 
        double TotalPago = 0.0;
        while(op != 7){
            Menu();
            System.out.println("Digite la opcion que desea realizar");
            op = Integer.parseInt(sc.nextLine());
            if (op != 7 && op != 0 && vectorProductos == null){
                System.out.println("Primero debe registrar los productos");
            }else{
                switch(op){
                    case 0: // Registrar productos
                        System.out.println("Digite la cantidad de productos a registrar");
                        cantidadProductos = Integer.parseInt(sc.nextLine());
                        vectorProductos = Prendas.readData(cantidadProductos, sc);
                        break;
                    case 1: // Verificar existencia de productos
                        break;
                    case 2: // Producto Mayor cantidad
                        Producto.ImprimirMayor(vectorProductos);
                        break;
                    case 3: // Mostrar total a pagar dado un codigo
                        TotalPago = Producto.CalcularTotalPedido(vectorProductos, sc);
                        System.out.println("El total a pagar es: "+ TotalPago);
                        break;
                    case 4: // Modificar cantidad minima dado un codigo

                        break;
                    case 5: // Vender producto
                        break;
                    case 6:
                        System.out.println("Bodega");
                        Producto.MostrarBodega(vectorProductos);
                    case 7:
                        System.out.println("Termina programa");
                        break;
                    default:
                        System.out.println("La opcion no es valida");
                }
            }
        }
    }

    public static void Menu(){
        System.out.println("-----------------------------------");
        System.out.println("-----0. Registrar productos  ------");
        System.out.println("-----1. Verificar necesidad  ------");
        System.out.println("-----2. Indicar Mayor cant . ------");
        System.out.println("-----3. Realizar pedido      ------");
        System.out.println("-----4. Modificar Cantidad M.------");
        System.out.println("-----5. Vender producto      ------");
        System.out.println("-----6. Mostrar Bodega       ------");
        System.out.println("-----7. Salir                ------");
        System.out.println("-----------------------------------");
    }

    public static void LimpiarPantalla(){
        System.out.flush();;
    }
}
