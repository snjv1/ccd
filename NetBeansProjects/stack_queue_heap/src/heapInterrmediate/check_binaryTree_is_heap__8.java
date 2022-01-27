package heapInterrmediate;
public class check_binaryTree_is_heap__8 
{
    
static class Node {
    int key;
    Node left, right;
 
    Node(int k)
    {
        key = k;
        left = right = null;
    }
}

  static int countNodes(Node root)
    {
        if (root == null)
            return 0;
        return (1 + countNodes(root.left)
                + countNodes(root.right));
    }
  
  static boolean isComplete(Node root, int index, int totalnodes)
  {
      if(root==null)
          return true;
      
      if(index>= totalnodes)
          return false;
      
      return isComplete(root.left,2*index+1,totalnodes)    &&    isComplete(root.right,2*index+2,totalnodes);          // hr pparent ka left 2*i+1 p hh and right 2*i+2 p h 
      
  }
  
  static boolean isHeapify(Node root)
  {
      if(root.left==null  && root.right==null)
          return true;
      
      if(root.right==null)      // right null h to left ke liye check krna h ki vo max heap h ya nhi
      {
          return root.key>=root.left.key;
      }
      
      else
      {
          if(root.key>=root.left.key  && root.key>=root.right.key)
              return isHeapify(root.left) && isHeapify(root.right);
          else 
              return false;
      }
      
      
  }

    public static boolean isHeap(Node root)
    {
        if(root==null)
            return true;
        
        int totalnodes=countNodes(root);
        
        if(isHeapify(root) && isComplete(root,0,totalnodes))
            return true;
        else 
            return false;
        
    }

    public static void main(String[] args) 
    {
        
        Node root = new Node(10);
        root.left = new Node(9);
        root.right = new Node(8);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        root.left.left.left = new Node(3);
        root.left.left.right = new Node(2);
        root.left.right.left = new Node(1);
 
        if (isHeap(root))
            System.out.println(
                "Given binary tree is a Heap");
        else
            System.out.println(
                "Given binary tree is not a Heap");
 
        
    }
    
}
