/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }
}

class Employee {
    String name;
    Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }
}

public class Association {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Department hrDepartment = new Department("HR");
        Employee john = new Employee("John Doe", hrDepartment);

        System.out.println("Employee: " + john.name);
        System.out.println("Department: " + john.department.name);
    }
}
