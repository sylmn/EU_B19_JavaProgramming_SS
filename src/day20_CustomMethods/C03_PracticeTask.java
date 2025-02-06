package day20_CustomMethods;

public class C03_PracticeTask {
    public static void main(String[] args) {

        areaOfCircle(8);
        areaOfCircle(4);

        System.out.println(areaOfSquare(3.4));

        System.out.println(perimeterOfSquare(5));
        perimeterOfSquare(3);
    }

    /**
     *this method calculates the area of circle with given radius
     *
     * @param radius
     * @return
     */

    public static double areaOfCircle(int radius){
        double area;
        area=Math.PI*Math.pow(radius,2);

        return area;
    }

    /**
     * method that can calculate the area of a square
     * @param side
     * @return
     */

    public static int areaOfSquare(double side){
        return (int)Math.pow(side,2);
    }

    public static double perimeterOfSquare(int side){
        double cevre= 4*side;
        return cevre;
    }
}
