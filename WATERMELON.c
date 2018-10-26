#include <stdio.h>

int main(void)
{
    int w=0;
    printf("enter weight of watermelon:");
    scanf("%i\n", &w);
    if(w>0 && w<=100)
    {
        if(w%2==0)
        printf("YES")
        else
        printf("NO");
        return 0;
    }
    else
    printf("invalid input");return 1;
}
