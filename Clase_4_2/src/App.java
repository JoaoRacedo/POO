public class App {
    public static void main(String[] args) throws Exception {
       Triangulo triangulo= new Triangulo(3); 
       System.out.println(triangulo.suma(5, 10));
       Cuadrado cuadrado = new Cuadrado(4);
       System.out.println(cuadrado.suma(5, 10));
       Figura rectangulo = new Cuadrado(4);
       System.out.println(rectangulo.suma(2, 2));
    }
}
