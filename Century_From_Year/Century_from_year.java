public class Century_from_year{
	public static int solution (int year){
		return 
			( year % 100 == 0)? 
				year / 100
				: (year/100) + 1;
	}

	public static void main(String Args[]){
		System.out.println(" The year 1905 belongs to the " + solution(1905) +  " century");
		System.out.println(" The year 500 belongs to the " + solution(500) +  " century");

	}
}
