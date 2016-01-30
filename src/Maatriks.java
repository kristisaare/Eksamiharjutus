import java.util.Arrays;

/**
 * Prindi konsooli 10x100 maatriks, kus läheb joon sikk-sakk ülevalt alla.
 *
 * Näide:
 * x
 *  x
 *   x
 *    x
 *     x
 *      x
 *       x
 *        x
 *         x
 *          x
 *         x
 *        x
 *       x
 *      x
 *     x
 *    x
 *   x
 *  x
 * x
 *  x
 *   x
 *    x
 *     x
 *      jne.
 *
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class Maatriks {
    public static void main(String[] args) {

        int maxRows = 10;

        String [][] table = new String[10][10];
        for (int a=0; a<10;a++){
            table[a][a]= "x";
        }

        for (int a=0; a<10;a++){
            System.out.println(Arrays.toString(table[a]));
        }
    }

}
