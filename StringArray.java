import java.util.Iterator;

// Class called StringArray created
// Make the class StringArray implements iterable
public class StringArray implements Iterable {
    // Instance variable (4)
    private String[] values;

    //Constructor for StringArray
    public StringArray(String[] values) {
        this.values = values;
    }

    //Function for implement Iterable
    public Iterator iterator() {
        return new ArrayIterator(values);
    }
    private static class ArrayIterator implements Iterator {
        String[] values;
        int current;

        public ArrayIterator(String[] values) {
            this.values = values;
            current = 0;
        }
        public boolean hasNext() {
            return current < values.length && values[current] != null;
        }


        public String next() {
            String string = values[current];
            current = current + 1;
            return string;
        }
    }

    // Inner class iterator traverses only string elements equal or longer
    // then 4 characters
    // not tested
    private static class LongStringIterator implements Iterator {
        String[] values;
        int current;

        public LongStringIterator(String[] values) {
            this.values = values;
            current = 0;
        }

        public boolean hasNext() {
            return current < values.length && values[current] != null;
        }

        public Object next() {
            String string = values[current];
            current = current + 1;

            if (string.length() > 4) {
                return string;
            } else {
                return null;
            }
        }
    }


    // Main
    public static void main(String[] args) {
        String[] stepOneInput = new String[]{"One", "Two", "Three", "Four", "Five"};
        StringArray output = new StringArray(stepOneInput);

        for (Object content : output) {
            System.out.println(content);
        }


    }

}