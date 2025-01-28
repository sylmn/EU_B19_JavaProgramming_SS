package Day05_variables_cont;

public class C01_Variables {
    public static void main(String[] args) {
        String name="Ahmet";
        System.out.println("name.toUpperCase()="+name.toUpperCase());

        int age =30;
        boolean isOpen=true;

        System.out.println(age);
        System.out.println(age+1);
        System.out.println(40);

        //declaration
        String surname;
        surname=null;
        System.out.println(surname);

        surname="Yılmaz"; //assignment
        System.out.println(surname);
        byte b1=10;                     //byte,short ve int aralarındaki toplama işlemlerini int kabul eder.
        byte b2=20;
        int i=b1+b2;
        //---------------------------------------------------------
        boolean isOpen1=true;
        boolean control=(age>20);
        System.out.println("control = " + control);
        System.out.println("name.isEmpty() = " + name.isEmpty()); //name e bir atama farsa false döner
        
        boolean isEqual;
        isEqual=(b1==b2);
        System.out.println("isEqual = " + isEqual);

    }
}
