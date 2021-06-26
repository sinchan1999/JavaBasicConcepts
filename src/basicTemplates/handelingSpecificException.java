package basicTemplates;

import java.util.Scanner;

public class handelingSpecificException{
    public static void main(String[] args) {
        int [] weights = new int[5];
        weights[0] = 70;
        weights[1] = 56;
        weights[2] = 61;
        weights[3] = 30;
        weights[4] = 25;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any array index : ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with : ");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is: " + weights[ind]);
            System.out.println("The value of array-value/number is: " + weights[ind]/number);

        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }

        // General purpose (not specific like above two!)
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }

        System.out.println("End of the program");
    }
}

