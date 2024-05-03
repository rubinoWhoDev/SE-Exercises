public interface Node{
    Node insert(int k);
    void print();
    boolean includes(int k);
    Node getLeft();
    Node getRight();
}

class NullNode implements Node{
    private static NullNode inst;
    private NullNode() {}

    public static NullNode getInst() {
        if (inst == null) inst = new NullNode();
        return inst;
    }

    @Override
    public void print(){
    }

    @Override
    public boolean includes(int k){
        return false;
    }

    @Override
    public Node insert(int k){
        return new BinaryTree(k);
    }

    @Override
    public Node getLeft(){
        return this;
    }

    @Override
    public Node getRight(){
        return this;
    }
}

class BinaryTree implements Node{
    private final Node[] children = new Node[2];
    private final int key;

    public BinaryTree(int k) {
        this.key = k;
        for (int i = 0; i < children.length; i++) children[i] = NullNode.getInst();
    }

    @Override
    public void print(){
        System.out.print(" " + key);
    }

    @Override
    public Node insert(int k){
        if (k >= this.key) children[1] = children[1].insert(k);
        else children[0] = children[0].insert(k);
        return this;
    }
    @Override
    public boolean includes(int k){
        if (k == this.key) return true;
        if (k > this.key) return children[1].includes(k);
        else return children[0].includes(k);
    }

    @Override
    public Node getLeft(){
        return children[0];
    }

    @Override
    public Node getRight(){
        return children[1];
    }
}