package AlgEtc;

import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E> {
	 
	//it said i should add this
	private static final long serialVersionUID = 1L;

	GenericQueue() {
		
		super();
	}

	  public void enqueue(E e) {
	    this.addLast(e);
	  }
	
	  public E dequeue() {
	    return this.removeFirst();
	  }
	
	  public int getSize() {
	    return this.size();
	  }
	
	  @Override
	  public String toString() {
	    return "Queue: " + this.toString();
	  }
	}