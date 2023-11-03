function solution(array) {
  let solution = new Array()

  for (let i = 0; i < array.length; i++) 
    solution [i + 1] = "*" + array[i] + "*"

  let border = ""
  for(; border.length < array[0].length; border += "*"){}

  solution[0] = solution[solution.length] = border += "**"

  return solution
}

const tests = [
	["abc", "ded"],
        ["wzy**"],
        ["abcde", "fghij", "klmno", "pqrst", "uvwxy"]
]

for (const test of tests) {
  const testString = test.join(",\n ")
  const solutionString = solution(test).join(",\n ")

  console.log("Without border:\n", testString, "\nWith border:\n", solutionString, "\n\n");
}
