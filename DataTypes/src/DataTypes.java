public class DataTypes {
    public static void main(String[] args) {

        int n = 1234567890;
        long nL = 12345678901l;
        double nD = 123.456789101112;
        float nF = 123.456f;

        var salary = 11000;
        //3% del valor del salario
        var pension =  salary * .03;
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employedName = "Anahi Salgado";
        System.out.println("Employee: " + employedName +" su salrio es: " + totalSalary);
    }
}
