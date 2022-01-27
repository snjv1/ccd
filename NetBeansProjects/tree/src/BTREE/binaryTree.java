package BTREE;

import java.util.*;

class Node {

    Node left;
    Node right;
    int data;
    int height;
}

class BTree {

    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    
    public void findMinMax(Node node)           //MIN and MAX data in tree
    {
        if(node==null) return;
        
        if(node.data>max)
            max=node.data;
        
        if(node.data<min)
            min=node.data;
        
        findMinMax(node.left);
        findMinMax(node.right);
        
        
    }
    
    
    int diameter;
    public int getDiameter(Node node) {                                         //DOAMETER greatest path between two leaf nodes
        if (node == null) {
            return 0;
        }

     
        int leftH = getDiameter(node.left);
        int rightH = getDiameter(node.right);
        //update diameter if sum of left height and right height and node is GREATER than diameter
        diameter = Math.max(diameter, leftH + rightH);

        // for a specific node check left and right of a node which height is greater and +1 for including node
        return Math.max(leftH, rightH) + 1;
    }

    public boolean search(Node node, int key) //Search value exist or not
    {
        if (node == null) {
            return false;
        }

        if (node.data == key) {
            return true;
        }

        return search(node.left, key) || search(node.right, key);
    }

    public int sumOfNodes(Node node) // SUM OF NODES USING RECURSION
    {
        if (node == null) {
            return 0;
        }

        return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);

    }

    public int countNodes(Node node) // COUNT NO OF NODES 
    {
        if (node == null) {
            return 0;
        }

        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public int countLeafNode(Node node) // COUNT NO OF LEAF NODES
    {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNode(node.left) + countLeafNode(node.right);
    }

    public int heightOfTree(Node node) // HEIGHT OR DEPTH OF TREE
    {
        if (node == null) {
            return 0;
        } else {
            int ldepth = heightOfTree(node.left);
            int rdepth = heightOfTree(node.right);

            if (ldepth > rdepth) {
                return (ldepth + 1);
            } else {
                return (rdepth + 1);
            }
        }
    }

    public void printGivenLevel(Node node, int level) // PRINT LEVEL AT GIVEN LEVEL
    {
        if (node == null) {
            return;
        }

        if (level == 1) {
            System.out.print(node.data + " ");
            return;
        }
        printGivenLevel(node.left, level - 1);
        printGivenLevel(node.right, level - 1);

    }

    public void inorder(Node node) // INORDER TRAVERSING USING RECURSION    (DFS depth first search)   
    {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void inorderWithoutRecursion(Node node) // INORDER TRAVERSING without RECURSION    (DFS depth first search)   
    {
        if (node == null) {
            return;
        }

        Stack<Node> s = new Stack<>();

        while (node != null) {
            s.push(node);
            node = node.left;
        }

        while (s.size() > 0) {
            Node t = s.pop();
            System.out.print(t.data + " ");

            if (t.right != null) {
                Node temp = t.right;
                while (temp != null) {
                    s.push(temp);
                    temp = temp.left;
                }
            }
        }
    }

    public void preorder(Node node) // PREORDER TRAVERSING USING RECURSION    (DFS depth first search)   
    {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void preOrderWithoutRecursion(Node node) // PREORDER TRAVERSING without RECURSION    (DFS depth first search)
    {
        if (node == null) {
            return;
        }
        Stack<Node> s = new Stack<>();
        s.push(node);

        while (s.size() > 0) {
            Node t = s.pop();
            System.out.print(t.data + " ");

            if (t.right != null) {
                s.push(t.right);
            }
            if (t.left != null) {
                s.push(t.left);
            }
        }
    }

    public void postorder(Node node) //POSTORDER TRAVERSING USING RECURSION    (DFS depth first search)   
    {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public void postOrderWithoutRecursion(Node node) //POSTORDER TRAVERSING without RECURSION    (DFS depth first search)   
    {
        if (node == null) {
            return;
        }
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(node);

        while (s1.size() > 0) {
            Node t = s1.pop();
            if (t.left != null) {
                s1.push(t.left);
            }
            if (t.right != null) {
                s1.push(t.right);
            }

            s2.push(t);
        }

        while (s2.size() > 0) {
            Node t = s2.pop();
            System.out.print(t.data + " ");
        }
    }

    public void levelOrder(Node node) // LEVEL ORDER TRAVERSAL USING RECURSION    (BFS breadth first search)
    {
        if (node == null) {
            return;
        }

        int h = heightOfTree(node);

        for (int i = 1; i <= h; i++) {
            printGivenLevel(node, i);
            System.out.println();
        }
    }

    // approach RPA  (remove print append)(remove queue elemt print it and check if its left or right exist then add it in end of queue 
    public void levelOrderUsingQueue(Node node) // LEVEL ORDER TRAVERSAL without RECURSION ////// USING QUEUE   (BFS breadth first search)
    {
        if (node == null) {
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);

        while (!q.isEmpty()) {
            Node top = q.remove();

            System.out.print(top.data + " ");

            if (top.left != null) {
                q.add(top.left);
            }

            if (top.right != null) {
                q.add(top.right);
            }
        }

    }

    public void reverseLevelOrder(Node node) //REVERSE LEVEL ORDER TRAVERSAL USING RECURSION    (BFS breadth first search)
    {
        if (node == null) {
            return;
        }

        int h = heightOfTree(node);

        for (int i = h; i > 0; i--) {
            printGivenLevel(node, i);
            System.out.println();
        }
    }

    public void reverseLevelOrderWithoutRecursion(Node node) //REVERSE LEVEL ORDER TRAVERSAL without RECURSION    (BFS breadth first search)v
    {
        if (node == null) {
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        Stack<Integer> s = new Stack();

        q.add(node);

        while (!q.isEmpty()) {
            Node top = q.remove();
            //push in stack
            s.push(top.data);

            if (top.right != null) {
                q.add(top.right);
            }
            if (top.left != null) {
                q.add(top.left);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
    
    
    
    public void topView(Node node)                                              // TOP VIEW 
    {
        if(node==null) return;
        // height of tree is used as key and node Data is used as value
        // Tree map have a key and value 
        TreeMap<Integer,Integer> m = new TreeMap<>();
        
        
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            
            // hd to store height  //// INITIALLY HEIGHT IS ZERO(0) 
            int hd=temp.height;
            
            if(m.get(hd) == null )
                m.put(hd,temp.data);
            
            if(temp.left!=null)
            {
                temp.left.height=hd-1;
                q.add(temp.left);
            }
            
            if(temp.right!=null)
            {
                temp.right.height=hd+1;
                q.add(temp.right);
            }
            
        }
        System.out.println(m.values());
    }
    
    
    public void bottomView(Node node)                                              // BOTTOM VIEW 
    {
        if(node==null) return;
        
        // height of tree is used as key and node Data is used as value
        // Tree map have a key and value 
        TreeMap<Integer,Integer> m = new TreeMap<>();
        
        
        Queue<Node> q=new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            
            // hd to store height  //// INITIALLY HEIGHT IS ZERO(0) 
            int hd=temp.height;
            
            
            m.put(hd,temp.data);
            
            if(temp.left!=null)
            {
                temp.left.height=hd-1;
                q.add(temp.left);
            }
            
            if(temp.right!=null)
            {
                temp.right.height=hd+1;
                q.add(temp.right);
            }
            
        }
        System.out.println(m.values());
    }
    

    int maxLevel;
    public void leftView(Node node, int level)                                  //LEFT VIEW OF TREE
    {
        if (node == null) {
            return;
        }

        if (level > maxLevel) {
            System.out.print(node.data + " ");
            maxLevel++;
        }

        leftView(node.left, level + 1);
        leftView(node.right, level + 1);
    }

    public void rightView(Node node, int level)                                 //RIGHT VIEW OF TREE
    {
        if (node == null) {
            return;
        }

        if (level > maxLevel) {
            System.out.print(node.data + " ");
            maxLevel++;
        }
        leftView(node.right, level + 1);
        leftView(node.left, level + 1);
    }
    
    
    

    public Node mirrorTree(Node node)                                           // MIRROR OF TREE
    {
        if (node == null) {
            return null;
        }

        Node t = node.left;
        node.left = node.right;
        node.right = t;

        mirrorTree(node.left);
        mirrorTree(node.right);

        return node;
    }

    public Node deleteTree(Node node) {
        if (node == null) {
            return null;
        }

        node.left = deleteTree(node.left);
        node.right = deleteTree(node.right);

        System.out.println(node.data + " ");
        node = null;
        return node;
    }

    public Node createNewNode(int val) {                                          // CREATING ORDER
        Node newNode = new Node();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
}

public class binaryTree {

    public static void main(String[] args) {
        
        BTree a = new BTree();

        Node root = a.createNewNode(2);
        root.left = a.createNewNode(7);
        root.right = a.createNewNode(5);
        root.left.left = a.createNewNode(2);
        root.left.right = a.createNewNode(6);
        root.left.right.left = a.createNewNode(5);
        root.left.right.right = a.createNewNode(11);
        root.right.right = a.createNewNode(9);
        root.right.right.left = a.createNewNode(4);

//    
//        System.out.println("INORDER");
       // a.inorder(root);
//        System.out.println();
//          a.inorderWithoutRecursion(root);
//        System.out.println();
//      
//      
//      System.out.println("PREORDER");
//        a.preorder(root);
//        System.out.println();
//        a.preOrderWithoutRecursion(root);
////      
//      
//      System.out.println("POSTORDER");
//      a.postorder(root);
//      System.out.println();
//      a.postOrderWithoutRecursion(root);
//      
//       
//      System.out.println("sum of nodes " + a.sumOfNodes(root));
//      
//      System.out.println("total no of nodes " +  a.countNodes(root));
//      
//      System.out.println("total no of LEAF nodes " +  a.countLeafNode(root));    //node which doesn't contain any child neither left nor right
//      
      //System.out.println("height of tree " +  a.heightOfTree(root));
//       
//      a.printGivenLevel(root,2);        // print node at given level
//
//            a.levelOrder(root);
//        System.out.println();
//          a.levelOrderUsingQueue(root);
//
//
//        a.reverseLevelOrder(root);
//        a.reverseLevelOrderWithoutRecursion(root);
//        
          a.leftView(root, 1);
//        a.rightView(root,1);
//       a.inorder(root);
//        System.out.println();
//        Node mirror=a.mirrorTree(root);
//        a.inorder(mirror);
//        System.out.println(a.search(root,11));
//        a.getDiameter(root);
//        System.out.println(a.diameter);
        
//        a.findMinMax(root);
//        System.out.println(a.max);
//        System.out.println(a.min);
//        
//        a.topView(root);
//        System.out.println();
//        a.bottomView(root);
//
        

    }
}
