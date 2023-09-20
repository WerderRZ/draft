package Tests.Structure.BinaryTree;

public class MainBinTree {
    public static void main(String[] args) {
       testMyBinaryTree();
       testTree();
    }

    public static void testMyBinaryTree() {
        MyBinaryTree tree = new MyBinaryTree();
        tree.add(15);
        tree.add(10);
        tree.add(18);

        tree.add(7);
        tree.add(12);
        tree.add(5);
        tree.add(8);

        tree.add(18);
        tree.add(20);
        tree.add(19);
    }

    public static void testTree() {
        Tree theTree = new Tree();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.7);
        theTree.insert(75, 1.9);

        Node found = theTree.find(25);
        if (found != null) {
            System.out.println("Key 25 founded");
        } else {
            System.out.println("Key 25 not founded");
        }

        theTree.insert(65, 1.5);
        theTree.insert(78, 1.7);
        theTree.insert(71, 1.9);
        theTree.insert(80, 1.5);
        theTree.insert(72, 1.7);

        theTree.printTree();

        theTree.delete(75);

        theTree.printTree();






    }
}
