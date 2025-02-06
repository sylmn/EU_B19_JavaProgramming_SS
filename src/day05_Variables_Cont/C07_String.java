package day05_Variables_Cont;

public class C07_String {
    public static void main(String[] args) {

        //obje üretimini new yapıyor
        String isim = new String("Ali");                       //normal way

        String ad = "Hasan";                                        //literal way
        System.out.println(isim + new String(" Mehmet"));

        System.out.println("\"Yağız\" = " + "Yağız");


        new String("Esin");

        String soyad;

        String ucgen = "                                            ^\n" +
                "                                           / \\\n" +
                "                                          /   \\\n" +
                "                                         /     \\\n" +
                "                                        /       \\\n" +
                "                                        ---------";

        System.out.println(ucgen);

        String str = "*\n" +
                "    ***\n" +
                "   *****\n" +
                "  *******\n";

        System.out.println(str);
    }
}
