package day05_Variables_Cont;

public class C02_DataTypesMinMax {
    public static void main(String[] args) {

        //byte
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);

        //short
        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);
        
        short shortMax = Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);
        
        //int
        int intMin = Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);
        
        int intMax = Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        
        //long
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        //float
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);

        //double
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        System.out.println("Double.MIN_EXPONENT = " + Double.MIN_EXPONENT);


    }
}
