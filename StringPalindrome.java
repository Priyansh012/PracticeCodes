import java.util.*;
class StringPalindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.nextLine();
        String reverse="";
        for(int i =str.length()-1; i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println("The reversed string is: "+reverse);
        if(reverse.equals(str)){
            System.out.println("The given string is a Palindrome");
        }
        else{
            System.out.println("The given string is not a Palindrome");
        }
    }
}