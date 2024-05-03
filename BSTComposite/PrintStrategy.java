public interface PrintStrategy {
    void print(Node n);
}

class PreOrderStrategy implements PrintStrategy{
    public void print(Node n){
        if (n instanceof NullNode){
            return;
        }
        n.print();
        print(n.getLeft());
        print(n.getRight());
    }
}

class InOrderStrategy implements PrintStrategy{
    public void print(Node n){
        if (n instanceof NullNode){
            return;
        }
        print(n.getLeft());
        n.print();
        print(n.getRight());
    }
}

class PostOrderStrategy implements PrintStrategy{
    public void print(Node n){
        if (n instanceof NullNode){
            return;
        }
        print(n.getLeft());
        print(n.getRight());
        n.print();
    }
}