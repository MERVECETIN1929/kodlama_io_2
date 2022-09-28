package ınheritance;

public class Inheritance {

    public static void main(String[] args) {
        Customer customer=new Customer();
       
        Employee employee=new Employee();
        
        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();
        customerManager.listele();
        employeeManager.bestEmployee();
    }

}
