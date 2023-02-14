public class smallestelement {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int temp=0;
        {
            for (int i = 1; i <= arr.length-i; i++)
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[i] >arr[j]) {
                    temp= arr[i];
                    arr[i] = arr[j];
                    temp = arr[i];
                }
                //System.out.println(temp;
            }
            System.out.println(temp);
        }
    }
}