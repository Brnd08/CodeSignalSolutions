import java.util.Arrays;
import java.util.function.UnaryOperator;
public class Reverse_in_parenthesis{
	public static void main (String[] args){
            String[] tests = {
                "(bar)",
                "foo(bar(baz))blim",
                "(abc)d(efg)"
            };
            for(String test : tests){
                System.out.format(" Input: '%s'%n Solution: '%s' %n%n", test, solution(test));
            }
	}

	static String solution(String input){
            UnaryOperator<String> mostNestedOperator1 = x -> {
                int start = x.lastIndexOf('(');
                return (start != -1) ?x.substring(start, x.indexOf(')', start) + 1) :null; // returns most nested with parenthesis
            };
            for(String mostNested; (mostNested = mostNestedOperator1.apply(input)) != null; )
                input = input.replace(mostNested, new StringBuilder(mostNested.substring(1, mostNested.length() - 1)).reverse().toString());
            return input;
        }
}
