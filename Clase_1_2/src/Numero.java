public class Numero {
    // Atributos de la clase Numero
    int i; 
    String s;

    public static void main(String[] args){

        Numero n; 
        // Declaracion de una variable tipo objeto. Como Java no conoce el tamaño inicial
        // solo crea la variable apuntador que inicia apuntado a nada o al null
        n = new Numero();
        // Instanciación de la variable n. Se crear una estructura en memoria que permite 
        // alojar los atributos. SOLO los atributos primitivos pueden usarse.
        // Los atributos tipo objeto se incializan con null;
        System.out.println("La direccio de memoria de la variable es:" + n);
        System.out.println("El atributo i de la variable n inicia con el valor de:"+ n.i); 
        System.out.println("El atributo s de la variable n inicia con el valor de:"+ n.s);  
        System.out.println("");
        n.i = 10;
        n.s = "Hola";
        System.out.println("El atributo i de la variable n inicia con el valor de:"+ n.i); 
        System.out.println("El atributo s de la variable n inicia con el valor de:"+ n.s);  
        System.out.println("");
        Numero n1 = new Numero();
        System.out.println("La direccio de memoria de la variable es:" + n1);
        System.out.println("El atributo i de la variable n1 inicia con el valor de:"+ n1.i); 
        System.out.println("El atributo s de la variable n1 inicia con el valor de:"+ n1.s);  
        System.out.println("");

        n = n1;
        System.out.println("La direccio de memoria de la variable es:" + n);
        System.out.println("El atributo i de la variable n inicia con el valor de:"+ n.i); 
        System.out.println("El atributo s de la variable n inicia con el valor de:"+ n.s);  
        System.out.println("La direccio de memoria de la variable es:" + n1);
        System.out.println("El atributo i de la variable n1 inicia con el valor de:"+ n1.i); 
        System.out.println("El atributo s de la variable n1 inicia con el valor de:"+ n1.s);  
        System.out.println("");
        n.i = 10;
        n.s = "Hi";
        n1.i = 20;
        n1.s = "Konichiwa";
        System.out.println("El atributo i de la variable n inicia con el valor de:"+ n.i); 
        System.out.println("El atributo s de la variable n inicia con el valor de:"+ n.s);  
        System.out.println("El atributo i de la variable n1 inicia con el valor de:"+ n1.i); 
        System.out.println("El atributo s de la variable n1 inicia con el valor de:"+ n1.s);  
        System.out.println("");
    }
}
