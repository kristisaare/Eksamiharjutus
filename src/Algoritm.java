import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said üle mediaani?
 */
public class Algoritm {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(yleMediaani(new int[]{19, 45, 55, 67, 89}));
        System.out.println(yleMediaani(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(yleMediaani(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int yleMediaani(int[] ints) {
       Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        int index = 0;

        while (index<ints.length) {
            if (ints[index]>60){
                ints[index]=60;
            }
            index++;
        }

        System.out.println(Arrays.toString(ints));

        int moreThanMedian = (int) Math.floor(ints.length/2);

        System.out.println("More than median results total: " + moreThanMedian);

        return 0;
    }
}
