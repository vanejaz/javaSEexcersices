public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567890;

        long nL = 12345678910L;
        double nD = 123.123455678910;
        float nF = 123.1234568F;

        var salary = 1000; //int
        var pension = salary * 0.03; //double
        var totalSalary = salary -  pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Vanesa León";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);

    }
}
