import java.util.Arrays;
public class Almost_increasing_sequence{
	public static void main (String args[]){
            int[][] testArrays = {
              {10, 1, 2, 3, 4, 5, 6},
              {40, 50, 60, 10, 20, 30},
              {-50, -50}
            };
            for(int[] test: testArrays){
                System.out.format(" The %s array is an almost increasing sequence: %b %n", Arrays.toString(test), solution(test));
            }
	}
	static boolean solution(int[] input) {
            int toRemove = 0;
            for(int i = 0; i < input.length-1 && toRemove < 2; i++){
                int current = input[i], next = input[i+1];
                if(current >= next){ // We need to remove at least one element (current, next, or both)
                    toRemove++;
                    if(i+2 == input.length){continue;} // if next is the last element only need to remove either current or next element
                    
                    int afterNext = input[i+2];

                    if(i == 0){ // if current is the firts element check if the next two elements are consecutive
                        /*
                          If they are consecutive you only need to remove one element (current) 
                          Else you need to remove two elements (current and next)
                        */
                        if(next >= afterNext)
                            toRemove++;
                    }else{ // if current is not at first position verify if you also need to remove another element 
                        int previous = input[i-1];
                        /* 
                         If current is greater or equal to afterNext then you need to remove current. 
                         If previous is greater or equal to next you need to remove next.
                         If both are true then you need to remove both current and next
                        */
                        if(current >= afterNext && previous >= next)
                            toRemove++;
                    }
                }
            }
            return toRemove < 2; 
        }
}
