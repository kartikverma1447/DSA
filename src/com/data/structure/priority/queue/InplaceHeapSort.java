package com.data.structure.priority.queue;

public class InplaceHeapSort {

	public static void inplaceHeapSort(int arr[]) {
		 
        for(int i = 0;i < arr.length ;i++){
            insertIntoArr(arr,i);
        }
        for(int i=0;i<arr.length;i++){
        	arr[arr.length-i-1] = removeMinFromArr(arr,arr.length-i);
        }
		
	}

	private static int removeMinFromArr(int[] arr, int heapSize) {
		int value = arr[0];
		arr[0] = arr[heapSize-1];
		int index  = 0;
		int leftChild = index*2+1;
		int rightChild = index*2+2;
		while(leftChild<heapSize){
			int minIndex = index;
			if(arr[minIndex]>arr[leftChild]){
				minIndex = leftChild;
			}if(rightChild < heapSize &&arr[minIndex]>arr[rightChild]){
				minIndex = rightChild;
			}
			if(minIndex==index){
				return value;
			}else{
				int temp1 = arr[index];
				arr[index] = arr[minIndex];
				arr[minIndex]  = temp1;
				index = minIndex;
				leftChild = 2 * index + 1;
				rightChild = 2 * index + 2;
			}
		}
		return value;
	}

	private static void insertIntoArr(int[] arr, int i) {
		int childIndex = i;
		int parentIndex = (childIndex-1)/2;
		while(childIndex>0){
			if(arr[childIndex]<arr[parentIndex]){
				int temp = arr[parentIndex];
				arr[parentIndex] = arr[childIndex]; 
				arr[childIndex] = temp;
                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
			}else{
				return;
			}
		}
	}
}