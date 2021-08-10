public class App {
    public static void main(String[] args) throws Exception {

        final String LENGUA = "Español";


        Pais paisColombia, paisBrasil,paisChile;
        String nombrePais;

        // Crear un objeto pais
        paisColombia = new Pais("Colombia", LENGUA, 55);

        // Recuperar los atributos del objeto

        System.out.println(paisColombia.getNombre());
        System.out.println(paisColombia.getLengua());
        System.out.println(paisColombia.getPoblacion());

        // Modificar el valor de las propiedades de un objeto

        paisColombia.setPoblacion(56);

        // Censar la población de colombia
        
        nombrePais = paisColombia.getNombre();
        paisColombia.censarPoblacion(nombrePais);
    }
}
