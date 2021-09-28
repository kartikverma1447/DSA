package data.structure.recursion;
public class MergeSort {
	
	

	public static void mergeSort(int[] input){
		mergeSort(input,0,input.length-1);
	}
  
    public static void mergeSort(int[] input,int sI,int eI){
		 if(sI>=eI){
			 return;
		 }
		 int mid  = (sI+eI)/2;
		 mergeSort(input, sI, mid);

		 mergeSort(input, mid+1, eI);
		 merge(input,sI,eI);	 
    }
    private static void merge(int[] input, int sI, int eI) {
		int mid = (sI+eI)/2;
		int arr[] = new int[eI-sI+1];
		int i = sI;
		int j = mid+1;
		int k = 0; 
		while(i<=mid && j<=eI){
			if(input[i]<input[j]){
				arr[k]=input[i];
				i++;
				k++;
			}
			else{
				arr[k]=input[j];
				j++;
				k++;
			}
		}
		while(i<=mid){
			arr[k] = input[i];
			i++;
			k++;
		}
		while(j<=eI){
			arr[k] = input[j];
			j++;
			k++;
		}
		for(int i1 = 0;i1<arr.length;i1++){
			input[sI+i1] = arr[i1];
		}
	}
}
