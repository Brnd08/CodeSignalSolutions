import java.util.Arrays;
public class Common_character_count{
	public static void main (String[] args){
            String [][] tests = {
                    {"aabcc", "adcaa"},
                    {"a", "b"},
                    {"a", "aaa"}
            };
            for(String[] test: tests){
                System.out.format(" There are %d common characters between the words '%s' and '%s' %n%n", solution(test[0], test[1]), test[0], test[1]); 
            }
	}
	static int solution(String s1, String s2){
            int count = 0;
            for (char charr: s1.toCharArray())
                if(s2.contains(charr + "")){
                    s2.replaceFirst(charr + "", "");
                    count++; 
                }
           return count; 
        }
}
