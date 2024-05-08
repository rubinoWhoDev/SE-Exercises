public class Main {
    public static void main(String[] args) {
        Node myTree = NodeFactory.getNode(4);

        myTree.addNode(NodeFactory.getNode(5));
        myTree.addNode(NodeFactory.getNode(3));
        myTree.addNode(NodeFactory.getNode(1));
        myTree.addNode(NodeFactory.getNode(6));
        //myTree.addNode(NullNode.getInstance());


        myTree.print();
    }
}