package basicTemplates;


public class DateTime {
    public static void main(String[] args) {

        //Java starts counting of years from 1900 & miliseconds from  1970
        long miliseconds= System.currentTimeMillis();
        System.out.println("No.of Seconds passed : " +miliseconds/1000);
        System.out.println("No.of Hours passed   : " +miliseconds/1000/3600);
        System.out.println("No.of Days passed    : " +miliseconds/1000/3600/24);
        System.out.println("No.of Years passed   : " +miliseconds/1000/3600/24/365);

    }
}







