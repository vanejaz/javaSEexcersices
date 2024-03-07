import java.util.Scanner;

public class PracticaDeBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //----EJERCICIO 1. Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
        /*int var1, var2;
        System.out.println("Introduce un número entero");
        var1 = sc.nextInt();
        System.out.println("Introduce otro número entero");
        var2 = sc.nextInt();
        System.out.println("Los números que seleccionaste son: " + var1 +" y " + var2);*/


        //-----EJERCICIO 2. Programa Java que lea un nombre y muestre por pantalla: “Buenos
        //dias nombre_introducido”

        /* String helloName;
        Scanner sc2 = new Scanner (System.in);
        System.out.println("Ingresa tu nombre");
        helloName = sc.nextLine ();
        System.out.println ("Buenos días " + helloName);*/


        //----EJERCICIO 3. Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por
        //pantalla el doble y el triple de ese número.

        /*int readNum;
        Scanner sc3 = new Scanner (System.in);
        System.out.println("Escribe un número entero:");
        readNum = sc.nextInt();
        double newNum = readNum;
        System.out.println("Tu numero multiplicado x2 y x3 es: " + (double)newNum*2*3);*/


        //----EJERCICIO 4:
        //Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
        //La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
        //F = 32 + ( 9 * C / 5)
        /*int tempCel;
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Ingresa la temperatura actual en grados Celsius");
        tempCel = sc.nextInt();
        int tempFahr = 32+(9*tempCel/5);
        System.out.println("La temperatura en grados Fahrenheit es: " + tempFahr );*/


        //----EJERCICIO 5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra
        //por pantalla la longitud y el área de la circunferencia.
        //Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2

        /*double radio;
        Scanner sc5 = new Scanner (System.in);
        System.out.println("PROGRAMA PARA CALCULAR LA LONGITUD Y EL ÁREA DE UNA CIRCUNFERENCIA");
        System.out.println("Ingresa el radio en punto decimal de la circunferencia que deseas calcular la lóngitud y área ");
        radio = sc.nextDouble();

        double longitudCircunferencia, area;

        longitudCircunferencia = 2*Math.PI*radio;
        area = Math.PI*(Math.pow(radio,2));

        System.out.println("El resultado de la longitud es: " + longitudCircunferencia);
        System.out.println("El resultado del area es:  " + area);*/


        //EJERCICIO 6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.

        /*int varKm;
        System.out.println("Ingresa una velocidad en km/h para realizar la conversión");
        Scanner sc6 = new Scanner (System.in);
        varKm = sc.nextInt();
        System.out.println("El resultado de la conversion a m/s es: " +(varKm/3.6) + " m/s" );*/

        //EJERCICIO 7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de
        //la hipotenusa según el teorema de Pitágoras.

        /*System.out.println("Ingresa el valor cateto adyacente en punto decimal");
        double catetoAdyacente;
        Scanner sc6 = new Scanner (System.in);
        catetoAdyacente = sc.nextDouble();

        System.out.println("Ingresa el valor cateto opuesto en punto decimal");
        double catetoOpuesto;
        Scanner sc7 = new Scanner (System.in);
        catetoOpuesto = sc.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(catetoOpuesto,2)+Math.pow(catetoAdyacente,2));

        System.out.println("El valor de la hipotenusa es: " + hipotenusa);*/

        //EJERCICIO 8:
        //Programa que tome como dato de entrada un número que corresponde a la longitud del radio una esfera y
        //nos calcula y escribe el volumen de la esfera que se corresponden con dicho radio.

        /*double radio,volume;
        Scanner sc7 = new Scanner (System.in);
        System.out.println("Ingresa el radio con punto decimal para calcular el volumen de una esfera");
        radio = sc.nextDouble();
        volume = (4.0/3)*Math.PI*(Math.pow(radio,3));
        System.out.println("El volumen de la esfera es: " + volume);*/

        //EJERCICIO 13:
        //Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número
        //de la suerte.
        //El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación
        //sumando las cifras obtenidas en la suma.
        //Por ejemplo:
        //Si la fecha de nacimiento es 12/07/1980
        //Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 = 28
        //Número de la suerte: 28

        /*Scanner sc13 = new Scanner(System.in);
        int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;
        System.out.println("Introduzca fecha de nacimiento");
        System.out.print("día: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("año: ");
        año = sc.nextInt();
        suma = dia + mes + año;
        cifra1 = suma/1000; //obtiene la primera cifra
        cifra2 = suma/100%10; //obtiene la segunda cifra
        cifra3 = suma/10%10; //obtiene la tercera cifra
        cifra4 = suma%10; //obtiene la última cifra
        suerte = cifra1 + cifra2 + cifra3 + cifra4;
        System.out.println("Su número de la suerte es: " + suerte);*/


        //Ejercicios Básicos con Estructura Condicional
        //EJERCICIO 1. Programa Java que lea un número entero por teclado y calcule si es par o impar.
        //Podemos saber si un número es par si el resto de dividir el número entre 2 es igual a cero. En caso contrario
        //el número es impar
        //El operador Java que calcula el resto de la división entre dos números enteros o no es el operador %
        //El programa que calcula si un número entero es par o impar es el siguiente:

        /*Scanner sc1 = new Scanner (System.in);
        System.out.println("Ingresa un número entero");
        int numEntero;
        numEntero = sc.nextInt();
        if (numEntero % 2==0){
            System.out.println("el número es par");
        }else if(numEntero %2!=0) {
            System.out.println("el número no es par");
        }*/

        //EJERCICIO 2. Programa que lea un número entero y muestre si el número es múltiplo de 10
        //Podemos comprobar si un número entero es múltiplo de 10 si al dividirlo por 10 es resto de esta división
        //es cero.

        /*Scanner sc2 = new Scanner (System.in);
        System.out.println("Ingresa un número");
        int multiplo;
        multiplo = sc.nextInt();
        if (multiplo%10==0) {
            System.out.println("el número es multiplo de 10");
        } else if (multiplo%10!=0) {
            System.out.println("el número no es múltiplo de 10");*/


        //---EJERCICIO 3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula


        /*Scanner sc3 = new Scanner(System.in);
        System.out.println("Ingresa una letra ");
        char car;
        car = (char)System.in.read();
        if (Character.isLowerCase(letter));*/

        //-----EJERCICIO 7: Programa que lea dos números por teclado y muestre el resultado de la división del primer
        //número por el segundo. Se debe comprobar que el divisor no puede ser cero.

        /*Scanner sc7 = new Scanner (System.in);
        System.out.println("Ingresa el número divisor");
        int divisor, dividendo, división;
        divisor = sc.nextInt();
        System.out.println("Ingresa otro número que es el dividendo ");
        dividendo = sc.nextInt();
        división = divisor/dividendo;
        if (divisor!=0){
            System.out.println("el resultado es diferente de cero: "+ división);
        }else if (divisor==0){
            System.out.println("Error, no se puede dividir entre cero, seleccione otro número " );
        }*/


        //--EJERCICIO 8 El programa lee por teclado tres números enteros y calcula y muestra el mayor de los tres

        /*Scanner sc8 = new Scanner(System.in);
        System.out.println("ingresa un número entero: ");
        int n1, n2, n3;
        n1 = sc.nextInt();
        System.out.println("ingresa otro número entero: ");
        n2 = sc.nextInt();
        System.out.println("ingresa un último número entero: ");
        n3 = sc.nextInt();

        if(n1 > n2)
            if(n1>n3)
                System.out.println("El mayor es: " + n1);
            else
                System.out.println("el mayor es: " + n3);
        else if(n2>n3)
            System.out.println("el mayor es: " + n2);
        else
            System.out.println("el mayor es: " + n3);*/

        // ----EJERCICIO 9:
        //Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos
        //respectivamente, y comprueba si la hora que indican es una hora válida.
        //Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor
        //o igual que cero y menor que 24.
        //El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos

        Scanner sc9 = new Scanner(System.in);
        int horas, min, seg;
        System.out.println("Ingresa las horas en formato de 24 horas: ");
        horas = sc.nextInt();
        if (horas >= 00)
            if (horas <= 24) {
                System.out.println("Es correcto el formato, por favor continúa");

                System.out.println("Ingresa los minutos en formato de 24 horas: ");
                min = sc.nextInt();
                if (min >= 00)
                    if (min <= 59) {
                        System.out.println("El formato es correcto ");

                    }
                System.out.println("Ingresa los minutos en formato de 24 horas: ");
                seg = sc.nextInt();
                if (seg >= 00)
                    if (seg <= 59) {
                        System.out.println("El formato es correcto ");


                    }
            }
    }
}


















