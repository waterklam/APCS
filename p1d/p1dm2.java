import java.util.Random;
public class p1dm2
{
    public static void main ( String [] args ) {
        Random rn = new Random();
        
        for(int i = 1; i <10; i++){
        int rando = rn.nextInt(i*i) +1;
        System.out.println(i + "\t" + rando + "\t" + i*i);
    }
}
}
        
        