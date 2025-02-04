public class Program2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,60};
        System.out.print("Old Array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int index = 3;
        int key = 40;
        arr = insertElement(arr, index, key);
        System.out.println("");
        System.out.print("New Array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] insertElement(int[] arr,int index,int key){
        int[] brr = new int[arr.length + 1];
        for (int i = 0; i < brr.length; i++){
            if(i < index){
                brr[i] = arr[i];
            } else if (i == index){
                brr[i] = key;
            } else {
                brr[i] = arr[i - 1];
            }
        }
        return brr;
    }
}

