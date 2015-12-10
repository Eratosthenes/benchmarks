'''
$ time python sum.py 
5000000050000000

real	0m10.930s
user	0m4.380s
sys	0m5.246s

for whatever reason, the program hung on 1+500e6, so just multiply 10.93 by 5
to get ~54.7s, or about 32x slower than C (and roughly 2x as fast as Ruby)
'''
print sum(range(int(1+100e6)))
