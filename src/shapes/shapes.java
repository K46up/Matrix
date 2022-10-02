package shapes;

public class shapes {
    public static void Triangle(){

        int a = 5;
        int b = a;

        while (b >= 1) {
            int j = 1;
            while (j <= b) {
                System.out.print(" +");
                j++;
            }
            System.out.println("");
            b--;
        }

        System.out.println("");
    }

    public static void Rectangle(){
        int a = 5;
        int b = 5;

        System.out.println(" " + new String(new char[a]).replace("\0", "+"));
        for (int i = 0; i < b; i++) {
            System.out.println("+" + new String(new char[a]).replace("\0", " ") + "+");
        }
        System.out.println(" " + new String(new char[a]).replace("\0", "+"));
    }
}
