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
        System.out.println("``````````````````````````````````````````````");
        p5();
        System.out.println("``````````````````````````````````````````````");
        spaceDiamond();
        System.out.println("``````````````````````````````````````````````");
        sPrint();
        System.out.println("``````````````````````````````````````````````");
        sPattern();
        System.out.println("``````````````````````````````````````````````");
        oneLoopPattern();
        System.out.println("``````````````````````````````````````````````");
        oneLoopPyramid();
        System.out.println("``````````````````````````````````````````````");
        oneLoopDimond();


    }
    public static void p1(int max){System.out.println("``````````````````````````````````````````````");
        sPrint();
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

    public static void p5(){
        int i,j,imax=20,jmax=10;
        for(i=0;i<=imax;i++){
            for(j=0;j<=jmax;j++){
                System.out.print("*");
            }
            System.out.println("");
            if(i<imax/2){
                jmax--;
            }
            else{
                jmax++;
            }

        }
    }
    public static void spaceDiamond(){
        int i,j,imax=20,jmax=20,mid1=jmax/2,mid2=jmax/2;
        for(i=0;i<=imax;i++){
            for(j=0;j<=jmax;j++){
                if((j>mid1)&&(j<mid2)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
            if(i<imax/2){
                mid1--;
                mid2++;
            }
            else{
                mid1++;
                mid2--;
            }

        }
    }
    public static void sPrint(){
        int i,j,imax=8, jmax=8, next=8;
        for(i=0;i<=imax;i++){

            for(j=0;j<=next;j++){
               if((j==jmax)||(j==next)){
                    System.out.print("*");
                }
                else  {
                   System.out.print(" ");
               }


            }
            System.out.println("");
            next++;
            jmax--;


        }
    }

    public static void sPattern(){
        int j=1;
        for(int i=1;i<6;){

            if(i==j){
                System.out.println("*");
                j=1;
                i++;
            }
            else{
                System.out.print("*");
                j++;
            }
        }
    }

    public static void oneLoopPattern(){
        int i,j=1,k=6;
        for(i=1;i<6;){
            if(j==6){
                System.out.println("*");
                j=1;
                i++;
                k--;
            }
            else{
                if(j<k){
                    System.out.print(" ");
                    j++;
                }
                else{
                    System.out.print("*");
                    j++;
                }
            }
        }
    }

    public static void oneLoopPyramid(){
        int i,j=1,k=6,temp=6;
        for(i=1;i<6;){
            if(j==temp){
                System.out.println("*");
                j=1;
                i++;
                k--;
                temp++;
            }
            else{
                if(j<k){
                    System.out.print(" ");
                    j++;
                }
                else{
                    System.out.print("*");
                    j++;
                }
            }
        }
    }

    public static void oneLoopDimond(){
        int i,j=1,k=6,temp=6,imax=12;
        for(i=1;i<imax;){
            if(i<imax/2){
                if(j==temp){
                    System.out.println("*");
                    j=1;
                    i++;
                    k--;
                    temp++;
                }
                else{
                    if(j<k){
                        System.out.print(" ");
                        j++;
                    }
                    else{
                        System.out.print("*");
                        j++;
                    }
                }
            }

            else{
                if(j==temp){
                    System.out.println("*");
                    j=1;
                    i++;
                    k++;
                    temp--;
                }
                else{
                    if(j<k){
                        System.out.print(" ");
                        j++;
                    }
                    else{
                        System.out.print("*");
                        j++;
                    }
                }
            }
        }
    }
}
