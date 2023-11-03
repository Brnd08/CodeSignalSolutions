function solution(array) {
  let result = [0,0]
  for (let i = 0; i < array.length; i++) {
  	const weight = array[i]
	result[i % 2] += weight
  }	
  return result
}
const tests = [
	[50, 60, 60, 45, 70],
	[80],
	[100, 51, 50, 100]
];

for (const test of tests) {
  const result = solution(test)
  console.log(` Weights: ${test} \n Team 1 weight: ${result[0]} | Team 2 weight: ${result[1]}\n\n`)
}
