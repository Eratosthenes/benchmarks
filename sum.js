/*
$ time node sum.js
125000000067108900

real	0m0.718s
user	0m0.689s
sys	0m0.022s
*/
var limit = 1+500e6;
var sum = 0;
for (var i=0; i<limit; i++)
{ sum+=i;
}
console.log(sum);

