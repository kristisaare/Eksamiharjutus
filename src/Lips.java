/**
 * Created by kristi on 31/01/16.
 */
public class Lips {
    public static void main(String[] args)
    {
        int n = 9;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j || i == n - j - 1) {
                    System.out.print("0");
                } else if (i > j && i < n - j - 1) {
                    System.out.print("0");
                } else if (i < j && j > n - i - 1) {
                    System.out.print("0");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }
}
