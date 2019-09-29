#include<stdio.h>
int sq(int num);
int main() {
   int n;
  scanf("%d",&n);
  printf("%d",sq(n));
   return 0;
}
int sq(int num)
{
  int res=num*num;
  return res;
}