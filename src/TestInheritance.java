/**
 * Created by Sudeep on 6/17/2017.
 */
public class TestInheritance {
    public static void main(String arg[]){
        A obj=new B();
        obj.test();
        obj.AFunc();
       // obj.bFunc();
        System.out.println(obj.i);
        System.out.println(obj.j);
        System.out.println(obj.x);
        //System.out.println(obj.y);


    }
}
class A{
    int i=10;
    int j=50;
    int x=150;
    protected void test(){
        System.out.println("ATest");
    }
    public void AFunc(){
        System.out.println("AFunc");
    }
}
class B extends A{
    int i=20;
    int j=100;
    int y=200;
    protected void test(){
        System.out.println("BTest");
    }
    public void bFunc(){
        System.out.println("BFunc");
    }
}
