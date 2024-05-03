public class Main {
    public static void main(String[] args) {
        BSTFacade myTree = new BSTFacade(new InOrderStrategy());

        myTree.insert(3);
        myTree.insert(10);
        myTree.insert(1);
        myTree.insert(-2);
        myTree.insert(11);

        myTree.print();
    }
}