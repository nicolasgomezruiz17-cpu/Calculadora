import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static double numero1;
    static double numero2;
    static int dato;
    static boolean verificar =true;
    static boolean bandera = true;
    static String palabra;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        boolean bandera = true;
        Suma resultadoSuma = new Suma();
        Suma historial = new Suma();
        Resta resultadoResta = new Resta();
        Multiplicacion resultadoMultiplicacion = new Multiplicacion();
        Division resultadoDivision = new Division();
        Potencia resultadoPotencia = new Potencia();
        do {
            mostrarMenu();
            switch (getdato()){
                case 1:
                    do {
                        suma();
                        resultadoSuma.suma(getNumero1(),getNumero2());
                        repetirOperacion();
                    }
                    while(verificar);

                    break;
                case 2:
                    do {
                        resta();
                        resultadoResta.resta(getNumero1(),getNumero2());
                        repetirOperacion();
                    }
                    while (verificar);

                    break;

                case 3:
                    do {
                        multiplicacion();
                        resultadoMultiplicacion.multiplicacion(getNumero1(),getNumero2());
                        repetirOperacion();
                    }
                    while (verificar);


                    break;


                case 4:
                    do {
                        division();
                        resultadoDivision.division(getNumero1(),getNumero2());
                        repetirOperacion();
                    }
                    while (verificar);


                    break;


                case 5:
                    do {
                        potencia();
                        resultadoPotencia.potencia(getNumero1(),getNumero2());
                        repetirOperacion();
                    }
                    while (verificar);


                    break;

                case 6:
                    historialMenu();
                    resultadoSuma.mostrarHistorial();
                    resultadoDivision.mostrarhistorial();
                    resultadoPotencia.mostrarhistorial();
                    resultadoMultiplicacion.mostrarhistorial();
                    resultadoResta.mostrarhistorial();
                    repetirOperacion();
                    break;


                case 7:
                    bandera = false;
                    break;
            }

        }while (bandera);


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
        System.out.println("||6. Historial        ||");
        System.out.println("||7. Salir            ||");
        System.out.println("||====================||");
        System.out.println("||  POR FAVOR SELECCIONE UNA OPCIÓN: ");
        dato = entrada.nextInt();
    }

    public static int getdato(){
        return dato;
    }

    public static void repetirOperacion() {
        System.out.println("|| PARA SALIR AL MENU PRINCIPAL TECLEE (SALIR)");
        palabra = entrada.next();
        if (palabra.equalsIgnoreCase("Salir")){
            verificar = false;
        }else{
            verificar = true;
        }
    }



    public static void suma(){
        System.out.println("||============================================||");
        System.out.println("||     HAZ SELECCIONADO LA OPCIÓN DE SUMA     ||");
        System.out.println("||============================================||");
        System.out.println("||  POR FAVOR ESCRIBA EL PRIMER NÚMERO: ");
        numero1 = entrada.nextDouble();
        System.out.println("||  POR FAVOR ESCRIBA EL SEGUNDO NÚMERO: ");
        numero2 = entrada.nextDouble();
    }

    public static double getNumero1() {
        return numero1;
    }
    public static double getNumero2(){
        return numero2;
    }

    public static void resta(){
        System.out.println("||============================================||");
        System.out.println("||     HAZ SELECCIONADO LA OPCIÓN DE RESTA    ||");
        System.out.println("||============================================||");
        System.out.println("||  POR FAVOR ESCRIBA EL PRIMER NÚMERO: ");
        numero1 = entrada.nextDouble();
        System.out.println("||  POR FAVOR ESCRIBA EL SEGUNDO NÚMERO: ");
        numero2 = entrada.nextDouble();
    }

    public static void multiplicacion(){
        System.out.println("||======================================================||");
        System.out.println("||     HAZ SELECCIONADO LA OPCIÓN DE MULTIPLICACIÓN     ||");
        System.out.println("||======================================================||");
        System.out.println("||  POR FAVOR ESCRIBA EL PRIMER NÚMERO: ");
        numero1 = entrada.nextDouble();
        System.out.println("||  POR FAVOR ESCRIBA EL SEGUNDO NÚMERO: ");
        numero2 = entrada.nextDouble();
    }
    public static void division(){
        System.out.println("||================================================||");
        System.out.println("||     HAZ SELECCIONADO LA OPCIÓN DE DIVISIÓN     ||");
        System.out.println("||================================================||");
        System.out.println("||  POR FAVOR ESCRIBA EL PRIMER NÚMERO: ");
        numero1 = entrada.nextDouble();
        System.out.println("||  POR FAVOR ESCRIBA EL SEGUNDO NÚMERO: ");
        numero2 = entrada.nextDouble();
    }

    public static void potencia(){
        System.out.println("||================================================||");
        System.out.println("||     HAZ SELECCIONADO LA OPCIÓN DE POTENCIA     ||");
        System.out.println("||================================================||");
        System.out.println("||  POR FAVOR ESCRIBA EL PRIMER NÚMERO: ");
        numero1 = entrada.nextDouble();
        System.out.println("||  POR FAVOR ESCRIBA EL NÚMERO AL QUE QUIERE ELEVARLO: ");
        numero2 = entrada.nextDouble();
    }

    public static void historialMenu(){
        System.out.println("||================================================||");
        System.out.println("||           ESTA HA SIDO TU HISTORIAL            ||");
        System.out.println("||================================================||");
    }

}


