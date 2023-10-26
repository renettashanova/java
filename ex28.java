public class ex28 {
    public static void main(String[] args) {
        int height = 5;
        drawTriangle(height);

    }

    public static void drawTriangle(int height)
    {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
