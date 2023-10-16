public class MyArray {
    int[] arr;
    int size, idx, ctr;

    public MyArray(int s) {
        size = s;
        arr = new int[size];
        idx = -1;
        ctr = 0;
    }

    public boolean isFull() {
        return ctr >= size;
    }

    public boolean isEmpty() {
        return ctr == 0;
    }

    public void add(int val) {
        if (!isFull()) {
            arr[++idx] = val;
            ctr++;
        } else {
            System.out.println("Array is full!");
        }
    }

    // view()
    public void view() {
        System.out.println();
        for (int i = 0; i < ctr; i++) {
            System.out.print("[" + arr[i] + "]");
        }
        System.out.println();
    }

    // count
    public int count() {
        return ctr;
    }

    // remove()
    public void remove(int index) {
        if (index >= 0 && index < ctr) {
            for (int i = index; i < ctr - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[ctr - 1] = 0;
            ctr--;
        } else {
            System.out.println("Invalid index for removal.");
        }
    }

    // edit()
    public void edit(int index, int value) {
        if (index >= 0 && index < ctr) {
            arr[index] = value;
        } else {
            System.out.println("Invalid index for editing.");
        }
    }

    // search()
    public int search(int value) {
        for (int i = 0; i < ctr; i++) {
            if (arr[i] == value) {
                System.out.println("Found value at index " + i);
                return i;
            }
        }
        System.out.println("Value not found.");
        return -1;
    }

    // sort()
    public void sort(char ascendOrDescend) {
        int n = ctr;

        for (int i = 0; i < n - 1; i++) {
            int minOrMaxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if ((ascendOrDescend == 'a' && arr[j] < arr[minOrMaxIdx]) ||
                    (ascendOrDescend == 'd' && arr[j] > arr[minOrMaxIdx])) {
                    minOrMaxIdx = j;
                }
            }

            int temp = arr[minOrMaxIdx];
            arr[minOrMaxIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
    

   