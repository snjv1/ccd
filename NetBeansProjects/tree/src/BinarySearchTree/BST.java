
package BinarySearchTree;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

class Node
{
    Node left;
    Node right;
    int data;
}

class binarySearchTree
{
    public Node insert(Node node,int val)                                       // Insertion of node
    {
        if(node==null)
            return createNewNode(val);
        
        if(val<node.data)
            node.left = insert(node.left,val);
        else if(val > node.data)
            node.right=insert(node.right,val);
        
        
        return node;
    }
    
    public Node delete(Node node,int val)                                       // Deletion of Node
    {
        if(node==null)
            return null;
        
        if(val<node.data)
            node.left=delete(node.left,val);
        
        else if(val>node.data)
            node.right=delete(node.right,val);
        else
        {
            if(node.left==null || node.right==null)
            {
                Node temp=node.left!=null ? node.left : node.right;
                
                if(temp==null)
                    return null;
                else 
                    return temp;
            }
            
            else
            {
                Node successor=getSuccessor(node);
                node.data=successor.data;
                
                node.right=delete(node.right,successor.data);
                return node;
            }
        }
         return node;
    }
    
    public Node getSuccessor(Node node)
    {
        if(node==null)
            return null;
        
        Node temp=node.right;
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp;
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
      
      
      
      public void inorder(Node node) // INORDER TRAVERSING USING RECURSION    (DFS depth first search)   
    {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
        
      
        
       public void postorder(Node node) // POSTORDER TRAVERSING USING RECURSION    (DFS depth first search)   
    {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
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
    
    
    
    
    
    public boolean search(Node node, int key)      // SEARCH A KEY PERSENT IN BST OR NOT
{ 
    // Base Cases: root is null or key is present at root 
    if (node==null )
        return true; 
  
    if(node.data==key)
        return true;
    // Key is greater than root's key 
    if (node.data < key) 
       return search(node.right, key); 
  
    // Key is smaller than root's key 
    return search(node.left, key); 
} 
    
    
    
    
//    Solution: 
//- We traverse the binary tree in inorder manner
//- We take a global variable 'prev'.
//- Now whenever we're traversing any node, 
// we check node value with previous node value
//- If current node value is less than previous value, 
//we return false, else we keep on checking. 
//- We check this for all nodes in tree
//
//Time Complexity: O(n)
//Space Complexity: O(1)
        
    Node prev;
    public boolean checkBSTorNot(Node node)                          // given tree is BST or not
    {
        if(node ==null) return true;
        
        if(checkBSTorNot(node.left))
        {
            return true;
        }
        
        if(prev != null  && node.data < prev.data)
            return false;
        
        prev=node;
       
        return checkBSTorNot(node.right);
        
    }
    
    
    
    
    
    
    
    public void rootToLeaf(Node node)       // all paths from root to leaf
    {
        if(node==null) return ;
        
        int h=heightOfTree(node);
        int arr[]=new int[h+2]; // for extra space
        
        printRootToLeaf(node,arr,0);
    }
    
    public void printRootToLeaf(Node node, int[] arr,int index)
    {
        if(node==null) return;
        
        arr[index] = node.data;
        
        if(node.left == null  && node.right==null)
            printArray(arr,index);
        
        printRootToLeaf(node.left,arr,index+1);
        printRootToLeaf(node.right,arr,index+1);
    }
    
   public void printArray(int[] arr,int index)
   {
       for(int i=0;i<=index;i++)
       {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   }
    
    
   
   
   
   
   
    public int minNumber(Node node)          // MINIMUM no in BST
    {
        if(node == null)
            return 0;
        
        if(node.left==null)
            return node.data;
        
        return minNumber(node.left);
    }
    
    
    
    
     public int maxNumber(Node node)          // MAXIMUM no in BST
    {
        if(node == null)
            return 0;
        
        if(node.right==null)
            return node.data;
        
        return maxNumber(node.right);
    }
    
    
    
    
    
   
    public Node treeFromPreOrder(int[] preorder, int start,int end)
    {
        if(start>end)
            return null;
        
        Node node=createNewNode(preorder[start]);
        
       
        int i;
      for(i=start+1; i<=end;i++)
        {
            if(preorder[i]>node.data)
            {
                break;
            }
        }
        
        node.left=treeFromPreOrder(preorder,start+1,i-1);
        node.right=treeFromPreOrder(preorder,i,end);
             
        return node;
    }
    
    
    
    
    int preIndex;
    public Node treeFromPostorder(int postOrder[],int start, int end)
    {
        if(start > end)
            return null;
        
        Node node= createNewNode(postOrder[end]);
        
        if(start==end)
            return node;
        
        int i;
        for(i= end-1;  i>=start; i--)
        {
            if(postOrder[i]<node.data)
            {
                break;
            }
        }
        
        node.left=treeFromPostorder(postOrder,start,i);
        node.right=treeFromPostorder(postOrder,i+1,end-1);
     
        return node;
    }
   
    
    
   
    
    
   
    
    /*
    Following is a 3 step solution for converting Binary tree to Binary Search Tree.
1) Create a temp array arr[] that stores inorder traversal of the tree.
2) Sort the temp array arr[]. 
3) Again do inorder traversal of tree and copy array elements to tree nodes one by one. This step takes O(n) time.
    */
    static int i;
    public Node binaryTreeToBST(Node node)
    {
        if(node==null)
            return null;
        
        int n =countNode(node);
        
        int array[]=new int[n];   // to store inorder traversal of binary tree
        i=0;
        storeInOrder(node,array);
        Arrays.sort(array);
        return arrayToBST(array,0,array.length-1);
        
    }
    
    public int countNode(Node node)
    {
        if(node==null)
            return 0;
        
        return countNode(node.left) + countNode(node.right) + 1;
    }
    
    public void storeInOrder(Node node , int[] array )
    {
        if(node==null)  return;
        
        storeInOrder(node.left,array);
        
        array[i]=node.data;
        i++;
        
        storeInOrder(node.right,array);
    }
    
    public Node arrayToBST(int[] arr, int start,int end)
    {
       if (start > end) {
      return null;
    }

    int mid = (start + end) / 2;
    
    Node node = createNewNode(arr[mid]);
    
    node.left = arrayToBST(arr, start, mid - 1);
    node.right = arrayToBST(arr, mid + 1, end);

    return node; 
    }
    
    
    
    
    
    
    
    /*
    1) traverse bst in inorder manner and save in array  bcz it is bst so inorder array is in sorted form
    2) now find mid of array take it as a root node for balnced binary search tree
    3) and start to mid-1 as left and mid+1 to end as right 
    4) and recuure for whole tree
    */
    
    public Node bstToBalancedBst(Node node)          // BST to balanced BST
    {
        if(node==null) return null;
        
        int n =countNode(node);
        
        int arr[]=new int[n];
        
        i=0;
        storeInOrder(node,arr);
        
        return arrayToBST(arr,0,arr.length-1);
                
    }
    
    
    public int k_th_Largest(Node node,int K)          //Kth largest element and smallest element
    {
        Vector<Integer> aa = new Vector<>();
        storeInorder(node,aa);
        
        if(aa.size() < K) return -1;
        int n=aa.size();
        return aa.get(n-K);//aa.get(K-1)        // in case of SMALLEST element just return  AA.GET(K-1);
    }
    public void storeInorder(Node root, Vector<Integer> aa)
    {
        if(root == null) return;
        
        storeInorder(root.left, aa);
        aa.add(root.data);
        storeInorder(root.right,aa);
    }
    
    
    
    
     public Vector<Integer> merge(Node root1,Node root2)       //MERGE 2 two Binary Search Tree
    {
        Vector<Integer> array= new Vector<>();
        storeinorder(root1,array);
        storeinorder(root2,array);
        
         Collections.sort(array);
         return array;
        
    }
    
    public void storeinorder(Node node,Vector<Integer> array)
    {
        if(node==null ) return ;
        
        storeinorder(node.left,array);
        array.add(node.data);
        storeinorder(node.right,array);
    }
    
    
    
    
    
    
    public int lca(Node node, int n1, int n2)          //Lowest common ansector
    {
        if(n1>node.data && n2>node.data)
            return lca(node.right,n1,n2);
        if(n1<node.data && n2<node.data)
            return lca(node.left,n1,n2);
        return node.data;
    }
    
    
    
    
    
    public  int countPairs(Node root1, Node root2, int x)   // total no of pairs in two bst whose sum is equal to X
    {
        Vector<Integer> array1= new Vector<>();
        Vector<Integer> array2= new Vector<>();
        
        storeinorder(root1,array1);
        storeinorder(root2,array2);
        
        int i=0,n=array1.size();
        int j=array2.size()-1 , ans=0;
        
        while(i < n && j>-1)
        {
            if(array1.get(i) + array2.get(j) == x)
            {
                ans++;
                i++;
                j--;
            }
            else if(array1.get(i) + array2.get(j) < x)  
                {
                    i++;
                }
            else
                j--;
        }
        return ans;
        
    }
    
    
    
    
    
    int count=0;
    int getCount(Node root,int l, int h)                       //Count BST nodes that lies in the given range
    {
        if(root== null ) return 0;
        
        if( root.data >= l && root.data <= h)
            count++;
        
       getCount(root.left,l,h);
       getCount(root.right,l,h);
        
        return count ;
        
    }
    
    
    
    
    public  int[] solve(int[] arr)
    {
        int[] newarray=new int[arr.length];
        
        Stack<Integer> st= new Stack<>();
        st.push(arr[arr.length-1]);
        
        newarray[arr.length-1] = -1;
        
        for(int i =arr.length-2; i>=0; i--)
        {
            while(st.size()>0 && arr[i] >=st.peek())
            {
                st.pop();
            }
            
            if(st.size()==0)
                newarray[i]=-1;
            
            else
            {
                newarray[i]=st.peek();
            }
            
            st.push(arr[i]);
        }
        
        
        return newarray;
    }
    
    
    
    
    
    
    
    public Node createNewNode(int k)
    {
        Node a = new Node();
        a.data=k;
        a.left=null;
        a.right=null;
        return a;
    }
}


public class BST {
    public static void main(String[] args) 
    {
        binarySearchTree a =new binarySearchTree();
        Node root =null;
        root= a.insert(root,8);
        root= a.insert(root,3);
        root= a.insert(root,6);
        root= a.insert(root,10);
        root= a.insert(root,4);
        root= a.insert(root,7);
        root= a.insert(root,1);
        root= a.insert(root,14);
        root= a.insert(root,13);
        
        
        
        //root = a.delete(root, 8);  
        
        //a.levelOrder(root);
        
        //a.preorder(root);
        //System.out.println();
        //a.inorder(root);
        //System.out.println();
        //a.postorder(root);
        
        //System.out.println(a.search(root,58));
        
        //System.out.println(a.checkBSTorNot(root));
        
        
        //a.rootToLeaf(root);
        
        //System.out.println(a.minNumber(root));
        //System.out.println(a.maxNumber(root));
        
        //int[] preorder={10,4,2,8,5,9,15,12,20};
        //Node node=a.treeFromPreOrder(preorder,0,preorder.length-1);
        //a.inorder(node);
        
        //int[] postorder={2,5,9,8,4,12,20,15,10};
        //Node node=a.treeFromPostorder(postorder, 0, postorder.length-1);
        //a.inorder(node);
        
//        Node node = a.createNewNode(10);
//        node.left = a.createNewNode(30);
//        node.right = a.createNewNode(15);
//        node.left.left = a.createNewNode(20);
//        node.right.right= a.createNewNode(5);
//        
//        
//       Node abc= a.binaryTreeToBST(node);
//       a.inorder(abc);



//      
//
//        Node node = a.createNewNode(4);
//        node.left = a.createNewNode(3);
//        node.left.left = a.createNewNode(2);
//        node.left.left.left = a.createNewNode(1);
//        
//        Node cc = a.bstToBalancedBst(node);
//        a.preorder(cc);
        


          //int var= a.k_th_Largest(root, 3);
          //System.out.println(var);
          
          //int lca_of_bst = a.lca(root,1,7);
          //System.out.println(lca_of_bst);
          
          
//          
//        Node node = a.createNewNode(5);
//        node.left = a.createNewNode(2);
//        node.right = a.createNewNode(4);
//        node.left.left = a.createNewNode(1);
//        node.right.right= a.createNewNode(6);
//        
//          int sum=a.countPairs(node,root,9);
//          System.out.println(sum);

           // int n=a.getCount(root,8,13);
            //System.out.println(n);
          
            
     //Replace every element with the least greater element on its right
            int arr[]={8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
            
            int[] return_array=a.solve(arr);
            
            for(int i=0; i<return_array.length; i++)
            {
                System.out.print( return_array[i] +" ");
            }
            
    }
}

