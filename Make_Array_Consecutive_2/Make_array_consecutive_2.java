import java.util.Arrays;
import java.util.ArrayList;
class Make_array_consecutive_2{
	public static void main(String args[]){
		int [] test = {6, 6, 6, 2, 3, 8}, test2 = {5, 4, 6};
		System.out.format("To have all sizes from %s Ratiorg needs %d additional statues %n", Arrays.toString(test), solution(test));
		System.out.format("To have all sizes from %s Ratiorg needs %d additional statues %n", Arrays.toString(test2), solution(test2));
	}
	static int solution(int[] sizes){
	    ArrayList<Integer> neededStatues = new ArrayList<>();
	    for(int i = 1, max = sizes[0], min = sizes[0]; i < sizes.length; i++){
	            int current = sizes[i];
	            if(neededStatues.remove(Integer.valueOf(current)))
	                    continue;

	            if(current > max){
	                    while (++max < current)
	                            neededStatues.add(max);
	                    max = current;
	            } else if(current < min){
	                    while(--min > current)
	                            neededStatues.add(min);
	                    min = current;
	            }
	    }
	    System.out.format("Needed statues: %s%n", neededStatues);
	    return neededStatues.size();
	}
}
