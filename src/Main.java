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
    }


}