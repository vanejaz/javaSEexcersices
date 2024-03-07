public class WhileLoop {

    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight();




    }
    public static void printSOS(){
        System.out.println("...___...");
    }
    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
        }



}
