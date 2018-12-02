public class Sort
{
  public static int[] SelectionSort(int[] data)
   {
      for (int i = 0; i < (data.length - 1); i ++)
      {
         int temp = i;
         int index = i;
         
         for (int j = (i + 1); j < data.length; j ++)
         {
            if (data[j] < data[temp])
               temp = j;
         }
         
         int piece = data[index];
         data[index] = data[temp];
         data[temp] = piece;
      }
      return data;
   }
}
