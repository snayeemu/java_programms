
import java.util.Scanner;

class AscendingOrderSingleFile
 {
 
    private int[] array; 
  

 public AscendingOrderSingleFile(int[] receiver)
 {
  array=receiver;
 }
 
 public void sortAscending()
 {  
    int x=0;
  
  for(int i=0;i<array.length;i++)
    for(int j=i+1;j<array.length;j++)
  
       if (array[i]>array[j])
        { 
          x=array[i];
         array[i]=array[j];
         array[j]=x;
        }
   
   
 }
 
 public void display_result()
 {
  for(int i=0;i<array.length;i++)
  System.out.printf("%d ",array[i]);
  System.out.printf("\n\n");
 }
 
 
 //*******************************************************************
 
 public static void main(String[] args)
 { 
   
  
   int size;
   
   Scanner input= new Scanner(System.in);
   
   System.out.printf("Enter the size of your array: ");
   size=input.nextInt();
   
   int[] my_array= new int[size];   
   
   
   System.out.printf("\nEnter the array elements: \n");
 
   
   for(int i=0; i<size; i++)
   my_array[i]=input.nextInt();
   
   
   
   
   AscendingOrderSingleFile A=new AscendingOrderSingleFile(my_array);
   
      System.out.println("\nSet of values before arranging:\n");
      A.display_result();
      A.sortAscending();
         
      System.out.printf("\nSet of values after arranging:\n\n");
      A.display_result();
      
      //*****************************************************
      
       System.out.printf("\n my_array of main has also become sorted:\n");
      
      for(int i=0; i<size; i++)
      System.out.printf("%d ",my_array[i]);
      
      System.out.println("\n\n");
      
     
      
      
      
 }
 
 }