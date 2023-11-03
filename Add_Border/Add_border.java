import java.util.Arrays;
public class Add_border{
	public static void main (String[] args){
            String [][] tests = {
                {"abc", "ded"},
                {"wzy**"},
                {"abcde", "fghij", "klmno", "pqrst", "uvwxy"}
            };
            for(String[] test : tests){
                var testString = Arrays.toString(test).replace(",", ",\n ");
                var solutionString= Arrays.toString(solution(test)).replace(",", ",\n ");
                System.out.format(" Without border:%n %s %n With border:%n %s %n%n%n", testString, solutionString);
            }
        }
	

	static String[] solution(String[] picture){
            String[] solution = new String[picture.length + 2];

            for (int i = 0; i < picture.length; i++)
                solution[i + 1] = "*" + picture[i] + "*";

            String border = "";
            for(; border.length() < picture[0].length() + 2; border += '*'){}

            solution [0] = solution[solution.length - 1] = border;
            return solution;
        }
}
