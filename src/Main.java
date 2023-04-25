public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> array = new MyArrayList<Integer>();
        MyArrayList array1 = new MyArrayList();
        array.add(0);
        array.add(13);
        array.add(11);
        array.add(10);
        array.add(12);
        array.add(13);
        array.add(10);
        array.add(11);
        array.getArray();
        System.out.println();
        array.DeleteDub();
        array.getArray();
    }
}
