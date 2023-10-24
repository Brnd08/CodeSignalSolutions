import java.util.Arrays;
public class Is_lucky{
	public static void main (String[] args){
            int [] tests = {
                  239017,
                  11,
                  100100
            };
            for(int test: tests){
                System.out.format(" The Ticket number %d is a 'Lucky' Tikcet number: %b %n", test, solution(test));
            }
	}
	static boolean solution(int n){
            var nString = String.valueOf(n);
            int sum1 = 0, sum2 = 0;

            for (int i = 0, j = nString.length() - 1; i < nString.length() / 2; i++, j--) {
                sum1 += Integer.parseInt(nString.charAt(i) + "");
                sum2 += Character.getNumericValue(nString.charAt(j));
            }
            return sum1 == sum2; 
        }
}
