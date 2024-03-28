/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testingapp;

import java.util.HashMap;

/**
 *
 * @author Mical_SSD
 */
public class TestingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> name = new HashMap<String, Integer>();
        HashMap<Character, Integer> name3 = new HashMap<Character, Integer>();
String FullName = "techcompany";

// Counter to keep track of the position of characters
int position = 1;

for (char i : FullName.toLowerCase().toCharArray()) {
    // Check if the character already exists in the map
    if (name3.containsKey(i)) {
        // If the character exists, update its position
        name3.put(i, position);
    } else {
        // If the character is encountered for the first time, add it to the map with its position
        name3.put(i, position);
    }
    // Increment the position for the next character
    position++;
}

System.out.println("Character Count and Position in HashMap:");
for (char key : name3.keySet()) {
    System.out.println(key + ": " + name3.get(key));
}

    }
    
}
