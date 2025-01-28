package day10_IfStatements;

public class C08_ClassTask4 {
    public static void main(String[] args) {
        /*
bir program yazın eğer x in değeri 10 ise y ye 20 atansın
x in değeri 20 ise y ye 30 atansın
x in değeri 30 ise y ye 40 atansın
değil ise y ye 0 atansın
*/
        int x=10,y;

        if (x==10){
            y=20;
        } else if (x==20) {
            y=30;
        } else if (x==30) {
            y=40;
        }else {
            y=0;
        }
        System.out.println("y = " + y);
    }
}
