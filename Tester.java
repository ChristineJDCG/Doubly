public class Tester {
    public static void main(String[] args) {
        OLinkedList<String> testList = new OLinkedList<>();

        System.out.println("-----Add first string");
        testList.addAtTail("First");
        System.out.println("Size = " + testList.getSize());
        System.out.println(testList);
        System.out.println();

        System.out.println("----- Add at Tail");
        testList.addAtTail("Last");
        System.out.println("Size = "+testList.getSize());
        System.out.println(testList);
        System.out.println();

        System.out.println("----- Add as head");
        testList.addAsHead("NewHead");
        System.out.println("Size = "+testList.getSize());
        System.out.println(testList);
        System.out.println();

        System.out.println("----- At at Index (1)");
        testList.addAtIndex(1, "Added");
        System.out.println("Size = "+ testList.getSize());
        System.out.println(testList);
        System.out.println();

        System.out.println("----- Get index (Last)");
        System.out.println("Size = "+ testList.getSize());
        System.out.println(testList);
        System.out.println(testList.getIndex("Last"));

        System.out.println("----- Get node at Index (2)");
        System.out.println(testList);
        System.out.println(testList.getNode(2));
        System.out.println();

        System.out.println("----- Replace Object (Replace First to New)");
        System.out.println("List:"+testList);
        System.out.println("Size = "+testList.getSize());
        testList.replace("First","New");
        System.out.println("New List:"+testList);
        System.out.println("Size = "+testList.getSize());
        System.out.println();

        System.out.println("----- Replace Object by index (Replace NewHead to Another)");
        System.out.println("List:"+testList);
        System.out.println("Size = "+testList.getSize());
        System.out.println("Index of NewHead: "+testList.getIndex("NewHead"));
        testList.replaceByIndex(0,"Another");
        System.out.println("New List:"+testList);
        System.out.println("Size = "+testList.getSize());
        System.out.println();

        System.out.println("----- Remove node at Index (2)");
        System.out.println("List:"+testList);
        System.out.println("Size = "+testList.getSize());
        testList.removeAtIndex(2);
        System.out.println("New List:"+testList);
        System.out.println("Size = "+testList.getSize());
        System.out.println();

        System.out.println("----- Remove node by Object (Added)");
        System.out.println("List:"+testList);
        System.out.println("Size = "+testList.getSize());
        testList.remove("Added");
        System.out.println("New List:"+testList);
        System.out.println("Size = "+testList.getSize());
        System.out.println();

        System.out.println("----- Clear List");
        System.out.println("List:"+testList);
        System.out.println("Size = "+testList.getSize());
        testList.clear();
        System.out.println("Size = "+ testList.getSize());
        System.out.println(testList);
        System.out.println();
    }
}
