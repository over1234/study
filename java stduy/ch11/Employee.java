package ch11;

public class Employee {

    static int number = 1000;
    private String name;
    private int employeenumber;

    public Employee(String name) {
        this.setName(name);
        
    }
    
    public int getEmployeenumber() {
        return employeenumber;
    }
    public void setEmployeenumber() {
        employeenumber = number;
        number++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println(name + "님의 사원 번호는 " + employeenumber + "입니다.");
    }
    
}
