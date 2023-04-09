
class Pre_In_Post_Order_Traversal{
    
    public static void main(String[] args){
        Tree tree = new Tree();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);
        
        System.out.println("\n Pre-Oder traversal : ");
        tree.PreOrderDFS(tree.root);
        
        System.out.println("\n In-Oder traversal : ");
        tree.InOrderDFS(tree.root);
        
        System.out.println("\n Post-Oder traversal : ");
        tree.PostOrderDFS(tree.root);
        
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

class Tree{
    Node root;
    
    Tree(){
        root = null;
    }
    
    void PreOrderDFS(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        
        PreOrderDFS(node.left);
        PreOrderDFS(node.right);
    }
    
    void InOrderDFS(Node node){
        if(node == null){
            return;
        }
        InOrderDFS(node.left);
        System.out.print(node.data + " ");
        InOrderDFS(node.right);
    }
    
    void PostOrderDFS(Node node){
        if(node == null){
            return;
        }
        PostOrderDFS(node.left);
        PostOrderDFS(node.right);
        System.out.print(node.data + " ");
    }
}
