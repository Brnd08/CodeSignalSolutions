function solution(inputArray) {
	let maxLen = 0
	let solution = []
	for(const x of inputArray){
		if(x.length > maxLen){
			maxLen = x.length
			solution = [x]
		}else if (x.length === maxLen){
			solution.push(x)
		}
	}
	return solution
}
const tests = [
	["aba", "aa", "ad", "vcd", "aba"],
	["aa"],
	["enyky", "benyky", "yely", "varennyky"]
];

for (const test of tests) {
  console.log(` The longest strings in:\n ${test}\n are: ${solution(test)}\n`);
}
