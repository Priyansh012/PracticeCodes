import java.util.*;
public class CheckVowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.nextLine();
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)== 'a' ||  str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i) == 'u')
            {
                System.out.println("The character "+str.charAt(i)+" is a vowel");
            }
            else{
                System.out.println("The character "+str.charAt(i)+" is not a vowel");
            }
        }
}
}