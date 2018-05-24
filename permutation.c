#include<stdio.h>
#include<string.h>
void switching(char *a,char *b)
{
  char t;
  t=*a;
  *a=*b;
  *b=t;
}
void permutation(char *c,int f,int l)
{
  int i;
  if(f==l)
  printf("%s\n",c);
  else
  {
    for(i=f;i<=l;i++)
    {
      switching((c+f),(c+i));
      permutation(c,f+1,l);
      switching((c+f),(c+i));
    }
  }
}
int main()
{
  char s[100];
  scanf("%s",s);
  int n=strlen(s);
  permutation(s,0,n-1);
  return 0;
}
