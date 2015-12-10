/*
$ time ./a.out
125000000250000000

real	0m1.703s
user	0m1.689s
sys	0m0.007s
*/
#include <stdio.h>

int main()
{
  long limit=500000000;
  unsigned long sum=0;
  for (long i=0; i<=limit; i++)
  {  sum+=i;
  }

  printf("%lu\n", sum);
  return 0;
}
