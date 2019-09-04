public class OLinkedList <T> {
    private int size;
    private Node<T> head;

    public int getSize (){
        return size;
    }

    public void addAtTail (T item){
        if (item == null){
            return;
        }
        Node<T> newNode = new Node<T>(item);
        if (head == null){
            head = newNode;
        }else {
            Node<T> tail = getTail(head);
            tail.setNextNode(newNode);
            newNode.setPrevNode(tail);
        }
        size++;
    }

    public void addAsHead (T item){
        if (item == null){
            return;
        }
        Node <T> newNode = new Node<T>(item);
        if (head == null){
            head = newNode;
        }else{
            head.setPrevNode(newNode);
            newNode.setNextNode(head);
            head = newNode;
        }
        size++;
    }

    public void addAtIndex (int index, T item){
        try {
            if (item == null) {
                return;
            }
            if (index == 0){
                addAsHead(item);
                return;
            }
            if (index == size-1){
                addAtTail(item);
                return;
            } else {
                Node<T> newNode = new Node<T>(item);
                Node<T> nextOfNew = getNode(index);
                Node<T> prevOfNew =  nextOfNew.getPrevNode();
                prevOfNew.setNextNode(newNode);
                newNode.setPrevNode(prevOfNew);
                nextOfNew.setPrevNode(newNode);
                newNode.setNextNode(nextOfNew);
               size++;
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index not applicable");
        }
    }

    public  Node<T> getTail (Node<T> givenNode){
        if (givenNode != null){
            Node <T> tail = givenNode;
            if (tail.getNextNode()!=null){
                return getTail(tail.getNextNode());
            }else {
                return tail;
            }
        }
        return null;
    }

    public Node<T> getNode (int index){
        if (index < 0 || index >= this.size -1){
            throw new IndexOutOfBoundsException("Index not applicable");
        }
        if (index == 0){
            return this.head;
        }
        int current = 0;
        Node <T> currentNode = this.head;
        while (current <= index){
            if (current == index){
                return currentNode;
            }else {
                currentNode = currentNode.getNextNode();
                current++;
            }
        }
        return null;
    }

    public int getIndex (T item){
        try {
            if (item == null) {
                return -1;
            }
            int index = 0;
            Node<T> currentNode = head;

            while (!currentNode.equals(item)) {
                currentNode = currentNode.getNextNode();
                index++;
            }
            return index;
        }catch (NullPointerException e){
            System.out.println("Item not found");
         return -1;
        }
    }

    public void remove (T item){
        if(item == null){
            return;
        }
        removeAtIndex(getIndex(item));
    }

    public void removeAtIndex (int index){
        if (head == null){
            return;
        }
        if (index < 0 || index >= this.size){
            throw new IndexOutOfBoundsException("Index not applicable");
        }
        if (index == 0){
            Node <T> nextNode = head.getNextNode();
            if (nextNode != null){
                nextNode.setPrevNode(null);
            }
            head = nextNode;
        }
        if (index == this.size-1){
            Node<T> tail = getTail(head);
            Node<T> prevNode = tail.getPrevNode();
            prevNode.setNextNode(null);
        }
        else {
            Node <T> targetNode = getNode(index);
            Node <T> nextNode = targetNode.getNextNode();
            Node<T> prevNode = targetNode.getPrevNode();
            nextNode.setPrevNode(prevNode);
            prevNode.setNextNode(nextNode);
        }
        size--;
    }

    public void clear () {
        head = null;
        size = 0;
    }

    public void replace (T old, T item){
        int index = this.getIndex(old);
        System.out.println(index);
        addAtIndex(index,item);
        remove(old);
    }

    public void replaceByIndex (int index, T item){
        addAtIndex(index,item);
        removeAtIndex(index-1);
    }

    @Override
    public String toString (){
        String inString = "[";
        Node<T> currentNode = head;
        while (currentNode != null){
            inString = inString + currentNode.toString();
            currentNode = currentNode.getNextNode();
            if (currentNode != null){
                inString = inString + ",";
            }
        }
        inString = inString + "]";
        return inString;
    }
}
