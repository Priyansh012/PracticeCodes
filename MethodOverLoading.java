class Calculate{
    int total;
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b)
    {
        return a+b;
    }
}
public class MethodOverLoading {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        System.out.println("Addition"+c.add(44.5f,55.66f));    
    }
    
}