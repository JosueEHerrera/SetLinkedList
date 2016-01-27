
public class Set {
	private Node head = new Node(null,null);
	private int size = 0;
	
	public Set(){
		head = new Node(null,null);
	}
	
	public int size(){
		return size;
	}

	
	public boolean contain(Object values){
		Node tmp = head.next;
		while(tmp != null){
			if(tmp.value.equals(values)){
				return true;
			}
			tmp = tmp.next;
		}
		
		return false;
	}
	
	public boolean remove(Object value){
		Node current = head.next;
		Node previous = head;
		while(current != null) {
			if(current.value.equals(value)) {
				previous.next = current.next;
				current = null;
				size--;
				return true;
			}
			previous = previous.next;
			current = current.next;
		}
		return false;
	}
	
	/*
	 * This will add to the end of the 
	 * list every Time.
	 */
	public boolean add(Object value){
		if(!(contain(value))){
			if (head.next == null){
				head.next = new Node(value, head.next);
				size++;
				return true;
			}else{
				Node tmp = head.next;
				while(tmp.next != null){
					tmp = tmp.next;
				}
				tmp.next = new Node(value);
				size++;
				return true;
			}
		}
		return false;
	}
	public boolean subsetOf(Set set2){
		Node current = head.next;
		Node compared = set2.head.next;
		int count = 0; boolean check = false;
		if (size == 0){
			return true;
		}
		while(current != null && compared != null){
			if(current.value.equals(compared.value)){
				count++; 
			}
			compared = compared.next;
			if(compared == null){
				compared = set2.head.next;
				current = current.next;
			}
			if (count == size){
				check = true;
			}
		}
		return check;
	}
	
	public boolean isEqual(Set set2){
		Node current = head.next;
		Node compared = set2.head.next;
		int count = 0;
		if (size != set2.size()){
			return false;
		}else{
		
			while(current != null && compared != null){
				if(current.value.equals(compared.value)){
					count++; 
				}
				compared = compared.next;
				if(compared == null){
					compared = set2.head.next;
					current = current.next;
				}
				if (count == size){
					return true;
				}
			}
			
		}
		
		
		
		return false;
	}
	
	public Set union(Set set2){
		Set tmp = new Set();
		Node node1 = head.next;
		Node node2 = set2.head.next;
		while (node1 != null) {
			tmp.add(node1.value);
			node1 = node1.next;
		}
		while (node2 != null){
			tmp.add(node2.value);
			node2 = node2.next;
		}
		
		return tmp;
	}
	
	/*
	 *Create  temp Set that will then  
	 */
	public Set intersection(Set set2){
		Set tmp = new Set();
		Node current =  head.next;
		Node compared = set2.head.next;
		
		while(current != null && compared != null){
			if(current.value.equals(compared.value)){
				tmp.add(current.value);
			}
			compared = compared.next;
			if(compared == null){
				compared = set2.head.next;
				current = current.next;
			}
		}
		
		return tmp;
	}
	
	public Set complement(Set set2){
		Set tmp = new Set();
		Node current =  head.next;
		Node compared = set2.head.next;
		if (size == 0){
			return tmp;
		}
		tmp = union(set2);
		while(current != null && compared != null){
			if(current.value.equals(compared.value)){
			   tmp.remove(current.value);
			}
			tmp.remove(compared.value);
			compared = compared.next;
			if(compared == null){
				compared = set2.head.next;
				current = current.next;
			}
		}
		return tmp;
		
	}
	
	
	
	@Override 
	public String toString (){
		String s = "[";
	    Node tmp = head.next;
	    while (tmp != null) {
	      s += tmp.value;
	      tmp = tmp.next;
	      if (tmp != null)
	        s += ",";
	    }
	    s += "]";
	    return s;
	  }
	
	
	private class Node {
		protected Object value;
		protected Node next;
		
		Node(Object v){
			value = v;
			next = null;
			
		}
		
		Node(Object v, Node position){
			value = v;
			next = position;
		}
		
		
	}
	
	
	
}