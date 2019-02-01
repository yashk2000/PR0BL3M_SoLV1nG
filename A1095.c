#include<stdio.h>
int main(){
int m=0;
scanf("%d",&m);
char str[m];
scanf("%s",&str);
int z=0;
printf("%c",str[z]);
z+=2;
for(int i=2;i<m;){
if(z<m)
printf("%c",str[z]);
++i;
z+=i;
}
printf("\n");
}
