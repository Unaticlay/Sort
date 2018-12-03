public class Sort
{
  
  public static int[] BubbleSort(int[] data)
   {
      for (int i = 0; i < (data.length - 1); i ++)
      {
         for (int j = 0; j < (data.length - 1 - i); j ++)
         {
            if (data[j] > data[j + 1])
            {
               int temp = data[j + 1];
               data[j + 1] = data[j];
               data[j] = temp;
            } 
         }
      }
      return data;
   }
  
  
  
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
