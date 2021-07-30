public class Principal {
    public static void main(String[] args){
       /* Numero_class n = new Numero_class();
        n.i = 10;
        n.s = "Hola";
        System.out.println(n.i);
        Numero_class n1 = new Numero_class();
        n1.i = 20;
        n1.s = "Hola";
        System.out.println(n1.i);
        */
        Numero_class n = new Numero_class(10, "Hola"); 
        Numero_class n1 = new Numero_class(20,"Hi"); 
        System.out.println(n.s +" "+ n1.s);
    }
}
