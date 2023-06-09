package PROJECT_01;

import java.util.*;

public class LinkedList<AnyType> {
   
   Node<AnyType> head;
      
   public LinkedList(){
      head = null;
   }

   public boolean isEmpty(){
      return head == null;
   }
   
   public void addFirst(AnyType item){
      head = new Node<AnyType>(item, head);
   }
    
   public AnyType getFirst(){
      if(head == null) throw new NoSuchElementException();
      return head.data;
   }
   
   public AnyType removeFirst(){
      AnyType tmp = getFirst();
      head = head.next;
      return tmp;
   }
   
   public void addLast(AnyType item){
      if( head == null){
         addFirst(item);
      
      }   else{
        Node<AnyType> tmp = head;
        while(tmp.next != null) tmp = tmp.next;
      
        tmp.next = new Node<AnyType>(item, null);
      }
   }
   
   public AnyType getLast(){
     if(head == null) throw new NoSuchElementException();
     Node<AnyType> tmp = head;
     while(tmp.next != null) tmp = tmp.next;
     return tmp.data;
   }
   
   public void clear(){
     head = null;
   } 

   public AnyType get(int pos){

      if (head == null) throw new IndexOutOfBoundsException();
         Node<AnyType> tmp = head;

      for (int k = 0; k < pos; k++) 
         tmp = tmp.next;
      
      if( tmp == null) throw new IndexOutOfBoundsException();
      
      return tmp.data;
   }
   
   public void insertAfter(AnyType key, AnyType toInsert){
   
      Node<AnyType> tmp = head;
      
      while(tmp != null && !tmp.data.equals(key)) tmp = tmp.next;
         if(tmp != null)
            tmp.next = new Node<AnyType>(toInsert, tmp.next);

   }
   
   public void insertBefore(AnyType key, AnyType toInsert){
      if(head == null) return;

      if(head.data.equals(key)){
         addFirst(toInsert);
         return;
      }

      Node<AnyType> prev = null;
      Node<AnyType> cur = head;

      while(cur != null && !cur.data.equals(key)){
         prev = cur;
         cur = cur.next;
      }

      //insert between cur and prev
      if(cur != null)
         prev.next = new Node<AnyType>(toInsert, cur);
}

   public void remove(AnyType key){
      if(head == null)
         throw new RuntimeException("cannot delete");

      if(head.data.equals(key)){
         head = head.next;
         return;
      }

      Node<AnyType> cur = head;
      Node<AnyType> prev = null;

      while(cur != null && !cur.data.equals(key) ){
         prev = cur;
         cur = cur.next;
      }

      if(cur == null)
      throw new RuntimeException("cannot delete");

      //delete cur node
      prev.next = cur.next;
   }

   public LinkedList<AnyType> copy1(){
      LinkedList<AnyType> twin = new LinkedList<AnyType>();
      Node<AnyType> tmp = head;

      while(tmp != null){
         twin.addLast( tmp.data );
         tmp = tmp.next;
      }

      return twin;
   }

   public LinkedList<AnyType> copy2(){

      LinkedList<AnyType> twin = new LinkedList<AnyType>();
      Node<AnyType> tmp = head;

      while(tmp != null){
         twin.addFirst( tmp.data );
         tmp = tmp.next;
      }

      return twin.reverse();
   }
   
   public LinkedList<AnyType> reverse(){

      LinkedList<AnyType> list = new LinkedList<AnyType>();
      Node<AnyType> tmp = head;
      
      while(tmp != null){
         list.addFirst( tmp.data );
         tmp = tmp.next;
      }
   
      return list;
   }  
   
   public LinkedList<AnyType> copy3(){
      
      LinkedList<AnyType> twin = new LinkedList<AnyType>();
      Node<AnyType> tmp = head;
      
      if(head==null) return null;
         twin.head = new Node<AnyType>(head.data, null);
      
      Node<AnyType> tmpTwin = twin.head;
      while(tmp.next != null){
         tmp = tmp.next;
         tmpTwin.next = new Node<AnyType>(tmp.data, null);
         tmpTwin = tmpTwin.next;
      }
      return twin;
   }

   public void set(int pos, AnyType newValue){
      if (head == null) throw new IndexOutOfBoundsException();
      Node<AnyType> tmp = head;
      for (int k = 0; k < pos; k++) {
         if (tmp == null) throw new IndexOutOfBoundsException();
         tmp = tmp.next;
      }
      if (tmp == null) throw new IndexOutOfBoundsException();
      tmp.data = newValue;
    }
    
   public int size() {
      int count = 0;
      Node<AnyType> tmp = head;
      while (tmp != null) {
         count++;
         tmp = tmp.next;
      }
      return count;
   }
    
   protected static class Node<AnyType>{

   protected AnyType data;

   protected Node<AnyType> next;

      protected Node(AnyType data, Node<AnyType> next){
         this.data = data;
         this.next = next;
      }
   }
}
