import java.util.ArrayList;

/*
 *Names: GONZALES, Christine Joy D.
 *       TAPEC, Deanne Ruth L.
 *       TAYABA, Andrea Gale M.
 *CLASSCODE & Schedule: 9391 9:30-11:00 TF
 *Start Date: August 23, 2019
 *Instructor: Roderick Makil
 *
 *Problem:
 *      Write a program that
 *
 *Algorithm:
 **/
public class OLinkedList <T>{
    int size;
    Node<T> head;
    //Node tail;


    //working
    //add a node at the beginning
    public void addBeforeHead (T item){
        Node <T> newNode = new Node<T>(item);
        if(head != null){
            head.prevNode= newNode;
            newNode.setNextNode(head);
            this.head=newNode;
        }
        head = newNode;
        size++;
    }

    //working
    public void addAtTail (T item){
        Node newNode = new Node<T>(item);
        newNode.nextNode=null;

        if(head == null){
            head = newNode;
        }else {
            Node<T> tail = getTail(head);
            tail.setNextNode(newNode);
            newNode.setPrevNode(tail);
        }
        size++;
    }

//working
    public void addAtIndex(T item, int index) throws IndexOutOfBoundsException {
        if (index == 0){
            addBeforeHead(item);
            return;
        }

        if (index == this.size){
            addAtTail(item);
        }
        else if (index < this.size) {
            Node<T> newNode = new Node<T>(item);
            newNode.setPrevNode(getNode(index).getPrevNode());
            newNode.setNextNode(getNode(index));
            (getNode(index).getPrevNode()).setNextNode(newNode);
            getNode(index).setPrevNode(newNode);
            size++;
        }else {
            throw new IndexOutOfBoundsException("Index not applicable");
        }

    }

    //working
    public Node<T> getNode (int index) {
        if (index < 0 || index > this.size - 1) {
            throw new IndexOutOfBoundsException("Index cannot be found");
        }
        if (index == 0) {
            return this.head;
        }
        if (index == this.size - 1) {
            return getTail(this.head);
        }
        int pointer = 0;
        Node<T> pointerNode = this.head;
        while (pointer < index){
        pointerNode=pointerNode.getNextNode();
        pointer++;
        }
        return pointerNode;
    }

//working
    //get Tail of a node
    public Node<T> getTail (Node<T> givenNode){
        if (givenNode != null){
            Node<T> tail = givenNode;
            if (givenNode.getNextNode() != null){
                return getTail(tail.getNextNode());
            } else {
                return tail;
            }
        }
        return null;
    }


//    public void addAfterGivenNode ( Node <T> givenNode, T item){
//
//        if (givenNode==null){
//            System.out.println("Chosen node is empty");
//            return;
//        }
//        //declare item as node
//    //    Node <T> newNode = new Node<T>(item);
//        int index = getIndex(givenNode.getData());
//        addAtIndex(item,index+1);
//
////        newNode.setNextNode(givenNode.getNextNode());
////        givenNode.setNextNode(newNode);
////        newNode.setPrevNode(givenNode);
////
//////        if (newNode.getNextNode()==null){
//////            newNode.getNextNode().setPrevNode(newNode);
//////        }
//
//    }


    //null pointer exception
    public void removeHead (){
        Node<T> tmpNode = this.head.getNextNode();
        if (tmpNode!=null){
            tmpNode.setPrevNode(null);
        }
        this.head=tmpNode;
        size--;
    }

    //nullpointer exception
    public void removeTail(){
        Node<T> tail = getTail(head);
        Node<T> tmp = tail.getPrevNode();
        tail.setNextNode(null);
        size--;
    }

    //head is null
    public void removeAtIndex (int index){
        if (this.head == null){
            return;
        }
        if (index < 0|| index >= this.size){
            throw new IndexOutOfBoundsException("Index not Applicable");
        }
        Node <T> tmp = getNode(index);
        (tmp.getNextNode()).setPrevNode(tmp.getPrevNode());
        (tmp.getPrevNode()).setNextNode(tmp.getNextNode());
        size--;
    }

    public void removeGivenNode(Node givenNode){
        if (givenNode==null){
            System.out.println("Chosen node not found");
            return;
        }
        givenNode.getPrevNode().setNextNode(givenNode.getNextNode());
        givenNode.getPrevNode().setPrevNode(givenNode.getPrevNode());
        givenNode = null;
        size--;
    }

    public void replace (Node givenNode, T item){
        if (givenNode==null){
            System.out.println("Chosen node not found");
            return;
        }
        Node newNode = new Node(item);
        givenNode = newNode;

    }

    //working
  public int getSize (){
        return this.size;
  }

  //incomplete
  public ArrayList<T> toArray () {
     ArrayList<T> inArray = new ArrayList <T>();
    for (int x = 0; x == getSize(); x++ ){
       // inArray.add(head);
        head=head.nextNode;
    }
    return inArray;
    }

@Override
    public String toString() {

       StringBuffer str = new StringBuffer();
       while (head != null){
           str.append(head.data+",");
           head=head.nextNode;
       }
        return str.toString();
    }
}


