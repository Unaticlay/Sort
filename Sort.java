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

   public static <T extends Comparable<? super T>> T[] InsertionSort (T[] data)
   {
      for (int i = 1; i < data.length; i ++)
      {
         int index = -1;
         for (int j = 0; j < i; j ++)
         {
            if ((data[i].compareTo(data[j]) < 0) && (index < 0))
               index = j;
         }


         T temp = data[i];
         if (index != -1)
         {
            for (int j = index; j < (i + 1); j++)
            {
               T hold = data[j];
               data[j] = temp;
               temp = hold;
            }
         }
      }

      return data;
   }
}
