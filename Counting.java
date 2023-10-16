/*
 * Counting.java
 * @author: Ata Turkoglu
 * Date: 31/03/2023
 */

public class Counting {
    //Declare data members
    private String input;
    private int vowels;
    private int spaces;
    private int numbers;

    //Constructor
    public Counting(){
        input = "";
        vowels = 0;
        spaces = 0;
        numbers = 0;
    }

    //Setters - One for every input
    public void setInput(String input){
        this.input = input;
    }

    //Compute method
    public void compute(){
        input = input.toLowerCase();

        for(int i = 0; i < input.length();i++){
            if(input.charAt(i)==' '){
                spaces++;
            }
            else if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
                vowels++;
            }
            else if(input.charAt(i)=='0'||input.charAt(i)=='1'||input.charAt(i)=='2'||input.charAt(i)=='3'||input.charAt(i)=='4'||input.charAt(i)=='5'||input.charAt(i)=='6'||input.charAt(i)=='7'||input.charAt(i)=='8'||input.charAt(i)=='9'){
                numbers++;
            }
        }
    }

    //Getters
    public int getVowels(){
        return vowels;
    }
    public int getSpaces(){
        return spaces;
    }
    public int getNumbers(){
        return numbers;
    }
}
