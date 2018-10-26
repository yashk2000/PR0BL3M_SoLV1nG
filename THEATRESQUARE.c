#include <stdio.h>
#include <math.h>

int main(void)
{
    int n=0,m=0,a=0;
    printf("enter size of square and tile:");
    scanf("%i %i %i",&n, &m, &a);
    if(n>=1 && m>=1 && a>=1 && a<=pow(10,9))
    {
      int width=ceil(n/a);
      int breadth=ceil(m/a);
      printf("total blocks to cover the theatre square %i", (width*breadth));
      return 0;
    }
    else
    return 1;
}
