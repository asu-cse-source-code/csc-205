/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module14ProjectBST;

/**
 * BinarySearchTreeDriver is the Driver for the BinarySearchTree Program
 * @author austinspencer
 * 
 * 
 * OUTPUT:
 * 
 * Tree: 0,0,1,2,3,4,5,6,7,8,9, 
 * Min: 0
 * Max: 9
 * After removing Max:
 * Tree: 0,0,1,2,3,4,5,6,7,8,
 * 3 is found in the tree
 * After removing all occurrences of 0:
 * Tree: 1,2,3,4,5,6,7,8,
 * Number of elements in the tree: 8
 */
public class BinarySearchTreeDriver {

    /**
     * Main method
     * @param args Where we implement the code
     */
    public static void main(String[] args) {
        LinkedBinarySearchTree<Integer> binaryTree = new LinkedBinarySearchTree<>();
        System.out.print("Tree: ");
        
        //Add the elements to the Binary Search Tree
        binaryTree.addElement(0);
        binaryTree.addElement(0);
        binaryTree.addElement(1);
        binaryTree.addElement(2);
        binaryTree.addElement(3);
        binaryTree.addElement(4);
        binaryTree.addElement(5);
        binaryTree.addElement(6);
        binaryTree.addElement(7);
        binaryTree.addElement(8);
        binaryTree.addElement(9);
        
        
        System.out.println(binaryTree.toString());
        //System.out.println("Size: " + binaryTree.size());
        
        
        //Find the min in the tree       
        System.out.println("Min: " + binaryTree.findMin());
        
        //Find the max in the tree
        System.out.println("Max: " + binaryTree.findMax());
        
        //Remove the max
        //binaryTree.removeMax();
        binaryTree.removeElement(0);
        
        
        System.out.println("After removing Max:");
        
        
        
        System.out.print("Tree: ");
        
        //Print contents of tree using the toString method
        System.out.println(binaryTree.toString());
        //System.out.println("Size: " + binaryTree.size());
        
        //Using the searchIterative to find a specific element in the tree
        System.out.println(binaryTree.searchIterative(3)+ " is found in the tree");
        
        
        System.out.println("After removing all occurrences of 0:");
        
        //Removing all occurrences of a specific element
        binaryTree.removeAllOccurrences(0);
        
        
        System.out.print("Tree: ");
        
        
        //Print the new contents of the binary tree
        System.out.println(binaryTree.toString());
        
        //Print the number of elements within the tree
        System.out.println("Size: " + binaryTree.size());
        
        //Print the left sub and the right sub respectively
        System.out.println("The left sub tree: " + binaryTree.getRight());
    }
}
    
