package day10_IfStatements;

import java.util.Scanner;

public class C04_ClassTask {
    public static void main(String[] args) {
        /*
fizik, kimya, matematik ve geçme notlarını konsoldan alın
ortalamayı hessaplayın
geçti ise "Tebrikler geçtiniz"
kaldi ise "Ders tekrarı gerekmektedir."
*/
        Scanner scan=new Scanner(System.in);
        System.out.print("Fizik notunu girin : ");
        double fizikNotu=scan.nextDouble();

        System.out.print("Kimya notunu girin : ");
        double kimyaNotu=scan.nextDouble();

        System.out.print("Matematik notunu girin : ");
        double matNotu=scan.nextDouble();

        System.out.print("Ortalama Geçme Notunu girin : ");
        double ortGecNot= scan.nextDouble();

        double ortalama=(fizikNotu+kimyaNotu+matNotu)/3;

        if(ortalama>=ortGecNot){
            System.out.println("Ortalamanız = "+ortalama+" Tebrikler geçtiniz.");
        } else {
            System.out.println("Ortalamanız = "+ortalama+" ders tekrarı gerekmektedir.");
        }
    }
}
