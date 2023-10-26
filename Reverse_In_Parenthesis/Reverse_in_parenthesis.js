function solution(input) {
  for(let mostNested; (mostNested=findMostNested(input))!=null;){
    input = input.replace(mostNested, mostNested.substring(1, mostNested.length -1).split('').reverse().join(''))
  } 
  return input;
}

function findMostNested(string){
  const start = string.lastIndexOf("(");
  return start !== -1 ? string.substring(start, string.indexOf(")", start) + 1) :null;
}

const tests = [
	"(bar)",
        "foo(bar(baz))blim",
        "(abc)d(efg)"
];

for (const test of tests) {
  console.log(` Input: ${test} \n Inverted: ${solution(test)}\n\n`)
}
