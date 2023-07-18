function solution (inputArray){
	var maxProduct = inputArray[0] * inputArray[1]
	for(var i = 2; i < inputArray.length; i++){
		let currentProduct = inputArray[i] * inputArray[i - 1]
		maxProduct =  currentProduct > maxProduct ? currentProduct : maxProduct
	}
	return maxProduct;
}
var inputArray = [1, 0, 1, 0, 1000]
console.log(`The max adjacent numbers product in the array [${inputArray}] is ${solution(inputArray)}`)
var inputArray2 = [3, 6, -2, -5, 7, 3];
console.log("The max adjacent numbers product in the array %s is %d", inputArray2, solution(inputArray2))
