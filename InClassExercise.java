import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class InClassExercise {
    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<String>(); // Create an ArrayList object

        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("three");
        stringArrayList.add("four");
        stringArrayList.add("five");

      // Iterating using Iterator
        Iterator<String> strIterator = stringArrayList.iterator();
        System.out.println("Using iterator on arrayList: ");
        while(strIterator.hasNext()) {
            System.out.println(strIterator.next());
        }

        // convert to TreeSet
        TreeSet<String> ts = new TreeSet<String>(stringArrayList);

        System.out.println("\nUsing iterator on TreeSet: ");

        Iterator<String> tsIterator = ts.iterator();
        while(tsIterator.hasNext()) {
            System.out.println(tsIterator.next());
        }


    }
}
