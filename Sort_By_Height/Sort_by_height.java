import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class Sort_by_height{
	public static void main (String[] args){
            int [][] tests = {
                {-1, 150, 190, 170, -1, -1, 160, 180},
                {-1},
                {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3}
            };
            for(int[] test : tests){
                System.out.format(" Non sorted: %s %n sorted: %s %n%n", Arrays.toString(test), Arrays.toString(solution(test)));
            }
	}

	static int[] solution(int[] a){
            List<Integer> heights = new ArrayList<>(a.length);

            for (int num : a)
                if (num != -1)
                    heights.add(num);

            for (int j = 0; j < heights.size() - 1; j++){
                for (int i = 0; i < heights.size() - 1 - j; i++) {
                    int current = heights.get(i);
                    int next = heights.get(i+1);
                    if ( current > next) {
                        heights.set(i, next);
                        heights.set(i + 1, current);
                    }
                }
            }
            
            for (int i = 0, j = 0; i < a.length; i++)
                a[i] = a[i] == -1 ? -1 : heights.get(j++);

            return a;    
        }
}
