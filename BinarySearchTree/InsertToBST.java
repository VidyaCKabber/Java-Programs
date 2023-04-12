
class InsertToBST{
    
    public static void main(String[] args){
        BST bst = new BST();
        
        bst.root = new Node(4);
        bst.root.left = new Node(2);
        bst.root.right = new Node(6);
        bst.root.left.left = new Node(1);
        bst.root.left.right = new Node(3);
        bst.root.right.right = new Node(7);
        
        System.out.println("\n In-Oder traversal before insertion: ");
        bst.InOrderDFS(bst.root);
        
        int key=5;
        bst.insert(bst.root, key);
        
        System.out.println("\n In-Oder traversal after insertion: ");
        bst.InOrderDFS(bst.root);
    }
}

class Node{
    int data;
    Node left, right;
    
    public Node(int value){
        data = value;
        left = right = null;
    }
}

class BST{
    Node root;
    
    BST(){
        root = null;
    }
    
    void InOrderDFS(Node node){
        if(node == null){
            return;
        }
        InOrderDFS(node.left);
        System.out.print(node.data + " ");
        InOrderDFS(node.right);
    }
    
    Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
    
        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
    
        return node;
    }
}
