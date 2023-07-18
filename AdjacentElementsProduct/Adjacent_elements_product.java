import java.util.Arrays;
public class Adjacent_elements_product{
	public static void main (String args[]){
		int testArray [] = new int[] {3, 6, -2, -5, 7, 3};
		System.out.format(" The max adjacent numbers product for the array %s is %d %n", Arrays.toString(testArray), solution(testArray));
                int testArray2 [] = new int[] {1, 0, 1, 0, 1000};
		System.out.format(" The max adjacent numbers product for the array %s is %d %n", Arrays.toString(testArray2), solution(testArray2));
	}
	static int solution(int[] inputArray) {
	    int maxProduct = inputArray[0]*inputArray[1];
	    for(int i = 2; i<inputArray.length; i++){
	        int currentProduct = inputArray[i]* inputArray[i-1];
	        if(currentProduct > maxProduct)
	            maxProduct= currentProduct;
	    }
	    return maxProduct;
	}
}
