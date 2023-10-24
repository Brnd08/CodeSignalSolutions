import java.util.Arrays;
public class All_longest_strings {
	public static void main (String[] args){
            String [][] tests = {
                    {"aba", "aa", "ad", "vcd", "aba"},
                    {"enyky", "benyky", "yely", "varennyky"},
                    {"i"}
            };
            for(String[] test: tests){
                System.out.format(" The longest strings in:%n %s%n are: %s%n%n"
                        , Arrays.toString(test), Arrays.toString(solution(test)));
            }
	}
	static String[] solution(String[] inputArray) {
        var maxLen = 0;
        var strings = new StringBuilder();
        for(String input: inputArray){
            var len = input.length();
            if(len > maxLen){
                maxLen = len;
                strings = new StringBuilder(input);
            }else if(len == maxLen){
                strings.append(input);
            }
        }
        return strings.toString().split("(?<=\\G.{"+ maxLen + "})");// Match every maxLen characters
    }
}
