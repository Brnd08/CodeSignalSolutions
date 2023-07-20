function solution(statues){
	let neededStatues = 0
	for(var i = 1, max= statues[0], min = statues[0]; i<statues.length; i++){
		let current = statues[i];
		if(statues.indexOf(current)!=i)
			continue;

		if(current > max){
			neededStatues += current - max - 1
			max = current
		}else if(current < min){
			neededStatues += current - min -1
                        min = current
		}else {
			neededStatues--
		}
	}
	return neededStatues
}

let test = [0, 9, 6, 6, 5, 5, 1]
let test1 = [1]

console.log(`You need ${solution(test)} more statues to have all sizes from [${test}]`)
console.log("You need %d more statues to have all sizes from %s", solution(test1), test1)
