#include <stdio.h>
int main(void)
{
    int n=0,k=0;
    printf("enter number of contestants and kth contestant:");
    scanf("%i %i", &n, &k);
    printf("\n");
    int x[n];
    for(int i=0;i<n;++i)
    scanf("%i ", &x[i]);
    printf("\n");
    k--;
    int c=0;
    for(int i=0;i<n;++i)
    {
    if(x[i]>=x[k])
    ++c;
    }
    printf("%i\n",c);
    return 0;
}
