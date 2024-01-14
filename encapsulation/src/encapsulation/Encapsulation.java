/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;
 class Person {
    // Private attributes
    private String name;
    private int age;

    // Public constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public methods for accessing and modifying private attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Add validation or other logic if needed
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Add validation or other logic if needed
        this.age = age;
    }

    // Public method for displaying information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Person p= new Person("omar", 22);
     p.displayInfo();
    }
}
