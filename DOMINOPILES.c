#include <stdio.h>

int main(void)
{
  printf("enter size of board:");
  int n=0,m=0;
  scanf("%i %i\n",&n ,&m);
  int x=((n*m/2));
  printf("%i\n", x);
  return 0;
}
