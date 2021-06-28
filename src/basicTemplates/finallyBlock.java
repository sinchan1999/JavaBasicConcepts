package basicTemplates;


public class finallyBlock {
    public static void main(String[] args) {

        int num1 = 723;
        int num2 = 0;

        while (true) {
            try {
                System.out.println(num1/num2);
                //break;
            }
            catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally, my block of code runs always no matters what exceptions occurs " +
                        ". Even break in a loop cannot stop me !"  );
            }

        }

    }
}
