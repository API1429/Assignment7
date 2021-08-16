import java.util.*;

class Fibonacci{
  
    
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
  
        int ct = 0;
  
        
        while (ct < N) {
  
            
            System.out.print(num1 + " ");
  
           
            int temp = num2 + num1;
            num1 = num2;
            num2 = temp;
            ct = ct + 1;
        }
    }
  
    
    public static void main(String args[])
    {
        
        int N = 8;
  
        
        Fibonacci(N);
    }
}
