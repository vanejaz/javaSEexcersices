public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //Area de un círculo cuyo radio es y=3
        //pi * r2
        circleArea(y);

        //Área de una esfera
        //4*PI*r2
    sphereArea(y);

        //Volumen de un esfera
        //(4/3)*pi *r3
        sphereVolum(y);

        System.out.println("PESOS A DOLARES: " + converToDolar(200,"MNX"));
    }
    public static void circleArea(double r){
    }
    public static double sphereArea(double r){
        return (4 * Math.PI * Math.pow(r,2));
    }
    public static double sphereVolum(double r){
        return ((4/3) * Math.PI * Math.pow(r,3));
    }
/**convertToDolar:
 * es una funcion que nos ayuda a realizar conversiones en moneda colombiana y en moneda nacional*/
public static double converToDolar (double quantity, String currency){
        //MNX COP
    switch (currency){
        case "MNX":
            quantity = quantity * 0.052;
            break;
        case "COP":
            quantity = quantity * 0.00031;
            break;
    }
    return quantity;

}
}
