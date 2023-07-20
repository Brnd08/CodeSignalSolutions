import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;
public class MakeArrayConsecutive2{
	public static void main (String args[]){
		int[] test = {0, 9, 6, 6, 5, 5, 1}; 
		int[] test1 = {0};

		System.out.format("You need %d more statues to have all consecutive sizes from %s%n", solution(test), Arrays.toString(test));
		System.out.format("You need %d more statues to have all consecutive sizes from %s%n", solution(test1), Arrays.toString(test1));
	}
	static int solution(int[] statues){
		Set<Integer> sizes = Arrays.stream(statues).boxed().collect(Collectors.toSet());
		int max = sizes.stream().max(Integer::compareTo).get(),
			min = sizes.stream().min(Integer::compareTo).get();
		return (max - min + 1) - sizes.size();
	}
}
