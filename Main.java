public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        tree.add(1);
        tree.add(4);
        tree.add(3);
        tree.add(9);
        tree.add(8);
        tree.add(5);

        System.out.println(tree.countNodes());

        System.out.println(tree.countLeafNodes());

        System.out.println(tree.contains(3));

        System.out.println(tree.contains(876543));

        System.out.println(tree.getHeight());


        tree.printInorder();

        System.out.println(" ");

        tree.printPreorder();

        System.out.println(" ");

        tree.printPostorder();



    }
}