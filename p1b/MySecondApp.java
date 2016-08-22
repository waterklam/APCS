public class MySecondApp
{
    public static void main (String args []){
        int a = 10;
        int b = 15;
        
        if( a > b){
            System.out.println("A, which is " + a + ", is greater than b, which is " + b);
        }else if( b > a){
            System.out.println("A, which is " + a + ", is less than b, which is " + b);
        }else{
            System.out.println("A, which is " + a + ", is equal to b, which is " + b);
        }
    }
}