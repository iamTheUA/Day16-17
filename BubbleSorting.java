package day16_17;

public class BubbleSorting {

	public static void main(String[] args) {

		int a[]= {18,4,52,9,7,3,23};
		bubbleSort(a);
		printArray(a);
	}
	
	static void bubbleSort(int arr[]) {
		for(int i =0 ; i<arr.length; i++) {
			for(int j = 0 ; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
	}

	static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println();
	    }

}
