#include <stdio.h>
#include <string.h>

int main(void)
{
    int n=0;
    printf("enter number of words:");
    scanf("%i\n", &n);
    char x[n][100];
    for(int i=0;i<n;++i)
    scanf("%s", x[i]);
    for(int i=0;i<n;++i)
    {
       if(strlen(x[i])<10)
       {
       printf(x[i]);
       printf("\n");
       }
       else
       {
          printf("%c%i%c\n", x[i][0], strlen(x[i])-2, x[i][strlen(x[i])-1]);
       }
    }
    return 0;

}
