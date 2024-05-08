public class NodeFactory {
    static public Node getNode(){
        return NullNode.getInstance();
    }

    static public Node getNode(int k){
        return new BinaryNode(k);
    }
}
