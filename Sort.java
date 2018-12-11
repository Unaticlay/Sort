public class Sort
{
  
  public static <T extends Comparable<? super T>> T[] BubbleSort(T[] data)
   {
      for (int i = 0; i < (data.length - 1); i ++)
      {
         for (int j = 0; j < (data.length - 1 - i); j ++)
         {
            if (data[j].compareTo(data[j + 1]) > 0)
            {
               T temp = data[j + 1];
               data[j + 1] = data[j];
               data[j] = temp;
            } 
         }
      }
      
      return data;
   }
   
   public static <T extends Comparable<? super T>> T[] SelectionSort(T[] data)
   {
      for (int i = 0; i < (data.length - 1); i ++)
      {
         int temp = i;
         int index = i;
         
         for (int j = (i + 1); j < data.length; j ++)
         {
            if (data[j].compareTo(data[temp]) < 0)
               temp = j;
         }
         
         T piece = data[index];
         data[index] = data[temp];
         data[temp] = piece;
      }
      return data;
   }
}
