/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agregation;

class Address {
    String street;
    String city;
    String state;
    String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}

// Person class represents a person with an address
class Person {
    String name;
    Address address; // Aggregation - Person has an Address

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.street + ", " + address.city + ", " + address.state + " " + address.zipCode);
    }
}
public class Agregation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
         Address address = new Address("123 Main St", "Cityville", "Stateville", "12345");

        // Create a Person object with the Address object
        Person person = new Person("John Doe", address);
       person.displayInfo();
    }
}
