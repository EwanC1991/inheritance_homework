package staff.management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, String ni_number, double salary, String deptName){
        super(name, ni_number, salary);
        this.deptName = deptName;

    }

    public String getDeptName(){
        return deptName;
    }
}
