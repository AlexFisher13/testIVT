package testIVT;


public class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(10);
        map.insert(111, 222);
        map.insert(222, 333);
        map.insert(333, 444);
        map.insert(444, 555);
        map.insert(555, 666);
        System.out.println(map.getValue(111));
        map.delete(111);
        System.out.println(map.getValue(111));
        map.printCount();
        map.printMyHashMap();
    }
}
