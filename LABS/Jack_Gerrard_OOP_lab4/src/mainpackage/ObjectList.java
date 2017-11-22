package mainpackage;

public  class ObjectList {
	/*
	//== Values ===//
	*/
	
	protected int numItems;
	protected int maxItems;
	protected Object[] list;
	
	
	/*
	//== Generic Methods ===//
	*/
	
	//Constructor
	
	public ObjectList(int max) {
		this.numItems = 0;
		this.maxItems = max;
		this.list = new Object[max];
		
	}

	//Getters and Setters

	public int getNumItems() {
		return numItems;
	}


	public int getMaxItems() {
		return maxItems;
	}


	public Object[] getList() {
		return list;
	}


	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}


	public void setMaxItems(int maxItems) {
		this.maxItems = maxItems;
	}


	public void setList(Object[] list) {
		this.list = list;
	}
	
	/*
	//== Other Methods ===//
	*/
	
	// add
	public Boolean add(Object x){ //adds given object to array called list. 
		if(numItems < maxItems) {
			this.list[numItems]=x;
			this.numItems++;
			return true;
					
		}
		else {
			return false;
		}
		
		
	}
	
	
	//remove
	public boolean remove(int element){ //void – sets index specified to a null value and moves other indexs -1
		if(numItems>0) {
			System.out.println(list[element]+" has been removed from index" +element );
			this.list[element] = null;
			
			for(int i=0; i < this.maxItems-1; i++) {
				this.list[i] = this.list [i+1];
			}
			
			
			this.numItems--;
			
			return true;
		}else {
			System.out.println("Sorry the queue is empty, no indexes can be removed");
			return false;
		}
	}

	//is full
	public boolean isFull() { //Boolean – checks if list is full, returns true/false
		if(this.numItems==this.maxItems) {return true;}
		else {return false;}
	}
	
	//is empty 
	public boolean isEmpty() { //Boolean – checks if list is empty returns true/false
		if(numItems<=0){return true;}
		else {return false;}
	}
	
	
	// getObject
	
	//in spec but unused - is overridden by Booklist class
	public Object getObject(int element) {
		return this.list[element];
	}
	
	
	
	//get Total
	public int getTotal() { //int – returns the amount of objects in the list, equal to numItems. 
		return numItems;
	}

	
	

}
