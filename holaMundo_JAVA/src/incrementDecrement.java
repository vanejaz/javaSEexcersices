public class incrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives -1;
        System.out.println(lives); //4

        lives--;
        System.out.println(lives); //3

        lives++; //Incremento
        System.out.println(lives); //4

        //Prefijo
        //Gana un regalo por ganar una vida
        int gift = 100 + ++lives; //pre
        System.out.println(gift);
        System.out.println(lives);


    }
}
