import java.util.*;
public class SeasonsIdentification {
    public static void main(String[] args)
     {
        String season="";
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the month:");
        int month=sc.nextInt();
        switch(month)
        {   
            case 11:
            case 12:
            case 1:
            case 2:
                    season="winter";
                    System.out.println("The season for the month entered is:"+season);
                    break;
            case 3:
                    season="spring";
                    System.out.println("The season for the month entered is:"+season);
                    break;
            case 4:
            case 5:
            case 6:
                    season="summer";
                    System.out.println("The season for the month entered is:"+season);
                    break;
            case 7:
            case 8:
            case 9:
            case 10:
                    season="rainy";
                    System.out.println("The season for the month entered is:"+season);
                    break;
            default:
                    System.out.println("The value entered for month is wrong");
        }
        
    }
}