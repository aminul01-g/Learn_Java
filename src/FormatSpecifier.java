public class FormatSpecifier {

    public static void main(String[] args){
        boolean b;
        b = true;
        System.out.printf("b = %b\n",b);
                char c;
        c = 'a';
        System.out.printf("c = %c\n",c);

        short s;
        s = 9;
        System.out.printf("s = %d\n",s);

        int i;
        i = 10;
        System.out.printf("i = %d\n",i);

        float f;
        f = 11.0f;
        System.out.printf("f = %.2f\n",f);
        
        double d;
        d = 12.00;
        System.out.printf("d = %f\n",d);
   
  }

}
