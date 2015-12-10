C:
  $ time ./a.out
  125000000250000000

  real	0m1.703s
  user	0m1.689s
  sys	0m0.007s

J: (5.5x C)
 $ time jc sum.ijs
 125000000250000000
 
 real	0m9.313s
 user	0m2.348s
 sys	0m5.456s

Ruby: (59x C)
  $ time ruby sum.rb
  125000000250000000

  real	1m40.062s
  user	1m35.920s
  sys	0m0.859s

