import java.util.Scanner;

public class VerificarSalida {

    static Scanner entrada = new Scanner(System.in);
    static String palabra;

    public static String repetirOperacion(String palabra){
        System.out.println("|| PARA SALIR AL MENU PRINCIPAL TECLEE (SALIR)");
        palabra = entrada.nextLine();
        if (palabra.equalsIgnoreCase("SALIR")){

        }
        return  palabra;
    }
}
