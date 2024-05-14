public interface Node {
    void addNode(Node new_node);
    boolean includes(int k);
    int getKey();
    void print();
}

class NullNode implements Node {
    private NullNode() {}
    private static NullNode instance;
    public static Node getInstance(){
        if (instance == null) instance = new NullNode();
        return instance;
    }

    public void addNode(Node new_node) {}

    public boolean includes(int k){
        return false;
    }

    public int getKey(){
        return -1;
    }

    public void print(){
        System.out.print("-/ ");
    }
}

class BinaryNode implements Node {
    private Node left, right;
    private final int key;

    BinaryNode(int k){
        this.key = k;
        left = right = NodeFactory.getNode();
    }

    public boolean includes(int k){
        if (k == key) return true;
        if (k > key) return right.includes(k);
        else return left.includes(k);
    }

    public int getKey(){
        return key;
    }

    public void addNode(Node new_node){
        if (new_node.getKey() >= this.key) {
            if (right.getKey() < 0) right = new_node;
            else right.addNode(new_node);
        }
        else {
            if (left.getKey() < 0) left = new_node;
            else left.addNode(new_node);
        }
    }

    public void print(){
        left.print();
        System.out.print(key + " ");
        right.print();
    }
}