public class Check_palindrome{
	public static boolean solution (String inputString){
		for(int left = 0, right = inputString.length()-1; left<inputString.length()/2; left++, right--)
			if(inputString.charAt(left) != inputString.charAt(right))
				return false;
		return true;
	}

	public static void main(String[] args){
		System.out.println(" 'aabaa' is " + (solution("aabaa")? "": "not") + " a palindrome.");
		System.out.println(" 'abac' is " + (solution("abac")? " a palindrome": "not a palindrome."));
		System.out.println(" 'a' is a palindrome? " + solution("a") );
	}
}
