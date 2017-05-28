import java.util.Random;
import java.util.Scanner;

/**
 * Created by Sudeep on 5/17/2017.
 */
public class Test extends PrimitiveDataSize {
    public static void main(String[] args){
        System.out.println("Hello World!!!");
        int a=6;
        short b=33;
        byte c=36;
        long d=344L;
        Random random=new Random();
        int randomNum=random.nextInt(100)+1;
        System.out.println("random number is=" + randomNum);
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        System.out.println("value of x is:" + x);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);

        boolean bool= true;
        char ch='C';
        float f=230f;
        double dbl=214.977d;

        if(bool==true){
            System.out.println("its boolen");
        }
        System.out.println("character="+ch);
        System.out.println("float="+f);
        System.out.println("Double"+dbl);


        System.out.println();

    }

}
