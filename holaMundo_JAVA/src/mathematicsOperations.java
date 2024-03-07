public class mathematicsOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        //Devuelve un número elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el número mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrada de un número
        System.out.println(Math.sqrt(y));

        //Area de un círculo cuyo radio es y=3
        //pi * r2
        System.out.println(Math.PI*Math.pow(y,2));

        //Área de una esfera
        //4*PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volumen de un esfera
        //(4/3)*pi *r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
