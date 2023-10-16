/*
 * CountingApp.java
 * @author: Ata Turkoglu
 * Date: 31/03/2023
 */

import javax.swing.JOptionPane;
public class CountingApp {
    public static void main(String args[]){
        //Declare variables 
        String input;
        int vowels, spaces, numbers;

        //Declare objects
        Counting myCounting = new Counting();

        //Input
        input = JOptionPane.showInputDialog(null,"Enter a sentence");
        myCounting.setInput(input);

        //Process
        myCounting.compute();

        //Output
        vowels = myCounting.getVowels();
        spaces = myCounting.getSpaces();
        numbers = myCounting.getNumbers();
        JOptionPane.showMessageDialog(null,"Vowels is equals: "+vowels+" Spaces is equals: "+spaces+" Number is equals: "+numbers);
    }
}
