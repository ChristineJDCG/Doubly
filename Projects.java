public class Projects {
    public static OLinkedList repositoryList = new OLinkedList();
    public static void createRepositoryList(){

        Node Files = new Node("Files");;
       Node Tags = new Node("Branches");
        Node Commits = new Node ("Commits");
        Node Contributors = new Node("Graph");
        Node Compare = new Node("Compare");
        Node Chart = new Node ("Charts");

        repositoryList.addAtTail(Files);
        repositoryList.addAtTail(Commits);
        repositoryList.addAfterGivenNode(Files,Tags);
        repositoryList.addAtTail(Contributors);
        repositoryList.addAtTail(Compare);
        repositoryList.addAtTail(Chart);

        System.out.println(repositoryList);
        System.out.println(repositoryList.getIndex(Files));


    }

    public static void main(String[] args) {
        createRepositoryList();
        //repositoryList.removeHead();
       //repositoryList.addAfterGivenNode(Files,);

    }


}
