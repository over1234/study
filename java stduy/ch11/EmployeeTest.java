package ch11;

public class EmployeeTest {

    static public void main(String[] args)
    {
        Employee choi = new Employee("choi");
        Employee kim = new Employee("kim");

        choi.setEmployeenumber();
        kim.setEmployeenumber();

        choi.showInfo();
        kim.showInfo();
    }
    
}
