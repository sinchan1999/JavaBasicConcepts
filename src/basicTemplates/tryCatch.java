package basicTemplates;

public class tryCatch {
    public static void main(String[] args) {
        int a = 50000;
        int b = 0;

        /*
 Without Try:->> It will throw exception and stop here only without executing the rest of the program                   even if they are error-free.
        int c = a / b;
        System.out.println("The result is " + c);
*/

/*
 With try I am saying that , Hey Java I am not sure of this block of code so please try this code if it runs  then well and good but incase it fails, then catch this exception 'e' in the catch block.
*/
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {
            System.out.println("Division failed because of Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
