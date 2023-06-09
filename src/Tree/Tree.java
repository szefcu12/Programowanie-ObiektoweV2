package Tree;

public class Tree {
    private Node root;

    public Tree() {
        this.root = null;
    }

    public void add(String value) {
        checkIfElementDoesNotExist(value);

        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        } else {
            Node current = root;
            Node parent = null;
            while (true) {
                parent = current;
                if (node.value.length() < parent.value.length()) {
                    current = parent.left;
                    if (current == null) {
                        parent.left = node;
                        return;
                    }
                } else {
                    current = parent.right;
                    if (current == null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }

    public void display() {
        checkIfEmpty();

        display(this.root);
        System.out.println();
    }

    private void display(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            display(root.left);
            display(root.right);
        }
    }

    public void displayAsc() {
        checkIfEmpty();

        if (getNodesCount() == 0) {
            throw new IllegalArgumentException("Tree is empty");
        }

        displayAsc(this.root);
        System.out.println();
    }

    private void displayAsc(Node root) {
        checkIfEmpty();

        if (root != null) {
            displayAsc(root.left);
            System.out.print(root.value + " ");
            displayAsc(root.right);
        }
    }

    public void displayDsc() {
        checkIfEmpty();
        displayDsc(this.root);
    }

    private void displayDsc(Node root) {
        if (root != null) {
            displayDsc(root.right);
            System.out.print(root.value + " ");
            displayDsc(root.left);
        }
    }

    public String getMin() {
        return getMin(this.root);
    }

    private String getMin(Node root) {
        if (root != null) {
            if (root.left != null)
                return getMin(root.left);
            return root.value;
        }
        return "";
    }

    public String getMax() {
        return getMax(this.root);
    }

    private String getMax(Node root) {
        if (root != null) {
            if (root.right != null)
                return getMax(root.right);
            return root.value;
        }
        return "";
    }

    public Integer getNodesCount() {
        return getNodesCount(this.root);
    }

    private Integer getNodesCount(Node root) {
        if (root != null) {
            return getNodesCount(root.left) + 1 + getNodesCount(root.right);
        } else
            return 0;
    }

    public void delete(String value) {
        checkIfElementExists(value);
        deleteRecursive(this.root, value);
    }

    private Node deleteRecursive(Node current, String value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            // Case 1: no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: only 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // Case 3: 2 children
            String smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if (value.length() < current.value.length()) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private String findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public Boolean findValue(String value) {
        return findValueRecursive(root, value);
    }

    private boolean findValueRecursive(Node current, String value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        return value.length() < current.value.length()
                ? findValueRecursive(current.left, value)
                : findValueRecursive(current.right, value);
    }

    public void clear() {
        this.root = null;
    }

    public void checkIfEmpty() {
        if (getNodesCount() == 0) {
            throw new IllegalArgumentException("Drzewo jest puste");
        }
    }

    public void checkIfElementExists(String value) {
        if (!findValue(value)) {
            throw new IllegalArgumentException("Wartość nie istnieje w drzewie");
        }
    }

    public void checkIfElementDoesNotExist(String value) {
        if (findValue(value)) {
            throw new IllegalArgumentException("Wartość już istnieje");
        }
    }
}