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
      arr[idx] = 0;
     }
   }
            
   
   //edit()
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
         System.out.println("Enter size of index: ");
         int size = scan.nextInt();
         myArray m = new myArray(size);
         int n;
          
         do{
            System.out.println("===MY ARRAY===");
            System.out.println("\n[1] Add");
            System.out.println("[2] View");
            System.out.println("[3] Remove");
            System.out.println("[4] Search");
            System.out.println("[5] Sort Ascending");
            System.out.println("[6] Sort Descending");
            System.out.println("[7] Edit");
            System.out.println("[8] Exit\n");
            
            System.out.println("ENTER YOUR CHOICE: ");
            n = scan.nextInt();
            
            switch(n){
               case 1:
                    System.out.println("ENTER NUMBER TO ADD: ");
                    int value = scan.nextInt();
                    m.add(value);
                    break;
               case 2:
                    m.view();                 
                    break;
               case 3:
                    System.out.println("ENTER INDEX TO REMOVE: "); 
                    int idx = scan.nextInt();
                    m.remove(idx);
                    break;
               case 4:
                    System.out.println("ENTER VALUE TO SEARCH: ");
                    int vlue = scan.nextInt();
                    m.search(vlue);
                    break;
               case 5:
                    m.sort('a');
                    break;
               case 6:
                    m.sort('d');
                    break;
               case 7:
                    System.out.println("ENTER VALUE TO REPLACE: ");
                    int valuetoreplace = scan.nextInt();
                    System.out.println("ENTER INDEX TO EDIT: ");
                    int indextoedit = scan.nextInt();
                    m.edit(indextoedit, valuetoreplace);  
                    break;
               case 8:
                    System.out.println("Exit....");
                    break;                      
               default: 
            }
         }
         while(n != 8);

      }
} 