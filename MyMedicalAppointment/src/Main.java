//import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int n1= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
//        int n2= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
//
//        Operation op = new Operation();
//
//        int suma = op.sumar(n1,n2);
//        int resta = op.restar(n1,n2);
//        int multi = op.multiplicar(n1,n2);
//        int div = op.dividir(n1,n2);
//
//        op.mostrarResultados( suma,resta,multi,div);

//        Doctor myDoctor = new Doctor("Vanesa León");
//        myDoctor.name = "Alejandro Suarez";
//        myDoctor.showName();
//        myDoctor.showId();
//        System.out.println(Doctor.id);
//
//      Doctor myDoctorAnn = new Doctor();
//        myDoctor.showId();
//        System.out.println(Doctor.id);
//
//        UIMenu.showMenu();

//        Doctor myDoctor = new Doctor("Vanesa León", "Pediatría");
//        System.out.println(myDoctor.name);
//        System.out.println(myDoctor.speciality);

        Patient myPatient = new Patient("Valeria Santiago", "valesant@gmail.com", "Av 559", "5586784511", "04-Mayo-2006", "45 kg", "1.68 m", "A positive" );
        System.out.println(myPatient.name);
        System.out.println(myPatient.email);
        System.out.println(myPatient.address);
        System.out.println(myPatient.birthday);
        System.out.println(myPatient.phoneNumber);
        System.out.println(myPatient.weight);
        System.out.println(myPatient.height);
        System.out.println(myPatient.blood);


    }



}





