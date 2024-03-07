public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Orange";

        switch (colorModeSelected){
            case "Ligth":
                System.out.println("Seleccionaste el modo Ligth ");
                break;
            case "Nigth":
                System.out.println("Seleccionaste el modo Nigth");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste el modo Blue Dark");
                break;
            case "Dark":
                System.out.println("Seleccionaste el modo Dark");
                break;
            default:
                System.out.println("Selecciona una opción correcta");

        }
    }
}
