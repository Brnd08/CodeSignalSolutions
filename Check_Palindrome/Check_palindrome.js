function solution(word){
	for (let i = 0, j = word.length - 1; i<word.length/2; i++, j-- )
		if(word[i] != word[j])
			return false
	return true
}

console.log('"aabaa" is' + (solution("aabaa")?' ': ' not ') + 'a palindrome')
console.log('"a" is' + (solution("a")?' ': ' not') + ' a palindrome')
console.log('"abac" is ' + (solution("abac")? '': 'not') + ' a palindrome')
