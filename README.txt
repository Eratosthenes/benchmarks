Java:
  $ time java Sum
  125000000250000000

  real	0m0.350s
  user	0m0.311s
  sys	0m0.031s

Javascript: 
  $ time node sum.js
  125000000067108900

  real	0m0.718s
  user	0m0.689s
  sys	0m0.022s

C:
  $ time ./a.out
  125000000250000000

  real	0m1.703s
  user	0m1.689s
  sys	0m0.007s

J: (5.5x C)
 $ time jc sum.ijs
 
 real	0m9.313s
 user	0m2.348s
 sys	0m5.456s

Python: (32x C)
  $ time python sum.py 
  125000000250000000

  real	0m54.650s
  user	0m21.900s
  sys	0m26.230s


Ruby: (59x C)
  $ time ruby sum.rb
  125000000250000000

  real	1m40.062s
  user	1m35.920s
  sys	0m0.859s

