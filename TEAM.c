#include <stdio.h>
int main(void)
{
    printf("enter number of problems:");
    int n=0;
    scanf("%i\n", n);
    int arr[n][3];
    for(int i=0;i<n;++i)
    {
    for(int j=0;j<3;++j)
    scanf("%i", arr[i][j]);
    }
    int c=0;
    int sum=0;
    for(int i=0;i<n;++i)
    {
    sum=0;
    for(int j=0;j<3;++j)
    sum+=arr[i][j];
    if(sum>=2)
    ++c;
    }
    printf("%i\n", c);
    return 0;
}
