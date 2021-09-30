package exercises.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        return flavor1.getName().compareTo(flavor2.getName());

        // To sort the flavors from highest to lowest number of allergens, use:

        // return flavor2.getAllergens().size() - flavor1.getAllergens().size();
    }

}
