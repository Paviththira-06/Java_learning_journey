//Type_casting
//2 types

     /*1. Widening Casting
           byte > short > char > int > long > float > double
            (asending)
            
     2.Narrowing Casting
           double > float > long > int >char > short >byte
            (deasending)
     */


public class type_casting {
    public static void main(String[] args) {
       int a=5;                            //int
       double b = a;                       //double
       System.out.println("integer: "+a);
       System.out.println("double: "+b);

       int c=(int)b;                       //double -> int
       System.out.println("int: "+c);

    }
}