
public class SortClass {

	int[] sortarr(int[] arry, int s) 
	{
		for (int i = 0; i < s; i++) 
		{
     
         for (int j = i + 1; j < s; j++) 
         {
             if (arry[i] > arry[j]) 
             {
               int  temp = arry[i];
                 arry[i] = arry[j];
                 arry[j] = temp;
             }
         }
		} return arry;
     }
    }
