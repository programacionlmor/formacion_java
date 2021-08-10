public class Pais{
    private  String nombre;
    private  String lengua;
    private  double poblacion;

    public Pais(String nombre, String lengua, double poblacion) {
        this.nombre = nombre;
        this.lengua = lengua;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLengua() {
        return this.lengua;
    }

    public void setLengua(String lengua) {
        this.lengua = lengua;
    }

    public double getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }
  
    public void censarPoblacion (String nombre){
        System.out.printf("Vamos a censar la población de %s",nombre);
    }

}