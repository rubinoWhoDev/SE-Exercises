public class BSTFacade {
    private Node root;
    private final PrintStrategy strategy;

    public BSTFacade(PrintStrategy s){
        root = NullNode.getInst();
        strategy = s;
    }

    public boolean includes(int k){
        return root.includes(k);
    }

    public void insert(int k){
        root = root.insert(k);
    }

    public void print(){
        strategy.print(root);
    }
}