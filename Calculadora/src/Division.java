public class Division {
    double num1;
    double num2;
    StringBuilder historial = new StringBuilder();
    int contador = 0;
    private final int limite = 3;

    public void division(double num1, double num2){

        // Este código sirve para limpiar el stringbuilder para que solo puedo tener 3 datos a la vez
        if (contador == (limite+1)) {
            historial.setLength(0); // borra todo
            contador = 0;
        }
        if (num2 != 0){
            var resultado = num1/num2;
            System.out.println(String.format("|| EL RESULTADO DE LA OPERACIÓN ES: %.2f",(num1/num2)));
            historial.append("|| OPERACIÓN #" + (contador + 1) +
                    " | Números: " + num1 + " y " + num2 +
                    " | Resultado: " + resultado + "\n");
            contador++;
        } else {
            System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO");
        }
    }
    public void mostrarhistorial(){
        if (contador == 0){
            System.out.println("NO HAY OPERACIONES EN ESTE MOMENTO");
        }else{
            System.out.println("||===============================||");
            System.out.println("||       HISTORIAL DIVISIÓN      ||");
            System.out.println("||===============================||");
            System.out.println(historial);
        }


    }
}

