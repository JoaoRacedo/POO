public class Datos_estudio {
    private String Nombre, nivel_contaminacion;
    private int tipo_lugar, trabajando;
    
    public Datos_estudio(String nombre, String nivel_contaminacion, int tipo_lugar, int trabajando) {
        Nombre = nombre;
        this.nivel_contaminacion = nivel_contaminacion;
        this.tipo_lugar = tipo_lugar;
        this.trabajando = trabajando;
    }

    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getNivel_contaminacion() {
        return nivel_contaminacion;
    }


    public void setNivel_contaminacion(String nivel_contaminacion) {
        this.nivel_contaminacion = nivel_contaminacion;
    }


    public int getTipo_lugar() {
        return tipo_lugar;
    }


    public void setTipo_lugar(int tipo_lugar) {
        this.tipo_lugar = tipo_lugar;
    }


    public int getTrabajando() {
        return trabajando;
    }


    public void setTrabajando(int trabajando) {
        this.trabajando = trabajando;
    }

    public int nivel_contaminacion(String nivel_contaminacion){
        if(nivel_contaminacion.toLowerCase().equals("nulo")){
            return 0;
        }else if(nivel_contaminacion.toLowerCase().equals("bajo")){
            return 1;
        }else if(nivel_contaminacion.toLowerCase().equals("medio")){
            return 2;
        }else if(nivel_contaminacion.toLowerCase().equals("alto")){
            return 3;
        }
        return -1;
    }
    
}
