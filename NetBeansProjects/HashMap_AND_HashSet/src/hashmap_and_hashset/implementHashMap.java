/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap_and_hashset;


import hashmap_and_hashset.implementHashMap.HashMap.HMNode;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author sanje
 */
public class implementHashMap {

    
  public static class HashMap<K, V> {
    public class HMNode {
      K key;
      V value;

      HMNode(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int size; // n
    private LinkedList<HMNode>[] buckets; // N = buckets.length

    public HashMap() {
      initbuckets(4);
      size = 0;
    }

    // hrr bucket m linked list daaldenge
    private void initbuckets(int N) {
      buckets = new LinkedList[N];
      for (int bi = 0; bi < buckets.length; bi++) {
        buckets[bi] = new LinkedList<>();
      }
    }

    public void put(K key, V value) throws Exception {
      //bi bucket index 
      int bi=hashfn(key);
      // di = data index
      int di= getIndexWithinBucket(key,bi);
      
      if(di!=-1)        // mtlb mil jata h index to previous value ko update kr denge
      {
          HMNode node= buckets[bi].get(di);
          node.value=value;
      }
      else              // nhi mila to key ko add krdenge
      {
          HMNode node= new HMNode(key, value);
          buckets[bi].add(node);
          size++;
      }
      
      double lambda = size*1.0 / buckets.length;
      if(lambda > 2.0)
          rehash();
        
    }
    
    private void rehash() throws Exception
    {
        LinkedList<HMNode>[] oba = buckets;
        
        initbuckets(oba.length*2);
        size=0;
        
        for(int i=0;i<oba.length;i++)
        {
            for(HMNode node:oba[i])
            {
                put(node.key,node.value);
            }
        }
    }
    
    private int hashfn(K key)  // return bucket index
    {
        int hc= key.hashCode();
        return Math.abs(hc) % buckets.length;
    }
    

    private int getIndexWithinBucket(K key , int bi)
    {
        int di=0;
        for(HMNode node: buckets[bi])           // agr mil jaeygi hamri key is linked list m to key ka index return kr dega
        {
            if(node.key.equals(key))
                return di;
            di++;
        }
        return -1;
    }
    
    
    
    
    
    public V get(K key) throws Exception  
    {
      int bi=hashfn(key);       // 
      int di= getIndexWithinBucket(key,bi);
      
      if(di!=-1)        // mtlb mil jata h index ke node ki value return kr denge
      {
          HMNode node= buckets[bi].get(di);
          return node.value;
      }
      else              //else null
          return null;
      
    }

    public boolean containsKey(K key) {
      
      int bi=hashfn(key);       
      int di= getIndexWithinBucket(key,bi);
      
      if(di!=-1)      // mil jati h key to true else false
          return true;
      else 
          return false;
      
    }

    public V remove(K key) throws Exception {
       int bi=hashfn(key);       // 
      int di= getIndexWithinBucket(key,bi);
      
      if(di!=-1)        // agr mil jaye to remove kr de
      {
          HMNode node= buckets[bi].remove(di);
          size--;
          return node.value;
      }
      else              //else null
          return null;
    }

    public ArrayList<K> keyset() throws Exception {
         ArrayList<K> keys = new ArrayList<>();
        for(int i=0; i<buckets.length; i++)
        {
            for(HMNode node : buckets[i] )
            {
                keys.add(node.key);
            }
        }
        return keys;
    }

    public int size() {
      return size;
    }
    
    
   public void display() {
      System.out.println("Display Begins");
      for (int bi = 0; bi < buckets.length; bi++) {
        System.out.print("Bucket" + bi + " ");
        for (HMNode node : buckets[bi]) {
          System.out.print( node.key + "@" + node.value + " ");
        }
        System.out.println(".");
      }
      System.out.println("Display Ends");
    
  }
  }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) throws Exception {
        
        HashMap<String, Integer> map = new HashMap();
        String a;
        Integer n;
        map.put(a="india",n=135);
        map.put(a="aus",n=5);
        map.put(a="canada",n=3);
        map.display();
        map.get(a="china");
        map.remove(a="aus");
        map.get(a="aus");
        map.containsKey(a="us");
        map.put(a="us",n=10);
        map.put(a="uk",n=20);
        map.remove(a="us");
        map.containsKey(a="us");
        map.put(a="pak",n=80);
        map.put(a="china",n=200);
        map.display();
        map.put(a="utopia",n=0);
        map.display();
        map.put(a="nigeria",n=3);
        map.display();
        map.put(a="india",n=138);
        map.display();
        map.put(a="sweden",n=1);
        map.display();
        map.put(a="finland",n=20);
        map.display();
        
    }
    
}

/*
Display Begins
Bucket0 .
Bucket1 .
Bucket2 Canada@3 .
Bucket3 India@135 Aus@5 .
Display Ends
null
5
null
false
10
false
Display Begins
Bucket0 .
Bucket1 .
Bucket2 Canada@3 UK@20 Pak@80 .
Bucket3 India@135 China@200 .
Display Ends
Display Begins
Bucket0 Utopia@0 .
Bucket1 .
Bucket2 Canada@3 UK@20 Pak@80 .
Bucket3 India@135 China@200 .
Display Ends
Display Begins
Bucket0 Utopia@0 .
Bucket1 .
Bucket2 Canada@3 UK@20 Pak@80 .
Bucket3 India@135 China@200 Nigeria@3 .
Display Ends
Display Begins
Bucket0 Utopia@0 .
Bucket1 .
Bucket2 Canada@3 UK@20 Pak@80 .
Bucket3 India@138 China@200 Nigeria@3 .
Display Ends
Display Begins
Bucket0 Utopia@0 Sweden@1 .
Bucket1 .
Bucket2 Canada@3 UK@20 Pak@80 .
Bucket3 India@138 China@200 Nigeria@3 .
Display Ends
Display Begins
Bucket0 Utopia@0 .
Bucket1 .
Bucket2 Pak@80 finland@20 .
Bucket3 .
Bucket4 Sweden@1 .
Bucket5 .
Bucket6 Canada@3 UK@20 .
Bucket7 India@138 China@200 Nigeria@3 .
Display Ends


*/
