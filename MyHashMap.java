package testIVT;

public class MyHashMap {
    int arraySize;
    Entry[] array;

    public MyHashMap(int arraySize) {
        this.arraySize = arraySize;
        array = new Entry[arraySize];
    }

    public int hashFunc(Object key) {
        return key.hashCode() % arraySize;
    }

    public void insert (Object key, Object value) {
        int hashKey = hashFunc(key);
        while (array[hashKey] != null){
            hashKey++;
        }
        array[hashKey] = new Entry(key, value);
    }

    public Object getValue(Object key) {
        int hashKey = hashFunc(key);
        while (array[hashKey] != null){
            if (array[hashKey].getKey() == key) {
                return array[hashKey].getValue();
            }
            hashKey++;
        }
        return null;
    }

    public void delete(Object key) {
        int hashKey = hashFunc(key);
        array[hashKey] = null;
    }

    public void printCount() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if  (array[i] != null){
                count++;
            }
        }
        System.out.println("Количество пар в таблице: " + count);
    }

    public void printMyHashMap() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
            array[i].printEntry();
        }
    }

    public class Entry {
        Object key;
        Object value;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public void printEntry() {
            System.out.println(key + "-" + value);
        }
    }
}


