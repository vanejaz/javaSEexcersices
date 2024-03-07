public class ForLoop {
    public static void main(String[] args) {
        turnOnOffLight();
        for (int i= 1; i<=10; i++){
            printSOS();
        }
    }

    static boolean isTurnOnLight = false;

    public static void printSOS(){
        System.out.println("...___...");
    }
    public static boolean turnOnOffLight(){
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }


}
