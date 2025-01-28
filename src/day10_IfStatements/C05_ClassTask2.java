package day10_IfStatements;

public class C05_ClassTask2 {
    public static void main(String[] args) {
       /*
hava sıcaklığı isminde bir değişken declere edin ve değer atayın
sıcaklık 20 derece üzerinde ise hava sıcak yazsın
sıcaklık 20 derece ve altında ise hava soğuk yazsın
*/

        int temp=25;
        if(temp>20){
            System.out.println("hava sıcak");
        }else {
            System.out.println("hava soğuk");
        }
    }
}
