import java.util.Queue;
import java.util.LinkedList;

class BFSImplementationUsingQueue {
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
        tree.LevelOrderOrBFS();
    }
}

class Node{
    int data;
    Node left, right;
    
    Node(int value){
        data = value;
    }
}

class Tree{
    Node root;
    
    Tree(){
        root = null;
    }
    
    void LevelOrderOrBFS(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            Node temp = queue.peek();
            queue.remove();
            
            System.out.println(temp.data + " ");
            
            //enqueue left child into queue
            if(temp.left != null)
                queue.add(temp.left);
            
            //enqueue right child into queue
            if(temp.right != null)
                queue.add(temp.right);
        }
    }
}
