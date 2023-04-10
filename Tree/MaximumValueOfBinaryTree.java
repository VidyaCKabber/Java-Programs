Print Maximum Value
// Description
// You are given a binary tree. You need to print the node that has the highest value in the binary tree using the BFS (Iterative) approach. If the tree is empty, the output should be -1.

﻿
import java.util.*;


class Node { 
	int data; 
	Node left, right; 

	public Node(int value) { 
		data = value; 
		left = right = null; 
	} 
} 

class BinaryTree { 

	Node root; 

    BinaryTree(){
        root = null;
    }	
    
    // Method to construct a binary tree from the given array
	public Node insertNode(int[] elementsArr, Node node, int i){
		if(i < elementsArr.length){
			node = new Node(elementsArr[i]);
			
			node.left = insertNode(elementsArr,node.left,2 * i + 1);
			node.right = insertNode(elementsArr,node.right,2 * i + 2);
		}
		return node;
	}
	
	// Method to find the largest value in the tree
	public int findMax(Node node) 
	{ 
        
		if(node == null){
		    return -1;
		}

		int res = node.data;
		int lres = findMax(node.left);
		int rres = findMax(node.right);
		
		if(lres > res){
		    res = lres;
		} 
		if(rres > res){
		    res = rres;
		}
		return res;
	} 
}
// WARNING: Do not edit the code given below; otherwise the test cases might fail
public class MaximumValueOfBinaryTree{
	public static void main(String[] x){
		BinaryTree tree = new BinaryTree();
		
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		if(size == 0){
		    System.out.println("-1");
		}
		
		else if (size < 0){
		    System.out.println("Size should be a positive integer");
		}
		
		else{
        		int[] elementsArr = new int[size];
        		for(int i = 0; i < size; i++){
        			elementsArr[i] = sc.nextInt();
        		}
        		
        		tree.root = tree.insertNode(elementsArr,tree.root,0);
        		
        		System.out.println(tree.findMax(tree.root));
    		}
	}
}
