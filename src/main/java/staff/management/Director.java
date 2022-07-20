package staff.management;

public class Director extends Manager {
    private double budget;


    public Director(String name, String ni_number, double salary, String deptName, double budget){
        super(name, ni_number, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }
}
