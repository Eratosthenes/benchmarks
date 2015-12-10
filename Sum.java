/*
$ time java Sum
125000000250000000

real	0m0.350s
user	0m0.311s
sys	0m0.031s
*/
import java.*;

public class Sum
{
  public static void main(String[] args)
  { 
    long sum=0;
    int limit=500000001;
    for (int i=0; i<limit; i++)
    { sum+=i;
    }
    System.out.println(sum);
  }
}
