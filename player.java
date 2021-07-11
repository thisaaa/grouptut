import java.util.Scanner;
public class player {

    public static void main(String[] args){

        battingAVG();
        bowlingAVG();
        details();
        performance();
        type();

    }
    player(){
        Double bAVG=0.0;
        Double blAVG=0.0;
        String name=null;
        Integer age=0;
        String perform=null;
        String type=null;


    }
    public static void battingAVG(){
        Scanner myscan=new Scanner(System.in);
        System.out.println("Enter Player's batting average");
        Double bAVG=myscan.nextDouble();
    }

    public static void bowlingAVG(){
        Scanner myscan1=new Scanner(System.in);
        System.out.println("Enter Player's bowling average");
        Double blAVG=myscan1.nextDouble();
    }

    public static void details(){
        Scanner myscan2=new Scanner(System.in);
        System.out.println("Enter Player's Name: ");
        String name=myscan2.next();
        System.out.println("Enter Player's Age: ");
        Integer age=myscan2.nextInt();
    }
    public static void performance(){
        Scanner myscan3=new Scanner(System.in);
        System.out.println("Enter Player's performance");
        String perform=myscan3.next();
    }
    public static void type(){
        Scanner myscan4=new Scanner(System.in);
        System.out.println("Enter Player's type");
        String type=myscan4.next();
    }
}
