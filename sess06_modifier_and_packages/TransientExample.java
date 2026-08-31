
package com.adse2509.sess06_modifier_and_packages;

import java.io.*;


/**
 *Java program to demonstrate the 'transient' keyword/modifier to prevent the user's password from being serialized.
 * 
 * @author Administrator
 */
public class TransientExample {

  // main method begins program execution
    public static void main(String[] args)
    {
        //Declare and instantiate a user object
        User user1 = new User("j_kamau", "j_kamau@edulink.ac.ke", "sUpers3cretPa$sw0rd");

        // Display the details of the user before serialisation
        System.out.println("user1's details before serialisation:\n" + user1);

        // Serialise the user1 object to a file
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user1.txt")))
        {
            oos.writeObject(user1);
        }catch (IOException ioe)
        {
            System.err.println("The error: \n" + ioe.getLocalizedMessage());
        }

        // Modify the object by changing the user's password
        user1.password = "n3wEas1erp@$s";

        // Deserialise the object from the file
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user1.txt")))
        {
            User deserialisedUser = (User) ois.readObject();

            // Display the details of the user after deserialisation
            System.out.println("user1's details after deserialisation:\n" + deserialisedUser);
        }catch (IOException | ClassNotFoundException e)
        {
            System.err.println("The error: \n" + e.getLocalizedMessage());
        }
    }
}

class User implements Serializable
{
    // Regular fields, will be serialised
    String username, email;

    // Transient field, will not be serialised
    transient String password;

    // Parameterised constructor
    public User(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Override the toString Method
    @Override
    public String toString()
    {
        return String.format(
                """
                -------------------------------------------------------------
                Username: %s, 
                Email: %s, 
                Password: %s
                -------------------------------------------------------------
                """,  username, email, (this.password != null ? "*******" : "null" )
        );
    }
} 
    

