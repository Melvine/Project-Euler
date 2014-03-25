/*multiples of 3 or 5: 3,5,6,9; sum is 23*/

#include <stdio.h>

int main()
{
int value,value2,limit = 1000;
int i,divi,sum = 0; 

/*read user input for the first value*/
scanf("%d",&value);
/*get sum of all multiples of value*/
for(i = value;i < limit;){
    sum = sum + i;
    i = i + value;
}
printf("%d\n",sum);
printf("done for %d\n",value);

/*read user input for the second value*/
scanf("%d",&value2);
/*get sum of all multiples of value2*/
for(i = value2;i < limit;){
    divi = i%value;
    if((divi)==0){
        i = i + value2;
    }
    else
    {
        sum = sum + i;
        i = i + value2;
    }

}
printf("%d\n",sum);
printf("done for %d\n",value2);
return 0;
}
