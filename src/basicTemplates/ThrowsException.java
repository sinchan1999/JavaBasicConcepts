package basicTemplates;

// Defining custom exception
class NegativeAgeException extends Exception{
    @Override
    public String toString() {

        return /*super.toString();*/ " Age cannot be negative !--> from toSring() ";
    }

    @Override
    public String getMessage() {

        return /*super.getMessage();*/ " Age cannot be negative!--> from getMessage() ";
    }
}

public class ThrowsException {

    public static int ageAfter10yrs(int a) throws NegativeAgeException{
        if (a<0){
            throw new NegativeAgeException();
        }
        int result = a +10 ;
        return result;
    }


    public static void main(String[] args) {

        try{
            // Entering age
            int age = ageAfter10yrs(-46);
            System.out.println("Your age after 10 yrs will be : ");
            System.out.println(age);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e); // toString runs automatically no need of calling explicitly !

            e.printStackTrace(); // Not a good practice , just for debugging!
        }
        System.out.println(" All exceptions were caught correctly !");

    }
}
