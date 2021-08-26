package day16_17;

public class InsertionSorting {

	public static void main(String[] args) {
		String st = "as sd rsas we uer";
		String[] arrS = st.split(" ");
		sortInsertion(arrS);
		printArray(arrS);
	}

	static void sortInsertion(String arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			char temp = arr[i].charAt(0);
			String word=arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j].charAt(0) > temp) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = word;
		}
	}
	 static void printArray(String arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; i++)
	            System.out.print(arr[i] + " ");
	 
	        System.out.println();
	    }

}
