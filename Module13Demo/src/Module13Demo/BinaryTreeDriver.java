/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module13Demo;

import java.util.Iterator;

/**
 * 
 * @author Dilshad
 * This class test the LinkedBinaryTree class
 *
 */
public class BinaryTreeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

            LinkedBinaryTree<Integer> binaryTree = new LinkedBinaryTree<>();
            System.out.println("Level order insertion to the binary tree");
            binaryTree.insert(7);
            binaryTree.insert(3);
            binaryTree.insert(9);
            binaryTree.insert(4);

            binaryTree.insert(89);
            binaryTree.insert(90);
            binaryTree.insert(48);

            System.out.println("\nLevel Order");
            Iterator<Integer> itr = binaryTree.iteratorLevelOrder();

            while (itr.hasNext()) {
                    Integer num = itr.next();
                    System.out.print(num + " ");
            }
            System.out.println("\nNumber of nodes in binary tree are : " + binaryTree.size());
            System.out.println("PreOrder");
            Iterator<Integer> itrPre = binaryTree.iteratorPreOrder();

            while (itrPre.hasNext()) {
                    Integer num = itrPre.next();	
                    System.out.print(num + " ");
            }
            System.out.println("\nPostOrder");
            Iterator<Integer> itrPost = binaryTree.iteratorPostOrder();

            while (itrPost.hasNext()) {
                    Integer num = itrPost.next();
                    System.out.print(num + " ");
            }
            System.out.println("\nInOrder");
            Iterator<Integer> itrIn = binaryTree.iteratorInOrder();

            while (itrIn.hasNext()) {
                    Integer num = itrIn.next();	
                    System.out.print(num + " ");
            }
            //find method throws exception if target element is not found. 
       try {
            System.out.println("\nThe element " + binaryTree.find(90) + " is there");
       }
       catch (ElementNotFoundException e)
       {
               System.out.println("\nElement is not found");
       }


       if(binaryTree.contains(48))
               System.out.println("Binary Tree contains the target element");
       else
               System.out.println("Binary Tree does not contains the target element");
	}

}
