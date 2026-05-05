public class BST<E extends Comparable<E>> {

    private TreeNode root = null;

    public void add(E value) {
        if(root == null){
            TreeNode adding = new TreeNode<>(value, null, null);
            root = adding;
            return;
        }
        addrecursive(value, root);
    }

    private TreeNode addrecursive(E value, TreeNode current){
        if (current == null) {
            current = new TreeNode<>(value, null, null);
            return current;

        } else {

            TreeNode adding = new TreeNode<>(value, null, null);

            int val = current.compareTo(adding);

            if (val > 0){
                current.setLeftChild(addrecursive(value, current.getLeftChild()));
            } else if (val <= 0) {
                current.setRightChild(addrecursive(value, current.getRightChild()));
            }

        }

        return current;
    }

    public boolean contains(E value){
        return recusivecontains(value, root);
    }

    private boolean recusivecontains(E value, TreeNode current) {

        TreeNode adding = new TreeNode(value, null, null);
        if(!(current.compareTo(adding) == 0)) {

            int val = current.compareTo(adding);

            if (val <= 0) {
                addrecursive(value, current.getLeftChild());
            } else if (val > 0) {
                addrecursive(value, current.getRightChild());
            }

        } else if (current.compareTo(adding) == 0) {

            return true;
        }


        return false;
    }


    public int countNodes(){
        return recusivecount(root);
    }

    private int recusivecount(TreeNode current) {

        if(current == null){
            return 0;
        }


        return 1 + recusivecount(current.getLeftChild()) + recusivecount(current.getRightChild());
    }


    public int countLeafNodes(){
        return recusiveleafcount(root);
    }

    private int recusiveleafcount(TreeNode current) {

        if(current == null){
            return 0;
        }

        int maybe = 0;

        if(current.getLeftChild() == null && current.getRightChild() == null){
            maybe = 1;
        }


        return maybe + recusiveleafcount(current.getLeftChild()) + recusiveleafcount(current.getRightChild());
    }


    public int getHeight(){
        return recusiveheight(root);
    }

    private int recusiveheight(TreeNode current){
        int height = 0;
        boolean h = false;
        int height1 = 0;
        int height2 = 0;
        if (current != null){
            if(current.getLeftChild() != null){
                h = true;
                height1 = recusiveheight(current.getLeftChild());
            }

            if(current.getRightChild() != null){
                h = true;
                height1 = recusiveheight(current.getRightChild());
            }

            if (h){
                height++;
            }

        }
        if(height2 >= height1){
            height += height2;
        } else {
            height += height1;
        }


        return height;
    }


    public void printInorder(){
        recursivein(root);
    }

    private void recursivein(TreeNode t){


        if(t == null){
            return;
        }

        recursivein(t.getLeftChild());

        System.out.print(t.getValue() + " ");

        recursivein(t.getRightChild());



    }


    public void printPreorder(){
        recursivePre(root);
    }

    private void recursivePre(TreeNode t){


        if(t == null){
            return;
        }


        System.out.print(t.getValue() + " ");

        recursivePre(t.getLeftChild());

        recursivePre(t.getRightChild());



    }

    public void printPostorder(){
        recursivePost(root);
    }

    private void recursivePost(TreeNode t){


        if(t == null){
            return;
        }


        recursivePost(t.getLeftChild());

        recursivePost(t.getRightChild());

        System.out.print(t.getValue() + " ");



    }

}
