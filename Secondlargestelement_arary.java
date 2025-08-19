package javaprograms;

public class Secondlargestelement_arary {
	  public static void main(String[] args) {
	        int[] arr = {2, 3, 5, 6, 7, 8, 5, 3, 87, 45};
             int i;
             int j = 0;
	        for ( i = 0; i < arr.length - 1; i++) {
	            for ( j = 0; j < arr.length - 1 ; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
			System.out.println(arr[i-1]);
			System.out.println(arr[j-3]);
	       
	    }
	}


