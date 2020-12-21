/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module14ProjectBST;

import java.util.*;


/**
 * 
 * LinkedBinaryTree implements the BinaryTreeADT interface.
 *
 * Created by Ray on 4/10/2017 based on Java Foundations.
 * Edited by Dilshad on 4/27/2019
 * 
 */
 
public class LinkedBinaryTree<T> implements BinaryTreeADT<T> {

    protected BinaryTreeNode<T> root;
    protected int count;

    public LinkedBinaryTree() {
            this.root = null;
            this.count = 0;
    }
    /**
     * Constructor with Parameters
     * @param element to start with
     */
    public LinkedBinaryTree(T element){
        this.root = new BinaryTreeNode<>(element);
        count++;
    }
    /**
     * constructor with Node parameter
     * @param node to start with
     */
    protected LinkedBinaryTree(BinaryTreeNode<T> node){
        
    }
    
    /**
     * 
     * @return the root element
     */
    @Override
    public T getRootElement() {

            // TODO complete the body
            return root.element; // the calling method is responsible for dealing with an empty tree
    }
    
    /**
     * 
     * @return boolean of whether the tree is empty
     */
    @Override
    public boolean isEmpty() {

            // TODO complete the body
            return root == null;
    }

    @Override
    public int size() {
            // TODO complete the body

            return count;
    }

    @Override
    public boolean contains(T targetElement) {

            // TODO in demo
            boolean found = false;
            if(targetElement.equals(find(targetElement)))
                    found = true;
            else
                    found = false;

            return found;
    }

    /**
     * Returns a reference to the specified target element if it is found in this
     * binary tree. Throws a ElementNotFoundException if the specified target
     * element is not found in the binary tree.
     *
     * @param targetElement
     *            the element being sought in this tree
     * @return a reference to the specified target
     * @throws ElementNotFoundException
     *             if the element is not in the tree
     */
    public T find(T targetElement) throws ElementNotFoundException {

        // TODO in demo

        BinaryTreeNode <T> found;
        if(root.element.equals(targetElement))
            found = root;
        else
        {
            found = findNode(targetElement, root); //calling the recursive method
            if (found == null)
                throw new ElementNotFoundException ();
        }

            return found.element;

        }

    /**
     * Returns a reference to the specified target element if it is found in this
     * binary tree.
     * <p>
     * Performance is O(n) because we have to search all nodes.
     *
     * @param targetElement
     *            the element being sought in this tree
     * @param next
     *            the element to begin searching from
     */
    private BinaryTreeNode<T> findNode(T targetElement, BinaryTreeNode<T> node) {
        // TODO in Demo
        if (node == null)
            return null;

        if (node.element.equals(targetElement))
            return node;

        BinaryTreeNode<T> temp = findNode(targetElement, node.left);

        if (temp == null)
            temp = findNode(targetElement, node.right);

        return temp;

    }
/**
* Simply choose to return a levelOrder iterator a default
*/
    @Override
    public Iterator<T> iterator() {
        return iteratorLevelOrder();

    }
    
    /**
     * 
     * @return the iterator in InOrder
     */
    @Override
    public Iterator<T> iteratorInOrder() {

        Queue<T> tempList = new LinkedList<>();
        inOrder(root, tempList);

        return tempList.iterator();
    }

    /**
     * Performs a recursive inorder traversal.
     *
     * @param node
     *            the node to be used as the root for this traversal
     * @param tempList
     *            the temporary list for use in this traversal
     */
    protected void inOrder(BinaryTreeNode<T> node, Queue<T> tempList) {

        if(node != null) {
           inOrder(node.left, tempList);
           tempList.add(node.element);
           inOrder(node.right, tempList);			
        }

    }
    
    /**
     * 
     * @return the iterator for tempQ in PreOrder
     */
    @Override
    public Iterator<T> iteratorPreOrder() {

        // TODO in class activity
        Queue<T> tempList = new LinkedList<>();
        preOrder(root, tempList);

        return tempList.iterator();

    }

