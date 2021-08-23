public class App implements Constantes{
    public static void main(String[] args) throws Exception {
        System.out.println("Comienza "+prueba);
        DeDosenDos obj = new DeDosenDos();

        for(int i = 0; i<max;i++)
            System.out.println("The next element of the serie is: "+ obj.getNext());
    
        System.out.println("\nRestarting");
        obj.reiniciar();
        obj.setStart(100);
        for(int i = 0; i<min;i++)
            System.out.println("The next element of the serie is: "+ obj.getNext());
        // Ejemplo uso static
        System.out.println("\n"+DeDosenDos.NombreSerie());
        System.out.println(obj.NombreSerie());
        // Ejemplo poli sobrecarga de metodos
        System.out.println(obj.Numero(5));
        System.out.println(obj.Numero(5,5));
    }
}
