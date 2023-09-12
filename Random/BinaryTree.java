package Random;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    public void dfs() {
        dfsRecursive(root);
    }

    private void dfsRecursive(TreeNode node) {
        if (node != null) {
            // Visita o nó atual (pode ser substituído por qualquer ação desejada)
            System.out.print(node.data + " ");

            // Visita o nó filho esquerdo recursivamente
            dfsRecursive(node.left);

            // Visita o nó filho direito recursivamente
            dfsRecursive(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("DFS (em ordem):");
        tree.dfs();
    }
}

