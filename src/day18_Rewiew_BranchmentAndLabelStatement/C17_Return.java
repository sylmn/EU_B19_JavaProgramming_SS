package day18_Rewiew_BranchmentAndLabelStatement;

public class C17_Return {
    public static void main(String[] args) {
        /**
         * normalde looplarda kullanılmıyor metodlarda kullanılıyor.
         * return gördüğünde bulunduğun metodu artık kullanma
         */
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                //return;
            }
            System.out.println("i = " + i);
        }
        System.out.println("dd");
        bolme(5,2);
        System.out.println("bolme(5,2) = " + bolme(5, 2));
    }

    public static int bolme(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }
}

