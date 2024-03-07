public class Doctor {
    static int id= 1; //Autoincrementado
    String name;
    String speciality;
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");

    }

    Doctor(String name, String speciality){
        id++;
        System.out.println("El nombre del Doctor asignado es: "+ name);
        this.name=name;
        this.speciality= speciality;

    }

    //comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
