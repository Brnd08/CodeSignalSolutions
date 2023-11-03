import java.util.Arrays;
public class Alternating_sums{
	public static void main (String[] args){
            int [][] tests = {
                {50, 60, 60, 45, 70},
                {80},
                {100, 51, 50, 100}
            };
            for(int[] test : tests){
                int[] solutionForTest = solution(test);
                System.out.format(" People weights: %s %n Team 1 total weight: %d, Team 2 total weight: %d%n%n", Arrays.toString(test), solutionForTest[0], solutionForTest[1]);
            }
	}

	static int[] solution(int[] a){
           int[] total = new int[2];
           for(int i = 0; i < a.length; i++)
               total[i % 2] += a[i]; 
           return total;
        }
}
