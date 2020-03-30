package bst;

/**
 * kelas objek Node
 * 
 * @author Aqil Fiqran Dzi'Ul Haq
 * @since 30-Maret-2020
 */

public class Node {
    private Data data;
    private Node left, right;

    public Node(Data data, Node left, Node right) {
        this.left = left;
        this.right = right;
        this.setData(data);
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return this.data;
    }

    public Node getLeft() {
        if (this.hasLeft())
            return this.left;
        return null;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

    public Node getRight() {
        if (this.hasRight())
            return this.right;
        return null;
    }

    public boolean hasRight() {
        return this.right != null;
    }

}