function solution(n){
	return 2 * n * (n - 1) + 1;
}

let test = 2
let test1 = 100

console.log("The area of a %d-interesting polygon is %d", test, solution(test))
console.log(`The area of a ${test1}-interesting polygon is ${solution(test1)}`)
