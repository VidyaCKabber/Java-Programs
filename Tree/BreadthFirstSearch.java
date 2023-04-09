public class BreadthFirstSearch
{
	public static void main(String[] args) {
	    Tree tree = new Tree();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        System.out.println("Level-Order Traversal(BFS) :");
        tree.LevelOrderOfBFS();
	}
}

class Node{
    int data;
    Node left, right;
    
    Node(int value){
        data = value;
        left = right = null;
    }
}

class Tree{
    Node root;
    
    Tree(){
        root = null;
    }
    
    // Method to calculate height of a tree
    int height(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
    
        if (leftHeight > rightHeight)
            return leftHeight + 1;
        else
            return rightHeight + 1;
    }

    // Method to traverse the elements of a tree using BFS (level-order traversal) in recursive way
    void LevelOrderOfBFS() {
        int h = height(root);
        for (int i = 1; i <= h; i++)
            printNodesAtLevel(root, i, 1);
    }

    // Method to print nodes at the given level
    void printNodesAtLevel (Node root, int level, int currentLevel) {
        if (root == null)
            return;
        if (level == currentLevel)
            System.out.print(root.data + " ");
        else {
            printNodesAtLevel(root.left, level, currentLevel + 1);
            printNodesAtLevel(root.right, level, currentLevel + 1);
        }
    }
}

