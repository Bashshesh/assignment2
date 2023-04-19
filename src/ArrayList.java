public class ArrayList<T> {
    private Object[] array;
    private int size;

    public ArrayList() {
        array = new Object[5];
        size = 0;
    }

    public void add(T element) {
        if (size == array.length) {
            increaseBuffer();
        }
        array[size] = element;
        size++;
    }

    private void increaseBuffer() {
        Object[] newArray = new Object[2 * array.length];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) array[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public int getSize() {
        return size;
    }
}
