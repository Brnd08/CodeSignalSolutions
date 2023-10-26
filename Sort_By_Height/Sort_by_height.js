function solution(array) {
	var heights = []

	array.forEach(num=> {
		if(num!==-1)
			heights.push(num)
	})

	for (let j = 0; j < heights.length - 1; j++) {
		for (let i = 0; i < heights.length - 1 -j; i++) {
			const current = heights[i]
			if(current > heights[i+1]){
				heights[i] = heights[i+1]
				heights[i+1] = current
			}
		}
	}

	for (let i = 0, j = 0; i < array.length; i++) {
		array[i] = array[i] !== -1? heights[j++]: -1
	}
	return array 
}
const tests = [
	[-1, 150, 190, 170, -1, -1, 160, 180],
	[-1],
	[23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3]
];

for (const test of tests) {
  console.log(` unsorted: ${test} \n sorted: ${solution(test)}\n\n`)
}
