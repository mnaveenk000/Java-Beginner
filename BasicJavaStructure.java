// 1. Package Declaration (optional)
package com.example;

// 2. Import Statements
import java.util.Scanner;

// 3. Class Declaration
public class BasicJavaStructure {
    // 4. Class Variables (Fields)
    private static int count = 0;
    private String name;

    // 5. Constructor
    public BasicJavaStructure(String name) {
        this.name = name;
        count++;
    }

    // 6. Methods
    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }

    public static int getCount() {
        return count;
    }

    // 7. Main Method (Program Entry Point)
    public static void main(String[] args) {
        // Create objects
        BasicJavaStructure person1 = new BasicJavaStructure("Naveen");
        BasicJavaStructure person2 = new BasicJavaStructure("Kumar");

        // Call methods
        person1.sayHello();
        person2.sayHello();

        // Use class variable
        System.out.println("Total objects created: " + getCount());
    }
} 