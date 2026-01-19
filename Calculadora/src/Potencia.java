public class Potencia {
    double num1;
    double num2;
    StringBuilder historial = new StringBuilder();
    int contador = 0;
    private final int limite = 3;

    public void potencia(double num1, double num2){
        if(contador == (limite+1)){
            historial.setLength(0);
            contador = 0;
        }
        var potencia = Math.pow(num1,num2);
        System.out.println(String.format("El resultado de la operación es: "+ potencia));
        historial.append("|| OPERACIÓN #" + (contador + 1) +
                " | Números: " + num1 + " y " + num2 +
                " | Resultado: " + potencia + "\n");
        contador++;
    }

    public void mostrarhistorial(){
        if (contador == 0){
            System.out.println("NO HAY OPERACIONES EN ESTE MOMENTO");
        }else{
            System.out.println("||===============================||");
            System.out.println("||      HISTORIAL POTENCIA       ||");
            System.out.println("||===============================||");
            System.out.println(historial);
        }


    }
}
