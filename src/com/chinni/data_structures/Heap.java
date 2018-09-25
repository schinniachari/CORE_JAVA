package com.chinni.data_structures;

import java.io.IOException;
import java.util.Vector;

public class Heap {
	
	Vector<Integer> heapVector;
	int heapsize=0;
	
	Heap(){
		heapVector=new Vector();
		
	}
	void Sort_data(Vector heapVector){
		this.heapVector=heapVector;
	}

	void insert(int item) {
		
		
		heapVector.addElement(item);
		
		
		int index=size()-1;
		
		percolateUp(index);
		
	}
	int size() {
		return heapVector.size();
	}
	
	 void percolateUp(int nodeIndex) {
		 
		 
if(nodeIndex>0&& heapVector.get(parent(nodeIndex)) > heapVector.get(nodeIndex)) {	
	
	swap(nodeIndex,parent(nodeIndex));
	percolateUp(parent(nodeIndex));
	
}
		
	}
	 	
	 private void swap(int x,int y) {
		 Integer temp=heapVector.get(x);
		 heapVector.setElementAt(heapVector.get(y),x);
		 heapVector.setElementAt(temp,y);
		 
	 }
	 
	 private int parent(int i) {
		 
		 if(i==0) 
			 return 0;
		 return (i-1)/2;
	 }
	 
	 
	  void  deleteMin() {
			try{
				
				if(size()==0) 
					throw new Exception("Index out of range (Heap underflow)");
				int root=heapVector.firstElement();
				heapVector.setElementAt(heapVector.lastElement(),0);
					heapVector.remove(size()-1);
					
					percolateDown(0);
					
				
			}catch( Exception e) {
				System.out.println(e);
				
			}
		}
	  
	  void percolateDown(int i) {
			 
		  
		  
		  
		  int left=LEFT(i);
		  
		  int right=RIGHT(i);
		  int smallest=i;
		  if(left<size()&&heapVector.get(left)<heapVector.get(i)) {
			  
			  smallest=left;
			   
		  }
		  if(right<size()&&heapVector.get(right)<heapVector.get(smallest)) {
			  smallest=right;
		  }
		  if(smallest!=i) {
			  swap(i,smallest);
			  percolateDown(smallest);
		  }
		 } 
	  
	  
	  
	  int LEFT(int i) {
		  return (2*i+1);
	  }
	  
	  int RIGHT(int i) {
		  return (2*i+2);
	  }
	  int getElement(int index) {
		  return heapVector.get(index);
	  }
	  
	  void copy(Vector<Integer> copydata) {
		  heapVector.clear();
		  heapVector=copydata;
		  
		  for(int i=0;i<heapVector.size();i++) {

			  insert(heapVector.get(i));
		  }
		  
		  
	  }
}
