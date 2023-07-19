class Shape_area{
	public static void main(String args[]){
		int test = 2, test2 = 100;
		System.out.format("The area in a %d-interesting poligon is %d %n", test, solution(test));
		System.out.format("The area in a %d-interesting poligon is %d %n", test2, solution(test2));
	}
	static int solution(int n){
	/*
	        1*1 + 0*0 = 1
	        2*2 + 1*1 = 5
	        3*3 + 2*2 = 13
	        4*4 + 3*3 = 25
	        
	        = n^2 + (n-1)^2
	        = n^2 + n^2 - 2n + 1
	        = 2n^2 -2n + 1
	        = 2 (n^2 - n) + 1
	        = 2n (n - 1) + 1
    	*/
	return 2 * n * (n - 1) + 1;
	}
}
