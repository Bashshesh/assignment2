public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println(arrayList.getSize());

        arrayList.add(6);
        System.out.println(arrayList.getSize());
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(5));

        arrayList.remove(2);
        arrayList.remove(3);

        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.add("b");
        list.add("c");

        for (String element : list) {
            System.out.print(element + " ");
        }

        System.out.println();
        String second = list.get(1);
        System.out.println(second);

        String removed = list.remove(0);
        System.out.println(removed);

        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println(second);
        System.out.println(list.getSize());
    }


}