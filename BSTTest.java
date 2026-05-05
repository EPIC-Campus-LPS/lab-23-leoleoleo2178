import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    @org.junit.jupiter.api.Test
    void add() {
        BST<Integer> tree = new BST<>();

        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(9);
        tree.add(8);
        tree.add(5);
    }

    @org.junit.jupiter.api.Test
    void contains() {
        BST<Integer> tree = new BST<>();

        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(9);
        tree.add(8);
        tree.add(5);

        System.out.println(tree.contains(3));

        System.out.println(tree.contains(876543));

    }

    @org.junit.jupiter.api.Test
    void countNodes() {
        BST<Integer> tree = new BST<>();

        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(9);
        tree.add(8);
        tree.add(5);

        System.out.println(tree.countNodes());

    }

    @org.junit.jupiter.api.Test
    void countLeafNodes() {
        BST<Integer> tree = new BST<>();

        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(9);
        tree.add(8);
        tree.add(5);

        System.out.println(tree.countLeafNodes());

    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        BST<Integer> tree = new BST<>();

        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(9);
        tree.add(8);
        tree.add(5);

        System.out.println(tree.getHeight());

    }

    @org.junit.jupiter.api.Test
    void printInorder() {
        BST<Integer> tree = new BST<>();

        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(9);
        tree.add(8);
        tree.add(5);

        tree.printInorder();
    }

    @org.junit.jupiter.api.Test
    void printPreorder() {
        BST<Integer> tree = new BST<>();

        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(9);
        tree.add(8);
        tree.add(5);

        tree.printPreorder();

    }

    @org.junit.jupiter.api.Test
    void printPostorder() {
        BST<Integer> tree = new BST<>();

        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(9);
        tree.add(8);
        tree.add(5);

        tree.printPostorder();

    }
}