
import java.util.Arrays;
import java.util.Comparator;

class sortCricketers implements Comparator<Cricketers> {

    public int compare(Cricketers c1, Cricketers c2) {

        if (c1.calculateAverage() == c2.calculateAverage()) {

            if (c1.highScore == c2.highScore)
                return c1.age - c2.age;

            return c2.highScore - c1.highScore;

        }

        return (int) (c2.calculateAverage() - c1.calculateAverage());

    }
}

public class CustomSortingUsingComparatorFunctions {

    // Sorting Using Comparator Interface
    public Cricketers[] sortCricketersByAverageAndAge(Cricketers[] cricketers) {
        Arrays.sort(cricketers, new sortCricketers());

        return cricketers;
    }

    // Sorting Using Lambda Function

    public Cricketers[] sortCricketersByAverageAndAge2(Cricketers[] cricketers) {

        Arrays.sort(cricketers, (c1, c2) -> {

            if (c1.calculateAverage() == c2.calculateAverage()) {

                if (c1.highScore == c2.highScore)
                    return c1.age - c2.age;

                return c2.highScore - c1.highScore;

            }

            return (int) (c2.calculateAverage() - c1.calculateAverage());
        });

        return cricketers;
    }

    public static void main(String[] args) {

        CustomSortingUsingComparatorFunctions csucf = new CustomSortingUsingComparatorFunctions();

        Cricketers[] cricketers = new Cricketers[4];

        cricketers[0] = new Cricketers("Virat Kohli", 36, 13920, 283, 44, (float) 93.5, 183);
        cricketers[1] = new Cricketers("Rishabh Pant", 26, 871, 27, 1, (float) 106.2, 125);
        cricketers[2] = new Cricketers("Rohit Sharma", 37, 10866, 257, 36, (float) 106.2, 264);
        cricketers[3] = new Cricketers("KL Rahul", 31, 2851, 72, 14, (float) 87.6, 112);

        // csucf.sortCricketersByAverageAndAge(cricketers);
        csucf.sortCricketersByAverageAndAge2(cricketers);

        for (Cricketers cricketer : cricketers) {
            System.out.println(cricketer.name + " " + cricketer.calculateAverage() + " " + cricketer.highScore + " "
                    + cricketer.age);
        }

    }
}
