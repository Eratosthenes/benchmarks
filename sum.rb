# 125000000250000000
# 
# real	1m40.062s
# user	1m35.920s
# sys	0m0.859s

sum = 0
(1..500e6).each do |i|
  sum += i
end
puts sum
