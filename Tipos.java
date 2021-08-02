import java.util.Scanner; 


public class Tipos {

    public static void main(String[] args) {
//        declararVariables();
//        declararConstantes();
//        realizarOperaciones();
          capturarDatos();

    }

    
    public static void declararVariables() {
        byte    unByte      = 126;
        int     unEntero    = 30;
        long    unLong      = 1000000L;
        double  unDoble     = 4.5d;
        float   unFloat     = 0.12223f;
        boolean unBooleano  = true;
        String  unString    = "java";
        char    unCaracter  = 'a';
       
        System.out.printf("%d %d %d %f %f %b %s %c",unByte,unEntero,unLong,unDoble,unFloat,unBooleano,unString,unCaracter);

    }

    public static void  declararConstantes() {

        final double NUMERO_PI = 3.1415926;
        System.out.printf("\n %f",NUMERO_PI);
    }

    public static void realizarOperaciones() {
        // Operadores Aritméticos
        // Operador Unario
        int valor  = -2;
        int valorA = 1;
        int valorB = 1;

        System.out.printf("\n %d", -valor);
        System.out.printf("\n %d", +valor);

        // Operadores Aritméticos
        System.out.printf("\n %f", 2.5 + 7.1);
        System.out.printf("\n %d", 235 - 10);
        System.out.printf("\n %d", 80 * 4);        
        System.out.printf("\n %f",(float) 1/3);
        System.out.printf("\n %d", 20 % 7);

        System.out.println( Math.pow(5,2));
        System.out.println( Math.sqrt(25));
        System.out.println( Math.pow(8,(1/3.0)));
        

        // Operadores predecremento y postdecremento
        // ++ variable;
        // variable ++;
        // -- variable;
        // variable --;
        valor = 0;
        System.out.printf("\n %d",valor++);
        valor = 0;
        System.out.printf("\n %d",++valor);
        valor = 0;
        System.out.printf("\n %d",valor--);
        valor = 0;
        System.out.printf("\n %d",--valor);

        //Operadores aritméticos combinados
        valor = 0;
        valor = valor + 1;
        System.out.printf("\n %d",valor);
        valor +=1;
        System.out.printf("\n %d",valor);
        valor = valor - 1;
        System.out.printf("\n %d",valor);
        valor -=1;
        System.out.printf("\n %d",valor);
        valor = 10;
        valor = valor * 2;
        System.out.printf("\n  %d",valor);
        valor *=2;
        System.out.printf("\n %d",valor);
        valor = valor/2;
        System.out.printf("\n %d",valor);
        valor /=2;
        System.out.printf("\n %d",valor);
        valor = valor %2;
        System.out.printf("\n %d",valor);
        valor %=2;
        System.out.printf("\n %d",valor);


        //Operadores relacionales
        if (valorA == valorB){
            System.out.println("\n Valor de A es igual a valor de B");
        } 
      
        valorA= 5;
        if (valorA != valorB){
            System.out.println("Valor de A diferente a Valor de B");
        } 
        
        if (valorA >= valorB){
            System.out.println("Valor de A mayor o igual al Valor de B");
        } 
        valorA= 1;
        if (valorA <= valorB){
            System.out.println("Valor de A menor o igual a Valor de B");
        } 


        // Operadores lógicos booleanos 

        if ((5>3) && (5<8)){
            System.out.println("La expresión es verdadera");
        }

        if ((5>3) || (5<8)){
            System.out.println("La expresión es verdadera");
        }
               
        if  (!(5>3)){
            //Si la expresion es falsa
            System.out.println("La expresión es verdadera");
        }
        else{
            // Si la expresion es verdadera
        }


        
        // Precedencia de  operadores aritméticos
        // 1.  ()
        // 2.  * / %  Si hay varios del mismo tipo se evaluan de izquierda a derecha
        // 3.  + -    Se evaluan de izquierda a derecha.
        // 4   = asignación se evalua de ultimo.
                
        System.out.println((5 + ((20-2)/2) -12));


        
    }

    public static void capturarDatos() {

        // Flujos de Informacion

        // System.out.println("Linea de Prueba");
        // System.out.print("Otra linea pero sin salto de linea");
        // System.out.println("Otra línea pero sin salto de línea" + "Otra cadena");

        // Clase Scanner

        // Ejemplo 1
        // Scanner miScanner;  // Create un objeto  Scanner
        // String nombre;
        

        // miScanner = new Scanner(System.in); // General para todos los ejemplos

        // Ingresar cadena de caracteres
        // System.out.println("Ingrese el nombre");
        // nombre = miScanner.nextLine();  // Lee la entrada del usuario
        // System.out.println("Nombre " + nombre);  // Output user input

        //Ejemplo 2


        // Scanner miScanner;  // Create un objeto  Scanner
        // miScanner = new Scanner(System.in); // General para todos los ejemplos

        // int edad;
        // int hijos;
        

        // System.out.println("Ingrese edad e hijos");

        // edad  = miScanner.nextInt();
        // hijos = miScanner.nextInt();
        // System.out.printf("Edad: %d Hijos: %d",edad,hijos);
       
        // Ejemplo 3

        String[] entrada; 
        Double salario,peso;
        int edad;

        Scanner miScanner;  // Create un objeto  Scanner
        miScanner = new Scanner(System.in); // General para todos los ejemplos

        System.out.println("Digite salario, peso, edad ");
        
        entrada = miScanner.nextLine().split(" ");
        
        salario = Double.parseDouble(entrada[0]);
        peso = Double.parseDouble(entrada[1]);
        edad = Integer.parseInt(entrada[2]);  
        
        System.out.printf("Salario: %f Peso: %f  Edad:  %d",salario,peso,edad);

    }
    
}

