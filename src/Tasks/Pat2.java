package Tasks;

public class Pat2 {
    public static void main(String[] args) {
int n=5;
pattern(n);
        }

    private static void pattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {

            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print star
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // print new line for each row
            System.out.println();


        }
    }

}
