import java.util.Scanner;
public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] conteo = new int[4]; // 0<- Nulo, 1<-Bajo, 2<-Medio, 3<-Alto
        Datos_estudio[] datos_vector = new Datos_estudio[n];
        for(int i = 0; i<n;i++){
            String[] datos = sc.nextLine().split(" ");
            datos_vector[i] = new Datos_estudio(datos[0], datos[2], Integer.parseInt(datos[1]), Integer.parseInt(datos[3]));
        }

        for(int i = 0; i<n;i++){
            int valor_correspondiente = datos_vector[i].nivel_contaminacion(datos_vector[i].getNivel_contaminacion());
            conteo[valor_correspondiente]++;
        }
        System.out.println("---------------Respuestas----------------");
        System.out.println("Nulo tiene: "+ conteo[0]);
        System.out.println("Bajo tiene: "+ conteo[1]);
        System.out.println("Medio tiene: "+ conteo[2]);
        System.out.println("Alto tiene: "+ conteo[3]);
    }

}
