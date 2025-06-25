//strncat
#include <stdio.h>
#include <string.h>
void main (){
	char str1[20] = "Dhananjay ";
    char str2[] = "Sangle";

    strncat(str1, str2, 3);  

    printf("%s\n", str1);
}