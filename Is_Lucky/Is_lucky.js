function solution(n) {
	let sum1 = 0
	let sum2 = 0
	const nString = n.toString()

	for(let i = 0, j = nString.length - 1; i < nString.length / 2; i++, j--){

		sum1 += nString.charAt(i)
		sum2 += nString.charAt(j)
	}

	return sum1 === sum2;
}
const tests = [
	239017,
	11,
	100100
];

for (const test of tests) {
  console.log(` The ticket number ${test} is a lucky number?: ${solution(test)}`)
}
