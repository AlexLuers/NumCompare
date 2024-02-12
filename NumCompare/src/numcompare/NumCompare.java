/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numcompare;

/**
 *
 * @author Administrator
 */
public class NumCompare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valueOne;
        int valueTwo;
        System.out.println("What is your first integer?");
        valueOne = in.nextInt();
        System.out.println("What is your second integer?");
        valueTwo = in.nextInt();
        if ((valueOne) == valueTwo)
        {
            System.out.println("Those number are equal");
        }
        else if((valueOne) >= valueTwo)
        {
            System.out.println("Your first value is bigger that your second value!");
        }
        else
        {
            System.out.println("your second value is bigger than your first value!");
        }
    }
    
}
