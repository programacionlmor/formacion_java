import java.util.Scanner; 

public class Conceptos {
    
    public static void main(String[] args) {        
       
        // declararVariables();
        // declararConstantes();
        // realizarOperaciones();
        // capturarDatos(); 
        // realizarDecisiones();
        // crearFunciones();
        // realizarCiclos();
        // crearArreglos();
        // operarCadenas();


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
            System.out.println("Mientras sea falsa la evaluación");
        }
        else{
            // Si la expresion es verdadera
            System.out.println("Mientras sea verdadera la evaluación");
            
        }


        
        // Precedencia de  operadores aritméticos
        // 1.  ()
        // 2.  * / %  Si hay varios del mismo tipo se evaluan de izquierda a derecha
        // 3.  + -    Se evaluan de izquierda a derecha.
        // 4   =      asignación se evalua de último.
                
        System.out.println((5 + ((20-2)/2) -12));


        
    }

    public static void capturarDatos() {

        // Flujos de Informacion

        System.out.println("Linea de Prueba");
        System.out.print("Otra linea pero sin salto de linea");
        System.out.println("Otra línea pero sin salto de línea" + "Otra cadena");

        // Clase Scanner

        // Ejemplo 1
        Scanner  miScanner;  // Create un objeto  Scanner
        String   nombre;
        String[] entrada; 
        double   salario,peso;
        int      edad;


        miScanner = new Scanner(System.in); // General para todos los ejemplos
   
        
        
        System.out.println("Digite salario, peso, edad ");
        
        entrada = miScanner.nextLine().split(" ");
        
        salario = Double.parseDouble(entrada[0]);
        peso    = Double.parseDouble(entrada[1]);
        edad    = Integer.parseInt(entrada[2]);  
        
        System.out.printf("Salario: %f Peso: %f  Edad:  %d ",salario,peso,edad);
        
        
        
        // Ejemplo 2
        
        //Ingresar cadena de caracteres
        System.out.println("\n Ingrese el nombre");
        nombre = miScanner.nextLine();  // Lee la entrada del usuario, como string
        System.out.println("Nombre " + nombre);  // Output user input

        //Ejemplo 3
      
        //int edad;
        int hijos;
        

        System.out.println("Ingrese edad e hijos");

        edad  = miScanner.nextInt();
        hijos = miScanner.nextInt();
        System.out.printf("Edad: %d Hijos: %d",edad,hijos);
       
        

    }

    public static void realizarDecisiones() {
        Scanner miScanner;                  // Create un objeto  Scanner
        String  entrada;
        

        miScanner = new Scanner(System.in); // General para todos los ejemplos


        System.out.println("\n Digite Nombre");
        entrada = miScanner.nextLine();

    
    
       //  If sencillo Python
       //  if (ladoUno != ladoDos) and (ladoDos != ladoTres) and (ladoUno != ladoTres):
       //     print ("El triángulo es escaleno")

    
        // Condicional simple 
        if (entrada.equals("pepe")){
            System.out.println("Hola: " + entrada);
        }



        // If-else Python
        // if (ladoUno != ladoDos) and (ladoDos != ladoTres) and (ladoUno != ladoTres):
        //     print ("El triángulo es escaleno")
        // else:
        //     print ("El triángulo no es escaleno")

        //Condicional doble
        if (entrada.equals("pepe")){
            System.out.println("Hola eres : " + entrada);
        }
        else{
            System.out.println("No eres pepe eres: " + entrada);
        }



        //  if-else anidado  Python
        //  if (ladoUno != ladoDos) and (ladoDos != ladoTres) and (ladoUno != ladoTres):
        //        print ("El triángulo es escaleno")
        //  else:
        //        if  (ladoUno == ladoDos == ladoTres):
        //            print ("El triángulo es equilátero ")
        //        else:
        //            print ("El triángulo es isósceles ")


        //Condicionales enlazados

        String[] entradaCompuesta;

        System.out.println("Digite Operacion y operandos");
        entradaCompuesta = miScanner.nextLine().split(" ");
                
        if (entradaCompuesta[0].equals("sumar")){
            System.out.println("suma carácteres:" + entradaCompuesta[1] + entradaCompuesta[2]);
            System.out.println("suma números:" +   Double.toString((Double.parseDouble(entradaCompuesta[1])+ Double.parseDouble(entradaCompuesta[2]))));
        }
        else {
            if (entradaCompuesta[0].equals("restar")){
                System.out.println("resta números:" +   Double.toString((Double.parseDouble(entradaCompuesta[1]) - Double.parseDouble(entradaCompuesta[2]))));
            }
            else {
                if (entradaCompuesta[0].equals("multiplicar")){
                    System.out.println("resta números:" +   Double.toString((Double.parseDouble(entradaCompuesta[1]) * Double.parseDouble(entradaCompuesta[2]))));   
                } 
                else {
                    System.out.println("Operación desconocida");
                }
            }

        }



        //  elif Python
        //  if (ladoUno != ladoDos) and (ladoDos != ladoTres) and (ladoUno != ladoTres):
        //      print ("El triángulo es escaleno")
        //  elif (ladoUno == ladoDos == ladoTres):
        //        print ("El triángulo es equilátero ")
        //  else:
        //       print ("El triángulo es isósceles ")
        
            //Condicionales enlazados elseif

        if (entradaCompuesta[0].equals("sumar")){
            System.out.println("suma carácteres:" + entradaCompuesta[1] + entradaCompuesta[2]);
            System.out.println("suma números:" +   Double.toString((Double.parseDouble(entradaCompuesta[1])+ Double.parseDouble(entradaCompuesta[2]))));
        } else if (entradaCompuesta[0].equals("restar")){
                  System.out.println("resta números:" +   Double.toString((Double.parseDouble(entradaCompuesta[1]) - Double.parseDouble(entradaCompuesta[2]))));
        } else if (entradaCompuesta[0].equals("multiplicar")){
        } else {  System.out.println("multiplica números:" +   Double.toString((Double.parseDouble(entradaCompuesta[1]) * Double.parseDouble(entradaCompuesta[2]))));   
                  System.out.println("Operación desconocida");
        }


        //switch

        switch(entradaCompuesta[0]){

            case "sumar":
                  System.out.println("suma números:" + Double.toString((Double.parseDouble(entradaCompuesta[1])+ Double.parseDouble(entradaCompuesta[2]))));
                  break;
            case "restar":
                 System.out.println("resta números:" + Double.toString((Double.parseDouble(entradaCompuesta[1]) - Double.parseDouble(entradaCompuesta[2]))));
                 break;
            case "multiplicar":
                  System.out.println("multiplica números:" + Double.toString((Double.parseDouble(entradaCompuesta[1]) * Double.parseDouble(entradaCompuesta[2]))));   
                  break;
            default:
                  System.out.println("Operación desconocida");

        }


     }

     public static void crearFunciones() {
        //Ejemplo Python
        //  def validarTriangulo(ladoUno:int,ladoDos:int,ladoTres:int) -> bool:
        //      """
        //      Parámetros: Recibe los lados enteros de un triángulo
        //      Retorna   : True:  indicando que es posible construir el triángulo
        //                  False: indicando que no es posible construir el triángulo
        //      """
            
        //      if (ladoUno + ladoDos > ladoTres) and (ladoUno + ladoTres > ladoDos) and (ladoDos + ladoTres > ladoUno):
        //          esPosibleTriangulo = True
        //      else:
        //          esPosibleTriangulo = False
        
        //      return esPosibleTriangulo



        // Ejemplo 1
        double valorA,valorB,valorC,menor,mayor;

        valorA = 1.2;
        valorB = 2.3;
        valorC = 5.2;
        
        // valorA = 2.2;
        // valorB = 5.3;
        // valorC = 1.2;
        

        menor = calcularMenor(valorA,valorB);
        System.out.println("El número menor es " + menor);

        // Ejemplo 2

        mayor= calcularMayor(valorA,valorB,valorC);
        System.out.println("El número mayor es " + mayor);
         
     }

    
    public static double calcularMenor(double valora, double valorb) {
       /* Estructura if-else
       if (valora < valorb) {
           menor = valora;
       }
       else{
           menor = valorb;
       }

       */


        double menor;
        menor = valora < valorb ? valora :  valorb;
        return menor;
    
    }

    
    public static double calcularMayor(double valora,double valorb,double valorc) {
        double mayor;
        mayor = valorc > (valora > valorb ? valora:valorb) ? valorc:((valora>valorb)?valora:valorb);
        return mayor;
    }


    public static void realizarCiclos () {
        
        // While python
        // controladorCiclo= 1
        // suma = 0
        
        // while (controladorCiclo <= 10):
        //        suma = suma + controladorCiclo
        //        controladorCiclo += 1
        
        // print("la suma es :",suma)
        
        
        
        // While
        int valorA = 0;
        int valorB = 5;

        while (valorA < valorB) {
            System.out.println("valorA es menor que valorB");
            valorA = valorA + 2;
        }

        System.out.println("valorA ya no es menor que valorB");


        // Do While
        
       Scanner miScanner = new Scanner(System.in);
       boolean salir = false;
       int     opcion; 
       
       do{
           System.out.println("1. Opcion 1");
           System.out.println("2. Opcion 2");
           System.out.println("3. Opcion 3");
           System.out.println("4. Salir");
           System.out.println("Escribe una de las opciones");
           opcion = miScanner.nextInt();

           switch(opcion){
            case 1:
                System.out.println("Has seleccionado la opcion 1");
                break;
            case 2:
                System.out.println("Has seleccionado la opcion 2");
                break;
             case 3:
                System.out.println("Has seleccionado la opcion 3");
                break;
             case 4:
                salir=true;
                break;
             default:
                System.out.println("Solo números entre 1 y 4");
        
            }
       } while(!salir);
               
       // For python
       //  Imprima los números impares de 1 a 10
       //  for numerosImpares in range(1, 11, 2):
       //       print(numerosImpares,end=" ")


       // For 

       for (int numeroImpar=1; numeroImpar <=10; numeroImpar+=2){
           System.out.println(numeroImpar);
       }
       

    }


    public static void crearArreglos() {
        //  La sintaxis:
        //  tipo[] nombre;
        
        //  nombre = new tipo[numeroDeElementos];
    
        //  En donde:
        //     tipo: el tipo de dato del arreglo
        //     nombre: la variable que tendrá el arreglo
        //     numeroDeElementos: la cantidad de elementos que tendrá el arreglo
         
            byte[]    unByte;    
            int[]     unEntero;  
            long[]    unLong;    
            double[]  unDoble;   
            float[]   unFloat;   
            boolean[] unBooleano;
            String[]  unString;  
            char[]    unCaracter; 
           
            unByte     = new byte[2];
            unEntero   = new int[3];
            unLong     = new long[3];
            unDoble    = new double[3];
            unFloat    = new float[3];
            unBooleano = new boolean[3];
            unString   = new String[] {"Hola","este","es"};
            unCaracter = new char[] {'a','b','c'};
    
    
            // LLenar el arreglo -Ejemplo 1 -
    
            unByte[0]= 1;
            unByte[0]= 2;
            System.out.println (unByte[0]);
    
    
            // LLenar el arreglo -Ejemplo 2 -
            Scanner miScanner;  // Create un objeto  Scanner
            int edad;
            
            miScanner = new Scanner(System.in); // General para todos los ejemplos
    
    
            for (int posicion = 0; posicion < unEntero.length; posicion++) {
                 System.out.println ("Digite valor :");
                 unEntero[posicion] = Integer.parseInt(miScanner.nextLine());
            
            }
        
           // recorrer el arreglo foreach
            
            int suma = 0;
            for (int contenido : unEntero){
                suma = suma + contenido;
            }
            System.out.println(suma);
 
 
            
           
    }
    
    public static void operarCadenas() {
        String  cadenaA,cadenaB,cadenaC,subCadena;
        boolean unBooleano;
        char    caracter;
        int     posicion;


        cadenaA     = "Java lenguaje";
        cadenaB     = "Java";
        unBooleano  = cadenaA.equals(cadenaB);
        unBooleano  = cadenaA.contains(cadenaB);
        subCadena   = cadenaA.substring(1,3);
        caracter    = cadenaA.charAt(2);
        posicion    = cadenaA.indexOf("l");
        posicion    = cadenaA.lastIndexOf("e");        
        unBooleano  = cadenaA.startsWith("Ja");
        subCadena   = cadenaA.replace("Java", "Pava");
        subCadena   = cadenaA.toLowerCase();
        subCadena   = cadenaA.toUpperCase();




    }


}
