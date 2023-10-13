import java.util.Arrays;
import java.lang.StringBuilder;
public class Matrix_elements_sum{
	public static void main (String args[]){
            int [][][] tests = {
                {{0,1,1,2}, {0,5,0,0}, {2,0,3,3}},
                {{1,2,3,4,5}},
                {{4,0,1}, {10,7,0}, {0,0,0}, {9,1,2}}
            };
            for(int[][] test: tests){
                var testString = new StringBuilder();
                for(int[] row: test)
                    testString.append("\t" + Arrays.toString(row) + "\n");
                System.out.format(" %d is the total cost of the suitable rooms in: %n %s %n", solution(test), testString);
            }
	}
	static int solution(int[][] matrix) {
            var sum  = 0;
            for(int i = 0; i < matrix[0].length; i++)
                for(int j = 0; j < matrix.length; j++){
                    if(matrix[j][i]==0) 
                        break;
                    else 
                        sum += matrix[j][i];
                } 
            return sum;
       }
}
