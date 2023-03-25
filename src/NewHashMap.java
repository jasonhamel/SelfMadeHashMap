public class NewHashMap <K, V> {
    private final int SIZE = 5;
    private Node<K, V>[] data;
    public NewHashMap() {
        this.data = new Node[SIZE];
    }

    public void put(K key, V value) {
        int address = hash(key);
        Node<K, V> traversalNode = data[address];
        if (traversalNode == null) {
            data[address] = new Node<>(key, value);
        } else {
            while (traversalNode.getNext() != null) {
                if (traversalNode.getKey() == key) {
                    traversalNode.setValue(value);
                    return;
                }
                traversalNode = traversalNode.getNext();
            }
            traversalNode.setNext(new Node<>(key, value));
        }
    }

    public V get(K key) {
        int address = hash(key);
        Node<K, V> traversalNode = data[address];
        if (traversalNode == null) {
            return null;
        } else {
            while (traversalNode != null) {
                if (traversalNode.getKey() == key) {
                    return traversalNode.getValue();
                }
                traversalNode = traversalNode.getNext();
            }
        }
        return null;
    }

    public void remove(K key) {
        int address = hash(key);
        Node<K, V> traversalNode = data[address];
        if (traversalNode == null) {
            return;
        }
        Node<K, V> traversalNodeNext = traversalNode.getNext();
        if (traversalNode.getKey() == key) {
            data[address] = traversalNode.getNext();
            return;
        }

        while (traversalNodeNext != null) {
            if (traversalNodeNext.getKey() == key) {
                Node<K, V> newNode = traversalNodeNext.getNext();
                traversalNode.setNext(newNode);
                return;
            }
            traversalNode = traversalNode.getNext();
            traversalNodeNext = traversalNodeNext.getNext();
        }
    }

    public String getKeys() {
        String keys = "";
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                Node<K, V> traversalNode = data[i];
                while (traversalNode != null) {
                    keys +=  String.valueOf(traversalNode.getKey());
                    traversalNode = traversalNode.getNext();
                    keys += ", ";
                }
            }
        }
        if (keys.length() != 0) {
            keys = keys.substring(0, keys.length() - 2);
        }
        return keys;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }
}
