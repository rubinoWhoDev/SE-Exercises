import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Node myTree = NodeFactory.getNode();
        Scanner s = new Scanner(System.in);
        int node_int, search_int;

        do {
                System.out.print("Inserire un numero positivo da aggiungere nell'albero: ");
                try {
                    node_int = s.nextInt();
                    if (node_int < 0) break;
                    if (myTree.getKey() < 0) myTree = NodeFactory.getNode(node_int);
                    else myTree.addNode(NodeFactory.getNode(node_int));
                } catch (InputMismatchException e){
                    System.out.println("Input non valido.");

                    break;
                }
        } while (true);

        myTree.print();
        System.out.print("\nInserire un numero da cercare nell'albero: ");

        try {
            search_int = s.nextInt();
            if (myTree.includes(search_int)) System.out.println("L'albero contiene il numero " + search_int );
            else System.out.println("L'albero non contiene il numero " + search_int);
        } catch (InputMismatchException e) {
            System.out.println("Input non valido.");
           //e.printStackTrace();
        }
    }
}