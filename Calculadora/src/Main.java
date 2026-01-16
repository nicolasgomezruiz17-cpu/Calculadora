import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int numero1;
    static int numero2;
    static int dato;
    static boolean repetir =true;
    static boolean verificar =true;
    static String palabra;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        boolean bandera = true;
        Suma resultadoSuma = new Suma();
        Resta resultadoResta = new Resta();
        Multiplicacion resultadoMultiplicacion = new Multiplicacion();
        Division resultadoDivision = new Division();
        Potencia resultadoPotencia = new Potencia();
        while(!(bandera = false)){
            mostrarMenu();
            switch (getdato()){
                case 1:
                    while(repetir=true){
                        suma();
                        resultadoSuma.suma(getNumero1(),getNumero2());
                        repetirOperacion(getpalabra());
                        break;
                    }
                    break;
                case 2:
                    resta();
                    resultadoResta.resta(getNumero1(),getNumero2());
                    break;

                case 3:
                    multiplicacion();
                    resultadoMultiplicacion.multiplicacion(getNumero1(),getNumero2());
                    break;

                case 4:
                    division();
                    resultadoDivision.division(getNumero1(),getNumero2());
                    break;

                case 5:
                    potencia();
                    resultadoPotencia.potencia(getNumero1(),getNumero2());
                    break;

                case 6:
                    bandera = false;
                    break;
            }

        }
        System.out.println("||=====================================||");
        System.out.println("||   GRACIAS POR USAR MI CALCULADORA   ||");
        System.out.println("||=====================================||");



    }
    public static void mostrarMenu(){
        System.out.println("||====================||");
        System.out.println("||     Calculadora    ||");
        System.out.println("||====================||");
        System.out.println("||1. Suma             ||");
        System.out.println("||2. Resta            ||");
        System.out.println("||3. Multiplicación   ||");
        System.out.println("||4. División         ||");
        System.out.println("||5. Potencia         ||");
        System.out.println("||6. Salir             ||");
        System.out.println("||====================||");
        System.out.println("||  POR FAVOR SELECCIONE UNA OPCIÓN: ");
        dato = entrada.nextInt();
    }

    public static int getdato(){
        return dato;
    }

    public static void repetirOperacion(String palabra) {
        System.out.println("|| PARA SALIR AL MENU PRINCIPAL TECLEE (SALIR)");
        palabra = entrada.nextLine();
        entrada.nextLine();
        if (palabra.equalsIgnoreCase("SALIR")) {
            verificar = false;
        } else {
            verificar = true;
        }
    }

    public static String getpalabra(){
        return palabra;
    }

    public static void suma(){
        System.out.println("||============================================||");
        System.out.println("||     HAZ SELECCIONADO LA OPCIÓN DE SUMA     ||");
        System.out.println("||============================================||");
        System.out.println("||  POR FAVOR ESCRIBA EL PRIMER NÚMERO: ");
        numero1 = entrada.nextInt();
        System.out.println("||  POR FAVOR ESCRIBA EL SEGUNDO NÚMERO: ");
        numero2 = entrada.nextInt();
    }

    public static int getNumero1() {
        return numero1;
    }
    public static int getNumero2(){
        return numero2;
    }

    public static void resta(){
        System.out.println("||============================================||");
        System.out.println("||     HAZ SELECCIONADO LA OPCIÓN DE RESTA    ||");
        System.out.println("||============================================||");
        System.out.println("||  POR FAVOR ESCRIBA EL PRIMER NÚMERO: ");
        numero1 = entrada.nextInt();
        System.out.println("||  POR FAVOR ESCRIBA EL SEGUNDO NÚMERO: ");
        numero2 = entrada.nextInt();
    }

    public static void multiplicacion(){
        System.out.println("||======================================================||");
        System.out.println("||     HAZ SELECCIONADO LA OPCIÓN DE MULTIPLICACIÓN     ||");
        System.out.println("||======================================================||");
        System.out.println("||  POR FAVOR ESCRIBA EL PRIMER NÚMERO: ");
        numero1 = entrada.nextInt();
        System.out.println("||  POR FAVOR ESCRIBA EL SEGUNDO NÚMERO: ");
        numero2 = entrada.nextInt();
    }
    public static void division(){
        System.out.println("||================================================||");
        System.out.println("||     HAZ SELECCIONADO LA OPCIÓN DE DIVISIÓN     ||");
        System.out.println("||================================================||");
        System.out.println("||  POR FAVOR ESCRIBA EL PRIMER NÚMERO: ");
        numero1 = entrada.nextInt();
        System.out.println("||  POR FAVOR ESCRIBA EL SEGUNDO NÚMERO: ");
        numero2 = entrada.nextInt();
    }

    public static void potencia(){
        System.out.println("||================================================||");
        System.out.println("||     HAZ SELECCIONADO LA OPCIÓN DE POTENCIA     ||");
        System.out.println("||================================================||");
        System.out.println("||  POR FAVOR ESCRIBA EL PRIMER NÚMERO: ");
        numero1 = entrada.nextInt();
        System.out.println("||  POR FAVOR ESCRIBA EL NÚMERO AL QUE QUIERE ELEVARLO: ");
        numero2 = entrada.nextInt();
    }

}


