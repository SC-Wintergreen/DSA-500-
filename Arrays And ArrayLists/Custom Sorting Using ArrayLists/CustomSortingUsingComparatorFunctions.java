
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sortCricketersByName implements Comparator<Cricketers> {

    @Override
    public int compare(Cricketers c1, Cricketers c2) {

        return c1.name.compareTo(c2.name);

    }

}

class sortCricketersByAverageAndAge implements Comparator<Cricketers> {

    @Override
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

    public List<Cricketers> sortCricketersByName(List<Cricketers> cricketers) {

        // Collections.sort(cricketers, new sortCricketersByName());
        // Collections.sort(cricketers, new sortCricketersByAverageAndAge());

        Collections.sort(cricketers, (c1, c2) -> {

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
        List<Cricketers> cricketers = new ArrayList<>();

        cricketers.add(new Cricketers("Virat Kohli", 36, 13920, 283, 44, (float) 93.5, 183));
        cricketers.add(new Cricketers("Rishabh Pant", 26, 871, 27, 1, (float) 106.2, 125));
        cricketers.add(new Cricketers("Rohit Sharma", 37, 10866, 257, 36, (float) 106.2, 264));
        cricketers.add(new Cricketers("KL Rahul", 31, 2851, 72, 14, (float) 87.6, 112));

        // csucf.sortCricketersByName
        csucf.sortCricketersByName(cricketers);

        for (Cricketers cricketer : cricketers) {
            System.out.println(cricketer.name + " " + cricketer.calculateAverage() + " " + cricketer.highScore + " "
                    + cricketer.age);
        }

    }
}