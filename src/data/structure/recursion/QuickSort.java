package data.structure.recursion;

public class QuickSort {

	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length - 1);
	}

	public static void quickSort(int[] input, int sI, int eI) {
		if (sI >= eI) {
			return;
		}
		int partionValue = partition(input, sI, eI);
		quickSort(input,sI,partionValue-1);
		quickSort(input,partionValue+1,eI);
	}

	public static int partition(int[] input, int sI, int eI) {
		int pivetValue = input[sI];
		int partionCount = findminimumValue(input, pivetValue, sI+1,eI);
		swap(input,sI,partionCount);
		int i = sI;
		int j = eI;
		while (i < sI + partionCount && j > partionCount+sI) {
			if (input[i] > pivetValue) {
				if (input[j] <= pivetValue) {
					int temp1 = input[i];
					input[i] = input[j];
					input[j] = temp1;
					i++;
					j--;
				} else {
					j--;
				}
			} else {
				i++;
			}
		}

		return partionCount + sI;
	}

	private static void swap(int[] input, int sI, int partionCount) {
		int temp = input[sI];
		input[sI] = input[sI + partionCount] ;
		input[sI + partionCount]  = temp;		
	}

	public static int findminimumValue(int[] input, int value, int index,int eI) {

		if (index > eI) {
			return 0;
		}
		if (input[index] <= value) {
			return 1 + findminimumValue(input, value, ++index,eI);
		}
		return findminimumValue(input, value, ++index,eI);
	}

}