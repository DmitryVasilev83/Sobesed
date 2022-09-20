package les2_real;

public class LinkList<E> {

    int size;
    LinkList.Node<E> first;
    LinkList.Node<E> last;

    public LinkList() {
        this.size = 0;
    }

    private static class Node<E> {
        E item;
        LinkList.Node<E> next;
        LinkList.Node<E> prev;

        Node(LinkList.Node<E> prev, E element, LinkList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    void addLast(E e) {
        LinkList.Node<E> lastNode = this.last;
        LinkList.Node<E> newNode = new LinkList.Node(lastNode, e, (LinkList.Node)null);
        this.last = newNode;
        if (lastNode == null) {
            this.first = newNode;
        } else {
            lastNode.next = newNode;
        }
        ++this.size;
    }

    LinkList.Node<E> node(int index) {
        LinkList.Node x;
        int i;
        if (index < this.size >> 1) {
            x = this.first;
            for(i = 0; i < index; ++i) {
                x = x.next;
            }
            return x;
        } else {
            x = this.last;
            for(i = this.size - 1; i > index; --i) {
                x = x.prev;
            }
            return x;
        }
    }

    public boolean remove(Object o) {
        LinkList.Node x;
        if (o == null) {
            for(x = this.first; x != null; x = x.next) {
                if (x.item == null) {
                    this.unlink(x);
                    return true;
                }
            }
        } else {
            for(x = this.first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    this.unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    E unlink(LinkList.Node<E> x) {
        E e = x.item;
        LinkList.Node<E> next = x.next;
        LinkList.Node<E> prev = x.prev;
        if (prev == null) {
            this.first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }
        if (next == null) {
            this.last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }
        x.item = null;
        --this.size;
        return e;
    }

}
