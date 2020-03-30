package bst;

public class Bst {
    private Node root;
    private int size;

    public Bst() {
        this.root = null;
        this.size = 0;
    }

    public boolean add(Data data) {
        Node current, previous, news;

        previous = null;
        current = this.getRoot();

        while (current != null) {
            previous = current;
            if (data.getNama().compareTo(current.getData().getNama()) < 0)
                current = current.getLeft();
            else
                current = current.getRight();
        }

        news = new Node(data, null, null);
        this.incSize();
        if (previous == null) {
            this.setRoot(news);
            return true;
        }

        if (data.getNama().compareTo(previous.getData().getNama()) < 0)
            previous.setLeft(news);
        else
            previous.setRight(news);
        return true;
    }

    private void inOrder(Node root) {
        if (root != null) {
            inOrder(root.getLeft());
            System.out.println(root.getData().getNama());
            inOrder(root.getRight());
        }
    }

    public void display() {
        this.inOrder(this.getRoot());
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void incSize() {
        this.size++;
    }

    public int getSize() {
        return this.size;
    }

    public Node search(Data data) {
        Node current = this.getRoot();

        while (current != null) {
            if (current.getData().getNama().equals(data.getNama()))
                return current;
            else if (data.getNama().compareTo(current.getData().getNama()) < 0)
                current = current.getLeft();
            else
                current = current.getRight();
        }

        return null;
    }

    public Node getRoot() {
        return this.root;
    }
}