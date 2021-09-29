package com.data.structure.priority.queue;

import java.util.ArrayList;

public class MaxPriorityQueue {
    ArrayList<Integer> heap;
    
    public MaxPriorityQueue(){
    	heap = new ArrayList<Integer>();
    }
    
	boolean isEmpty() {
        return heap.size()==0;
	}

	int getSize() {
        return heap.size();
	}

	int getMax()  {
		if(isEmpty()){
			return -1;
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size()-1;
		int parentChild = (heap.size()-1)/2;
		while(childIndex > 0){
			if(heap.get(childIndex)>heap.get(parentChild)){
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentChild));
				heap.set(parentChild, temp);
				childIndex = parentChild;
				parentChild = (childIndex-1)/2;
			}else{
				return;
			}
		}
	}

	int removeMax() {
		if(isEmpty())
			return -1;
		
		int value = heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int index = 0;
		int minIndex = index;
		int leftIndex = 1;
		int rightIndex = 2;
		while(leftIndex<heap.size()-1){
			if(heap.get(leftIndex)>heap.get(minIndex)){
				minIndex = leftIndex;
			}
			if(heap.get(rightIndex)>heap.get(minIndex)){
				minIndex = rightIndex;
			}
			if(minIndex==index){
				break;
			}else{
				int temp1 = heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp1);
				index = minIndex;
				leftIndex = 2 * index + 1;
				rightIndex = 2 * index + 2;
			}
		}
		return value;
	
	}
}
