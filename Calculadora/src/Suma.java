import java.util.ArrayList;

public class Suma {

        int contador = 0;
        StringBuilder historial = new StringBuilder();
        private static final int LIMITE = 3;

        public void suma(double num1, double num2) {
            double resultado = num1 + num2;

            // Si llega al límite, borrar historial
            if (contador == (LIMITE+1)) {
                historial.setLength(0); // borra todo
                contador = 0;
            }

            System.out.println(String.format(
                    "El resultado de la operación es: %.2f", resultado));

            historial.append("|| OPERACIÓN #" + (contador + 1) +
                    " | Números: " + num1 + " y " + num2 +
                    " | Resultado: " + resultado + "\n");

            contador++;
        }

        public void mostrarHistorial() {
            if (contador == 0) {
                System.out.println("NO HAY OPERACIONES EN ESTE MOMENTO");
            } else {
                System.out.println("||===============================||");
                System.out.println("||       HISTORIAL SUMA          ||");
                System.out.println("||===============================||");
                System.out.println(historial);
            }
        }
    }
