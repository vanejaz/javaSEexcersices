import javax.swing.JOptionPane;
import java.util.Scanner;

    public class Operation {
        //Atributos


        //Métodos
        //Método para pedir al usuarioque digite 2 números

        public int sumar(int numero1, int numero2) {
            int suma= numero1+numero2;
            return suma;

        }

        public int restar(int numero1, int numero2) {
            int resta= numero1-numero2;
            return resta;

        }

        public int multiplicar(int numero1, int numero2) {
            int multiplicación =numero1*numero2;
            return multiplicación;

        }

        public int dividir(int numero1, int numero2) {
            int division= numero1/numero2;
            return division;

        }

        public void mostrarResultados(int suma, int resta, int multiplicación, int division) {
            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
            System.out.println("La multiplicación es: " + multiplicación);
            System.out.println("La división es: "+ division);

        }
    }
