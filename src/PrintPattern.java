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
        System.out.println("``````````````````````````````````````````````");
        pyramid();
        System.out.println("``````````````````````````````````````````````");
        diamond();
        System.out.println("``````````````````````````````````````````````");
        arrowPoint();
        System.out.println("``````````````````````````````````````````````");
        invertedPyramid();
        System.out.println("``````````````````````````````````````````````");
        filledX();
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
    public static void pyramid(){
        int i,j,imax=16, jmax=16, next=8;
        for(i=0;i<=imax;i++){

            for(j=0;j<=next;j++){
                if(j<jmax){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }


            }
            System.out.println("");
                next++;
                jmax--;


        }
    }

    public static void diamond(){
        int i,j,imax=16, jmax=8, next=8;
        for(i=0;i<=imax;i++){

            for(j=0;j<=next;j++){
                if(j<jmax){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }


            }
            System.out.println("");
            if((i<imax/2)){
                next++;
                jmax--;
            }
            else{
                next--;
                jmax++;
            }

        }
    }
    public static void arrowPoint(){
        int i,j,imax=13, jmax=1;
        for(i=0;i<imax;i++){
            for(j=1;j<=jmax;j++){
                System.out.print(j);
            }
            System.out.println("");
            if((i<imax/2)){
                jmax++;
            }
            else{
                jmax--;
            }

        }
    }


    public static void invertedPyramid(){
        int i,j,imax=7,jmax=15,next=0;
        for(i=0;i<=imax;i++){
            for(j=0;j<jmax;j++){
                if(j<next){
                    System.out.print(" ");
                }
                else{
                    System.out.print("j");
                }
            }
            System.out.println("");
            jmax--;
            next++;
        }
    }
    public static void filledX(){
        int i,j,imax=15,jmax=15,next=0;
        for(i=0;i<imax;i++){
            for(j=0;j<jmax;j++){
                if(j<next){
                    System.out.print(" ");
                }
                else{
                    System.out.print("j");
                }
            }
            System.out.println("");
            if(i<imax/2){
                jmax--;
                next++;
            }
            else{
                jmax++;
                next--;
            }

        }
    }
}