    /**
     * Performs a recursive preOrder traversal.
     *
     * @param node
     *            the node to be used as the root for this traversal
     * @param tempList
     *            the temporary list for use in this traversal
     */
    protected void preOrder(BinaryTreeNode<T> node, Queue<T> tempList) {

        // TODO in class activity
        if(node !=null) {
            tempList.add(node.element);
            preOrder(node.left, tempList);
            preOrder(node.right, tempList);
        }

    }
    
    /**
     * 
     * @return iterator for the tempQ in PostOrder
     */
    @Override
    public Iterator<T> iteratorPostOrder() {

            Queue<T> tempList = new LinkedList<>();
            postOrder(root, tempList);

            return tempList.iterator();
    }

    /**
     * Performs a recursive postOrder traversal.
     *
     * @param node
     *            the node to be used as the root for this traversal
     * @param tempList
     *            the temporary list for use in this traversal
     */
    protected void postOrder(BinaryTreeNode<T> node, Queue<T> tempList) {

            // TODO in class activity
            if(node != null) {
                    postOrder(node.left, tempList);
                    postOrder(node.right, tempList);
                    tempList.add(node.element);
            }
    }
    
    /**
     * 
     * @return iterator for the tempQ in levelOrder
     */
    @Override
    public Iterator<T> iteratorLevelOrder() {

            // TODO in Demo
            Queue<T> tempQ = new LinkedList<>();
            levelOrder(root, tempQ);

            return tempQ.iterator();

    }

    /**
     * Performs an iterative levelOrder traversal.
     *
     * @param node node to be used for levelOrder
     * @param tempQ the temporary queue for tree elements
     *              
     *            
     */
    public void levelOrder(BinaryTreeNode<T> node, Queue<T> tempQ) {

        // TODO in demo
        if (node != null) {// ADDED Later - Tree is empty
            Queue<BinaryTreeNode<T>> queue = new LinkedList<>();

            queue.add(node);
            while (!queue.isEmpty()) {
                BinaryTreeNode<T> tempNode = queue.poll();
                tempQ.add(tempNode.element);

                if (tempNode.left != null) {
                        queue.add(tempNode.left);
                }

                if (tempNode.right != null) {
                        queue.add(tempNode.right);
                }
            }
        }
    }

    /**
     * insert a node into the binary tree using level order insertion Note that
     * nodes are added in level order as they arrive
     * 
     * @param element to insert into the tree
     */
    public void insert(T element) {

        Queue<BinaryTreeNode<T>> tempQ = new LinkedList<>();
        // see if Tree is empty
        if (this.root == null) {
            this.root = new BinaryTreeNode(element);
            count++;
        } else {
            Iterator<BinaryTreeNode<T>> iterator = levelOrderInsertionIterator(root, tempQ);

            while (iterator.hasNext()) {

                BinaryTreeNode<T> node = iterator.next();
                if (node.left == null) {
                        node.left = new BinaryTreeNode(element);
                        break;
                } else if (node.right == null) {
                        node.right = new BinaryTreeNode(element);
                        break;
                    }
                }
                count++;
        }
    }


    /**
     * Performs an iterative levelOrder traversal for insertion of nodes.
     *
     * @param node node to start at
     * @param tempQ temporary queue for the elements in tree
     * @return the temp@ iterator
     *          
     */
    protected Iterator<BinaryTreeNode<T>> levelOrderInsertionIterator(BinaryTreeNode<T> node,
                    Queue<BinaryTreeNode<T>> tempQ) {

        Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            BinaryTreeNode<T> tempNode = queue.poll();
            tempQ.add(tempNode);

            if (tempNode.left != null) {
                    queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                    queue.add(tempNode.right);
            }

        }

        return tempQ.iterator();
    }

    /**
     * Basic generic BinaryTreeNode class
     * @param <T> generic class
     */
    protected class BinaryTreeNode<T> {

        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
        T element;

        BinaryTreeNode() {
            this.left = null;
            this.right = null;
            this.element = null;
        }

        BinaryTreeNode(T element) {
            this.element = element;
            this.left = null;
            this.right = null;
        }

    }

}
