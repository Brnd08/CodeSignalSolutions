function solution(s1, s2) {
	let count = 0
	for(let character of s1){
		if(s2.includes(character)){
			s2 = s2.replace(character, "")
			count++
		}
	}

	return count;
}
const tests = [
	["aabcc", "adcaa"],
	["a", "b"],
	["a", "aaa"]
];

for (const test of tests) {
  console.log(` There are ${solution(test[0], test[1])} common characters between the words '${test[0]}' and '${test[1]} \n`);
}
