import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        IntegerListImpl arrayList = new IntegerListImpl();

        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);

        System.out.println(arrayList);

        arrayList.add(10);
        System.out.println(arrayList);

        arrayList.add(100);
        System.out.println(arrayList);

        arrayList.add(2, 1000);
        System.out.println(arrayList);

        arrayList.add(2, 777);
        System.out.println(arrayList);

        arrayList.add(7, 333);
        arrayList.add(7, 555);
        System.out.println(arrayList);

        Integer findCount = 2;

        System.out.println(arrayList.contains(findCount));

        System.out.println(arrayList);

    }
}