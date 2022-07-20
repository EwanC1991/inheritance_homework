package staff;

public abstract class Employee {

    private String name;
    private String ni_number;
    private double salary;

    public Employee(String name, String ni_number, double salary){
        this.name = name;
        this.ni_number = ni_number;
        this.salary = salary;
    }


    public String getName(){
        return this.name;
    }

    public String getNiNumber(){
        return this.ni_number;
    }

    public double getSalary(){
        return this.salary;
    }

    public double raiseSalary(double salaryIncrease){
        return this.salary += salaryIncrease;
    }

    public double payBonus(){
        double onePercentBonus = this.salary / 100;
        double tenPercentBonus = onePercentBonus*10;
        return tenPercentBonus;
    }
}
