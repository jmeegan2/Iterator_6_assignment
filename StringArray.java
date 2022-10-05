import java.util.Iterator;

public class StringArray<T> implements Iterable<T> {
    //Instance variable
    String[] values;

    // Create a class constructor for StringArray Class
    public StringArray() {

    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }


    public class ArrayIterator<T> implements Iterator<T> {
        int current;

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

    public static void main(String[] args) {

        StringArray Obj = new StringArray();

        Obj.add("one");
    }


}