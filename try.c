#include <stdio.h>
#include <stdlib.h>
 #define INIT_SIZE 8
  main()
   {
       int num;
       int*arr;
       int arrsize;
       int m;
        int in;
        arrsize= INIT_SIZE;
        arr= (int*)malloc(arrsize*sizeof(int));
        num = 0;
         while(scanf("%d", &in) == 1) {
                if(num >=arrsize)
                 {
                     arrsize*= 2;
                     arr= (int*)realloc(arr,arrsize*sizeof(int));
                     if(arr== NULL)
                    {
                            fprintf(stderr, "Allocation failed %d.\n"); exit(18);
                    }
                }
                arr[num++] = in;
        }
        for(m = 0; m < num; ++m)
            printf("%d\n",arr[m]);
}
