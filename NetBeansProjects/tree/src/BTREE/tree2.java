package BTREE;


import java.util.Scanner;
import java.util.*;


class Node {

    Node left;
    Node right;
    int data;
    int height;
}

class Tree
{
    public Node createNewNode(int val) {                                          // CREATING ORDER
        Node newNode = new Node();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
    
    // FIRST 1 Nth Node of inorder traversal
    int count=0;
    public void nthInorder(Node node, int n)
    {
        if(node==null) return;
        
        if(count<=n)
        {
        nthInorder(node.left,n);
        count++;
        
        if(count==n)
            System.out.print(node.data+ " ");
        
        nthInorder(node.right,n);
        }
    }
    
    
    
    
    
    
    
    
    
    // Second 2 level order in SPIRAL form  ((type 1))
    public  ArrayList<Integer> levelOrderSpiral(Node node)
    {
          ArrayList<Integer> al=new ArrayList<>();
        Stack<Node> s1= new Stack<>();
        Stack<Node> s2= new Stack<>();
        
        s1.push(node);
        
        while(!s1.isEmpty() || !s2.isEmpty())
        {
         while(!s1.isEmpty())
         {
            Node tmp= s1.pop();
            al.add(tmp.data);
              
            if(tmp.right!=null) 
                s2.push(tmp.right);
            if(tmp.left!=null)
                s2.push(tmp.left);
         }
         
            
        while(!s2.isEmpty())    
        {
            Node tmp=s2.pop();
            al.add(tmp.data);
            
            if(tmp.left!=null)
                s1.push(tmp.left);
            if(tmp.right!=null)
                s1.push(tmp.right);
                
        }
            
             
        }
        return al;
    }
    
    
    // Second 2 level order in SPIRAL form  ((type 2))
      ArrayList<Integer> levelOrderSpiral2(Node root) 
      {
       ArrayList<Integer> result = new ArrayList<Integer>();
       
       if(root==null)
            return result;
       
       int h=heightOfTree(root);
       
       boolean itr= false;
       for(int i=1; i<=h; i++)
       {
           printGivenLevel(result,root,i,itr);
           
           itr = !itr;
       }
       
       return result;
       
      }
    

    
 public int heightOfTree(Node node) // HEIGHT OR DEPTH OF TREE
    {
        if (node == null) {
            return 0;
        } 
        else 
        {
            int ldepth = heightOfTree(node.left);
            int rdepth = heightOfTree(node.right);

            if (ldepth > rdepth) 
            {
                return (ldepth + 1);
            }
            else
            {
                return (rdepth + 1);
            }
        }
    }


  public void printGivenLevel( ArrayList<Integer> result,Node node, int level, boolean itr ) // PRINT LEVEL AT GIVEN LEVEL
    {
        if (node == null) {
            return;
        }

        if (level == 1) {
           result.add(node.data);
        }
        
        if(itr != false)
        {
            printGivenLevel(result, node.left, level - 1,itr);
            printGivenLevel(result, node.right, level - 1,itr);
        }
        else
        {
            printGivenLevel(result, node.right, level - 1,itr);
            printGivenLevel(result, node.left, level - 1,itr);
        
        }

    }
    
    
    
    
    
    



    // Thrid 3 print boundary level
    public void printBoundary(Node node)
    {
        /*
       Solution: 
         We'll divide in into 4 subsets
         1st will print root node
         2nd will print non leaf left boundary nodes
         3rd will print all leaf nodes
         4th will print right side non leaf boundary nodes
         Time Complexity: O(n)
        */
        
        
        if(node!=null)
        {
             System.out.print(node.data + " ");
             
             printBoundaryLeft(node.left);
             
             printLeaveNode(node.left);
             printLeaveNode(node.right);
             
             printBoundaryRight(node.right) ;
        }
    }
    
    public void printBoundaryLeft(Node node)
    {
        if(node==null) return;
        
        //checkk if left exist then print it and traverse left of it 
        //otherwise go for RIGHT
        if(node.left!=null)
        {
            System.out.print(node.data+" ");
            printBoundaryLeft(node.left);
        }
        else if(node.right!=null)
        {
            System.out.print(node.data+ " ");
            printBoundaryLeft(node.right);
            
        }
    }
    
    
    public  void printBoundaryRight(Node node)
    {
        if(node==null)  return;
        
        if(node.right!=null)
        {
            printBoundaryRight(node.right);
            System.out.print(node.data+" ");
        }   
        else if(node.left!=null)
        {
            printBoundaryRight(node.left);
            System.out.print(node.data+" ");
        }
    }
    
    public void printLeaveNode(Node node)
    {
        if(node==null) return;
        
        if(node.left== null && node.right==null)
            System.out.print(node.data+ " ");
        
        printLeaveNode(node.left);
        printLeaveNode(node.right);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    // Fifth 5 BINARY TREE from INORDER and PREORDER
    // 1 find first element in preorder 
    // 2 finr that element in inorder 
    // 3 now in inorderelement left are side of left tree and right are side of right tree
    
    int preIndex;
    public Node treeFromINORDERpreorder(int preOrder[], int inOrder[], int start, int end)
    {
        if(start > end)
            return null;
        
        Node node= createNewNode(preOrder[preIndex++]);
        
        if(start==end)
            return node;
        
        int inOrderIndex=getInorderIndex(node.data,inOrder,start,end);
        
        node.left=treeFromINORDERpreorder(preOrder,inOrder,start,inOrderIndex-1);
        node.right=treeFromINORDERpreorder(preOrder,inOrder,inOrderIndex+1,end);
     
        return node;
    }
    
    public int getInorderIndex(int data, int[] inOrder, int start , int end)
    {
        for(int i=start; i <=end; i++)
        {
            if(inOrder[i]== data)
                return i;
            
        }
        return -1;
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
      public void inorder(Node node) // PREORDER TRAVERSING USING RECURSION    (DFS depth first search)   
    {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    
    
    
     
     
     
     
     //sixth 6 BINARY TREE into DOUBLY LINKED LIST (DLL)
     Node head;
     Node prev;
     public void binaryToDLL(Node node)
     {
         if( node ==null) return;
         
         binaryToDLL( node.left);
         
         if(prev==null)
         {
             head=node;
             prev=node;
         }
         else
         {
             node.left=prev;
             prev.right=node;
             prev=node;
         }
         
         binaryToDLL(node.right);
         
     }
    
     
     
     
     
     
     
     
     // 7 BINARY TREE into a SUM TREE
     public void bTreeToSUMTREE(Node node)
     {
         sum(node);
     }
     public int sum(Node node)
     {
         if(node==null)
             return 0;
         int oldValue = node.data;
         
         node.data=sum(node.left)+sum(node.right);
         
         return node.data + oldValue;
     }
     
     
     
     
     // 8 LEAF node at same level or not
     int levelOfLeaf;
     public boolean ifSameLevelOrNot(Node node,int level)
     {
         if(node==null)
             return true;
         
         if(node.left == null && node.right==null)
         {  
             //when first leaf node is find update level of leaf to that level where leaf is found
             if(levelOfLeaf == 0)
             {
                 levelOfLeaf=level;
                 return true;
             }
             return levelOfLeaf == level; 
         }
         return ifSameLevelOrNot(node.left,level+1) && ifSameLevelOrNot(node.right,level+1);
     }
     
     
     
     
     
     //9 check if two given tree are mirror of each other or not
     public boolean ifMirrorTree(Node node1 , Node node2)
     {
         if(node1==null && node2==null)
             return true;
         if(node1==null || node2==null)
             return false;
         
         return node1.data == node2.data && ifMirrorTree(node1.left,node2.right) &&  ifMirrorTree(node1.right,node2.left);
         
     }
     
     //10 Sum of Nodes on the longest path from root to leaf node
     int maxSum;
     public void maxSumFromRootToLeaf(Node node,int sum)
     {
         if(node==null) return ;
         
         
         maxSumFromRootToLeaf(node.left,sum+node.data);
         maxSumFromRootToLeaf(node.right,sum+node.data);
         if(node.left==null && node.right==null  && sum+node.data > maxSum)
         {
             maxSum= sum + node.data;
            return ;
         }
         
         
         
     }
     
     //11 Largest subtree sum oin a tree
     int answer;
     public int largestSubtreeSum(Node node, int ans)
     {
         if(node==null) return 0;
         
         int currentSum = node.data + largestSubtreeSum(node.left,ans) + largestSubtreeSum(node.right,ans);
         
         answer=Math.max(ans,currentSum);
         
         return currentSum;
         
     }
     
     
     
     
     
     
    //12 Print al k-sum paths in a binary tree
//     Solution:
//- We start binary tree traversal in post order manner 
//- At every stage, we'll store node value in list
//- Now once we're done with left & right traversal, 
//        we'll check elements from list & check if sum matches to given value
//- If sum matches, print all values till end of list
//- Once we do traversal for a node, we remove node from list
//
//Time Complexity: O(n) 
//Space Complexity: O(n)

     
    List<Integer> elements = new ArrayList<Integer>();
  public void printKPathEqualToSum(Node node, int val) {
    if (node == null) {
      return;
    }

    elements.add(node.data);

    printKPathEqualToSum(node.left, val);
    printKPathEqualToSum(node.right, val);

    int sum = 0;
    
    for (int i = elements.size() - 1; i >= 0; i--) {
      
      sum = sum + elements.get(i);
      
      if (sum == val) {
        
        for (int j = i; j < elements.size(); j++) {
          System.out.print(elements.get(j) + " ");
        }
        
        System.out.println();
      }
    }
    
    elements.remove(elements.size() - 1);
  }
     
     
  
  
  
  //13 TREE is ISOMORPHIC or Not
  boolean isIsomorphic(Node root1, Node root2)  
    { 
        if(root1==null && root2==null) return true;
        
        if(root1 ==null || root2==null) return false;
        
        if(root1.data != root2.data) return false;
        
        return (isIsomorphic(root1.left,root2.right) && isIsomorphic(root1.right,root2.left) ) || (isIsomorphic(root1.left,root2.left) && isIsomorphic(root1.right,root2.right) );
        
    }
     
  
  
  
  //14 LOWEST COMMON ANCESTOR in binary tree
  
  public Node findLowestCommonAncestor(Node node, int n1, int n2)
  {
      if(node==null) return null;
      
      if(node.data == n1 || node.data == n2)
      {
         
          return node;
      }
      
      
     Node leftLCA = findLowestCommonAncestor(node.left, n1, n2);
    Node rightLCA = findLowestCommonAncestor(node.right, n1, n2);

    if (leftLCA != null && rightLCA != null) {
      return node;
    }

    return leftLCA != null ? leftLCA : rightLCA;
  }

  
  
  
  public int lowestCommonAncestor(Node node,int a,int b)
  {
     
         ArrayList<Integer> path1 =new ArrayList<>();
         nodeToRootPath(node,a,path1);
         
         ArrayList<Integer> path2 = new ArrayList<>();
         nodeToRootPath(node,b,path2);
         
         int i=path1.size()-1;
    int j=path2.size()-1;
        
        while(i>=0 && j>=0 &&path1.get(i)==path2.get(j) )
        {
            i--;
            j--;
        }
        i++; 
        j++;
        
        return path1.get(i);
     
  }
  
  
   public int distanceBetweenTwoNodes(Node node , int a, int b)
   {
        ArrayList<Integer> path1 =new ArrayList<>();
         nodeToRootPath(node,a,path1);
         
         ArrayList<Integer> path2 = new ArrayList<>();
         nodeToRootPath(node,b,path2);
         
          int i=path1.size()-1;
          int j=path2.size()-1;
          
          while(i>=0 && j>=0 &&path1.get(i)==path2.get(j) )
        {
            i--;
            j--;
        }
        i++; 
        j++;
        
        return i+j;
     
          
         
   }
  
  
  
  
  
  //15 NODE to ROOT path
  
   public boolean nodeToRootPath(Node node,int data, ArrayList<Integer> list)
   {
       if(node==null) return false;
       
       if(node.data==data) 
       {
           list.add(node.data);
           return true;
       }
       
       boolean leftNode=nodeToRootPath(node.left,data,list);
       if(leftNode)
       {
           list.add(node.data);
           return true;
       }
       
       boolean rightNode=nodeToRootPath(node.right,data,list);
       if(rightNode)
       {
           list.add(node.data);
           return true;
       }
       
       return false;
   }
   
   
   
   
   
   
   
   
   
   
   
    
} 


public class tree2 
{
   static Scanner sc =new Scanner(System.in);
    
    public static void main(String[] args) 
    {
       
        Tree a = new Tree();

        Node root = a.createNewNode(2);
        root.left = a.createNewNode(7);
        root.right = a.createNewNode(5);
        root.left.left = a.createNewNode(2);
        root.left.right = a.createNewNode(6);
        root.left.right.left = a.createNewNode(5);
        root.left.right.right = a.createNewNode(11);
        root.right.right = a.createNewNode(9);
        root.right.right.left = a.createNewNode(4);

        //a.nthInorder(root, 5);
        
        //System.out.println( a.levelOrderSpiral(root));
        //System.out.println( a.levelOrderSpiral2(root));
        
        // a.printBoundary(root);
        
//        int[] preorderArray = {2, 4, 7, 3, 8};    // preOrder
//        int[] inorderArray = {7, 4, 3, 2, 8};       //inOrder
//        Node node=null;
//        node=a.treeFromINORDERpreorder(preorderArray, inorderArray, 0, inorderArray.length-1);
//        a.preorder(node);
        //System.out.println();
         
        //a.binaryToDLL(root);
        
       // a.bTreeToSUMTREE(root);
        //a.inorder(root);
        
        //System.out.println(a.ifSameLevelOrNot(root, 1));
        
        
       

//    Node root1 = a.createNewNode(2);
//    root1.left = a.createNewNode(7);
//    root1.right = a.createNewNode(8);
//    root1.left.left = a.createNewNode(5);
//
//    Node root2 = a.createNewNode(2);
//    root2.left = a.createNewNode(8);
//    root2.right = a.createNewNode(7);
//    root2.right.right = a.createNewNode(5);
//
//    // check if two binary tree are mirror of each other    
//    System.out.println(a.ifMirrorTree(root1, root2)); 

    
//        
//        a.maxSumFromRootToLeaf(root,0);
//        System.out.println(a.maxSum);
//        
 
        //a.largestSubtreeSum(root, 0);
        //System.out.println(a.answer);
        
        //a.printKPathEqualToSum(root,11);
        
//          Node root1 = a.createNewNode(1);
//    root1.left = a.createNewNode(2);
//    root1.left.left = a.createNewNode(4);
//    root1.right = a.createNewNode(3);
//    
//    Node root2 = a.createNewNode(1);
//    root2.left = a.createNewNode(3);
//    root2.left.left = a.createNewNode(4);
//    root2.right = a.createNewNode(2);
//        
//        
//         System.out.println(a.isIsomorphic(root1, root2));
//
           Node abc=a.findLowestCommonAncestor(root, 2, 11);       
           System.out.println(abc.data);

// this one is best in ever case
// this one is best in ever case
// this one is best in ever case
        

//            int ab=a.lowestCommonAncestor(root,2,11);
//            System.out.println(ab);
           
//
//            int vv=a.distanceBetweenTwoNodes(root,2,11);
//            System.out.println(vv);
            
           
//    
//        
     
//    

//
//        ArrayList<Integer> path = new ArrayList<>();
//        System.out.println(  a.nodeToRootPath(root,11,path));
//        System.out.println(path);
//        
//        
        

}

}