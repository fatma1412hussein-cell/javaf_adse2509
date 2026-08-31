
package com.adse2509.sess06_modifier_and_packages;

/**
 * Java program to demonstrate the 'final' keyword.
 * 
 *  1. final field ->    cannot be reassigned/modified after initialization.
 *  2. final method ->   cannot be overridden in subclass.
 *  3. final class ->    cannot be extended (no subclasses allowed.)
 * 
 * 
 * @author Administrator
 */
public class FinalKeywordDemo {

   public static void main(String[] args)
    {
        // 1. Demonstrate the final id field
        System.out.println("====1. Final Field Demo====");
        Person person = new Person(30, "Jane Mutisya");
        System.out.println(person);

        // Try to reassign Jane's ID number
       //person.id = 21; // Will not compile due to private access & trying to modify a final field

        // We can change Jane's age
        person.setAge(24);
        System.out.println("After Jan's birthday: \n" + person);

        // 2. Demonstrate the final method
        System.out.println("====2. Final Method Demo====");
        Employee emp = new Employee(50000.0, "Alice");
        emp.setAge(25); // Set the employee's age
        System.out.println(emp.getDetails());

        // 3. Demonstrate the final class
        System.out.println("====3. Final Class Demo====");
        MathUtils.add(20,10);
        MathUtils.multiply(5,8);
    }    
}

/**
 * 1. Class with a final field
 * 
 * The 'id' field is final -> must be set in constructor and never modified/changed.
 * 
 * @author Nyanjui
 */
class Person
{
    private final int id; // final instance field
    private String name;
    private int age;

    public Person(int id, String name)
    {
        this.id = id;// Only place where the final ID field can be assigned
        this.name = name;
        this.age = 0;
    }

    public int getId()   {  return id;}

    public String getName()   {  return name;}

    public int getAge()   {  return age;}

    public void setAge(int age)   {  this.age = age;}

    @Override
    public String toString()
    {
        return String.format(
                """
                ------------------------------------
                ID No.: %d
                Name  : %s
                Age   : %d
                ------------------------------------
                """,this.id, this.name, this.age );
    }
}

/**
 * 2. Class with a final method.
 *
 * Its subclasses cannot override the getDetails() method.
 *
 * @author Nyanjui.
 */
class Employee extends Person
{
    private double salary;

    public Employee(double salary,String name )
    {
        super((int)(Math.random() * 10000), name); // Generate a random id for the user
        this.salary = salary;
    }

    public final String getDetails()
    {
        return String.format(
                """
                ------------------------------------
                ID No.: %d
                Name  : %s
                Age   : %d
                Salary: %.2f
                ------------------------------------
                """,this.getId(), this.getName(), this.getAge(),this.salary );
    }
}

/**
 * 3. Final class - cannot be subclassed.
 *
 *  Examples in Java API: String, Integer, Double, Math, System and so on.
 *
 * @author Nyanjui
 */
final class MathUtils
{
    // static final field (constant) - convention: all final fields should be in UPPERCASE
    public static final double PI = 3.14159265359;

    // Utility methods
    public static void add(int a, int b)
    {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void multiply(int a, int b)
    {
        System.out.println(a + " x " + b + " = " + (a * b));
    }
}
