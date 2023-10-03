import java.util.Scanner;
public class myArray{
   int[] arr;
   int size, idx, ctr;
   public myArray(int s){
      size = s;
      arr = new int[size];
      idx = -1;
      ctr = 0;
   }
   public boolean isFull(){return ctr >= size;}
   public boolean isEmpty(){return ctr == 0;}
 
   public void add(int val)
   {
      if(!isFull()){
         arr[++idx] = val;
         ctr++;
      }
      else{
         System.out.println("Array is full!");
      }
   }
   //view()
   public void view(){
      System.out.println();
      for(int i = 0; i < ctr; i++){
         System.out.print("["+arr[i]+"]");
      }
      System.out.println();
   }
   //count
   public int count(){
      return ctr;
   } 
   
   //Delete()
   public void remove(int idx) {
      if(idx >= 0 && idx < ctr) {
         for(int i = idx; i < ctr - 1; i++) {
            arr[i] = arr[i + 1];
         }
      }
   }
            
   
   //update()
   public void edit(int index, int value){
      arr[index] = value;
                  
   }
   //search()
   public int search(int value)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                System.out.println("Found value at index " + i);
                return i;
            }
        }
        System.out.println("no found");
        return -1;
    }
   
   //sort()
   public void sort(char ascendOrDescend)
   {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
               if(ascendOrDescend == 'a'){
                  if ( arr[j] < arr[min_idx] ){
                    min_idx = j;
                  }
               }else{
                  if ( arr[j] > arr[min_idx] ){
                    min_idx = j;
                  }
               }
 
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
   
   public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
         System.out.println("enter size: ");
         int size = scan.nextInt();
         myArray m = new myArray(size);
         int n;
          
         do{
            System.out.println("\n[1] Add");
            System.out.println("[2] view");
            System.out.println("[3] remove");
            System.out.println("[4] search");
            System.out.println("[5] sortascending");
            System.out.println("[6] sortdescending");
            System.out.println("[7] edit");
            System.out.println("[8] exit\n");
            
            System.out.println("enter your choice: ");
            n = scan.nextInt();
            
            switch(n){
               case 1:
                    System.out.println("Enter number to add: ");
                    int value = scan.nextInt();
                    m.add(value);
                    break;
               case 2:
                    m.view();                 
                    break;
               case 3:
                    System.out.println("Enter index to remove"); 
                    int idx = scan.nextInt();
                    m.remove(idx);
                    break;
               case 4:
                    System.out.println("Enter value to search");
                    int vlue = scan.nextInt();
                    m.search(vlue);      
               default:
            }
         }
         while(n != 8);

      }
} 