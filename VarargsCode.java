class Calculate{
    int total;
    int add(int... values)
    {
        for(int val: values){
            total +=val;
        }
        return total;
    }
}
public class VarargsCode {
    public static void main(String[] args) {
        Calculate c= new Calculate();
        System.out.println("Addition is"+c.add(45,50,75));
    }
}