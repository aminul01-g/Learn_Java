public class VariableDataType {
    
    /*Variable:
     * 1. Variable can be named by (A...Z, a...z), (0,1,...9), (-), ($)
     * 2. Variable name cannot be started with digit
     * 3. variable name can't be KEYword and Function/Method
     * 4. Space are not allowed in the variable name
     * 5. To naming a Variable you can use 31 char but 8 char is better for use
     * 
     * 
     * Example:
     * rolse_no : valid variable name
     * "Aminul" : Not valid
     * ID1 : Valid
     * aminul@: Invalid
     * #Aminul: Invalid
     * $Aminul: Valid
     * _num1: Valid
     * float: Invalid
     * Float: Valid
     * main: Invalid
     * MAIN: Valid
     * for: Invalid
     * num 1: Invalid
     */

     /* Data Type
      * There are two type of Data Type
            * Primitive
                * Boolean
                    * boolean (true or false) 1 bit
                * Numeric
                    * Character
                        * char ('a')- 2 bytes
                    * Integral
                        * Integer
                            * byte (10)- 1 byte (-128 - 127)
                            * short (10)- 2 byte (-32768 - 32767)
                            * int (10)- 4 byte (-2x10^9 to 2x10^9)
                            * long (10)- 8 byte (-9x10^18 to 9x10^18)
                        * Floating-point
                            * float (10.0f)
                            * double (10.0)
            *Non-Primitive
                * String
                * Array
                * etc  
      */

      public static void main(String[] args){
         
        boolean b;
        b = true;
        System.out.println("b = "+b);

        char c;
        c = 'a';
        System.out.println("c = "+c);

        short s;
        s = 9;
        System.out.println("s = "+s);

        int i;
        i = 10;
        System.out.println("i = "+i);

        float f;
        f = 11.0f;
        System.out.println("f = "+f);
        
        double d;
        d = 12.00;
        System.out.println("d = "+d);

      }
      
}
