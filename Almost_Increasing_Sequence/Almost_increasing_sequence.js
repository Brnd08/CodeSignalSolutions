function solution (inputArray){
	var toRemove = 0; 
	for(let i = 0; i < inputArray.length - 1 && toRemove < 2; i++){
		const current = inputArray[i] 
		const next = inputArray[i+1]
		if(current >= next){
			toRemove++
			if(i+2 < inputArray.length){
				const afterNext = inputArray[i+2]
				if( i === 0){
					if (next >= afterNext) {
						toRemove++
					}
				}else{
					const previous = inputArray[i-1]
					if(previous>= next && current >= afterNext){
						toRemove++
					}
				}
			}

		}
	}
	return toRemove < 2;
}
var inputArrays = [
	[10, 1, 2, 3, 4, 5, 6],
	[40, 50, 60, 10, 20, 30],
	[-50, -50]
]
inputArrays.forEach(inputArray => {
	console.log(`The sequence [${inputArray}] is ${solution(inputArray)? "": "not "}an almost increasing sequence`)
})
