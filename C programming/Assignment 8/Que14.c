//strcasecmp 
#include <stdio.h>
#include <string.h>
void main (){
	char str [] = "DhananjaySangle";
	char str1 []="Dhananjay";
int res =strcasecmp (str,str1);
if (res==0)
printf("Strings are equal");
else if (res<0)
printf("String 2 is greater");
else
printf("String 1 is greater");

}