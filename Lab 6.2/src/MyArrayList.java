package hystannasa.mirea.labt62;

public class MyArrayList<E> {
    private int size;
    private int index;
    private static final int CAPACITY = 16;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(E item) {
        if (index == elements.length)
            growArray();
        elements[index] = item;
        index++;
        size++;
    }

    public void add(E item, int index) {
        checkIndex(index);
        if (index == elements.length)
            growArray();

        System.arraycopy(elements, index, elements, index + 1, this.index - index);
        elements[index] = item;
        this.index++;
        size++;
    }

    private void growArray() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, index - 1);
        elements = newArray;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.index)
            throw new IllegalArgumentException();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        System.arraycopy(elements, 0, elements, 0, 0);
        size = 0;
        this.index = 0;
    }

    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i < size; i++){
            str = str + elements[i];
            if(i + 1 < size)
                str += ", ";
        }
        return str;
    }
}
