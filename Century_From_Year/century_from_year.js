function solution (year){
	return year%100==0? year/100 : parseInt((year/100) + 1);
}

console.log("The year 1905 in on the century number " + solution (1905));
console.log("The year 1700 in on the century number " + solution (1700));
