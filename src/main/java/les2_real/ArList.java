package les2_real;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class ArList<E> extends AbstractList<E> implements List<E>{


    Object[] arrayOur;
    private int size = 0;

    public ArList() {
        this.arrayOur = new Object[5];
    }

    @Override
    public int size() {
        return arrayOur.length;
    }

    public E get(int index){
       Objects.checkIndex(index, size());
       return (E) arrayOur[index];
   }

    public boolean add(E e) {
        if (size == arrayOur.length - 1){
            Object[] newArrayOur = new Object[arrayOur.length*2];
            System.arraycopy(arrayOur, 0, newArrayOur, 0, size);
            arrayOur = newArrayOur;
        }
        arrayOur[size++] = e;
        return true;
    }

    public E remove(int index) {
        Objects.checkIndex(index, size());
        Object[] newArrayOur = this.arrayOur;
        E oldValue = (E) newArrayOur[index];
        int newSize;
        if ((newSize = this.size - 1) > index) {
            System.arraycopy(newArrayOur, index + 1, newArrayOur, index, newSize - index);
        }
        return oldValue;
    }
}
