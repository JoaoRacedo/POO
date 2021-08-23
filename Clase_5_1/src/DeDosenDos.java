public class DeDosenDos implements Series, Constantes{
    int iniciar;
    int valor;

    public DeDosenDos() {
        iniciar = 0;
        valor = 0;
    }

    public int getNext(){
        valor +=2;
        return valor;
    }
    public void reiniciar(){
        valor = iniciar;
    }

    public void setStart(int inicio){
        iniciar = inicio;
        valor = inicio;
    }
    // Ejemplo uso static
    public static String NombreSerie(){
        return "Serie de dos en dos";
    }

    // Ejemplo poli sobrecarga de metodos
    public int Numero(int num){
        return num;
    }
    public int Numero(int h,int dato){
        return h*dato;
    }
}
