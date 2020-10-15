package CollectionsTask;

import java.util.Comparator;

public class CompareByWeight implements Comparator<Object> {
    @Override
    public int compare(Object o1, Object o2) {
        Person person1 = (Person) o1;
        Person person2 = (Person) o2;

        return Double.compare(person1.getWeight(), person2.getWeight());
    }
}
