/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;
class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }

    void displayInfo() {
        System.out.println("Department: " + name);
    }
}

// University class represents a university composed of departments
class University {
    String name;
    Department[] departments; // Composition - University is composed of Departments

    public University(String name, int numDepartments) {
        this.name = name;
        this.departments = new Department[numDepartments];

        for (int i = 0; i < numDepartments; i++) {
            departments[i] = new Department("Department " + (i + 1));
        }
    }

    void displayInfo() {
        System.out.println("University: " + name);
        System.out.println("Departments:");

        for (Department department : departments) {
            department.displayInfo();
        }
    }
}
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        University university = new University("ABC University", 3);

       
        university.displayInfo();
    }
}
