/**
 * Created by Sudeep on 6/1/2017.
 */
public class PrintPattern {
    public static void main(String arg[]){
        p1(10);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        p2(10);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        p3(15);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        p4(15);
    }
    public static void p1(int max){
        int i,j;
        for(i=0;i<max;i++){
            for(j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void p2(int max){
        int i,j;
        for(i=0;i<max;i++){
            for(j=max;j>i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void p3(int max){
        int i,j;
        for(i=0;i<max;i++){
            for(j=0;j<max;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void p4(int max){
        int i,j;
        int temp=max;
        for(i=0;i<max;i++){
            for(j=0;j<max;j++){
                if(j<temp-1){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println("");
            temp--;
        }
    }
}
