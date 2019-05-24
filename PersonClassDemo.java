/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personclassdemo;

/**
 *
 * @author S0556309
 */
public class PersonClassDemo {

    public static void main(String[] args) {
        // Variable declaration
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p1.setHeight(180);
        p1.setName("Mark");
        p2.setHeight(170);
        p2.setName("Carl");
        p3.setHeight(180);
        p3.setName("Mark");
        System.out.println("P1 and p2 are of the same age nd height" + Person.compare2Persons(p1, p2));
        System.out.println("P2 and p3 are of the same age nd height" + Person.compare2Persons(p2, p3));
        System.out.println("P3 and p1 are of the same age nd height" + Person.compare2Persons(p3, p1));

        System.out.println("/nPerson's Name: " + p1.getName()
                + "/nHeight: " + p1.getHeight());
        System.out.println("/nPerson's Name: " + p2.getName()
                + "/nHeight: " + p2.getHeight());
    }

}

class Person {

    private String gender;
    private String name;
    public int age;
    private int height;
    private static int personCtr = 0;
    public Person() {
        gender = "not specified yet";
        name = "not known yet";
        age = 0;
        height = 0;
    }
    public Person(int a, int b, String g){
        gender = g;
        name = n;
        age = a;
        height = h;
        
    }
    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
    
    static boolean compare2Persons(Person p1, Person p2){
        if(p1.age == p2.age && p1.height == p2.height){
            return true;
        }else 
            return false;
    }
}
