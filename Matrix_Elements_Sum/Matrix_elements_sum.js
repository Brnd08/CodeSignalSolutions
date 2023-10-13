function solution (inputArray){
	var sum = 0; 
	for(let j = 0; j < inputArray[0].length; j++)
		for(let i = 0; i < inputArray.length; i++)
			if(inputArray[i][j] != 0)
				sum += inputArray[i][j];
			else 
				break;
	return sum;
}
const tests = [
  [
	[0, 1, 1, 2], 
	[0, 5, 0, 0],
	[2, 0, 3, 3]
  ],
  [
    [1, 2, 3, 4, 5]
  ],
  [
	[4, 0, 1], 
	[10, 7, 0], 
	[0, 0, 0], 
	[9, 1, 2]
  ]
];

for (const test of tests) {
  let testString = '';
  for (const row of test) {
    testString += `\t${JSON.stringify(row)}\n`;
  }
  console.log(`${solution(test)} is the total cost of the suitable rooms in:\n${testString}`);
}
