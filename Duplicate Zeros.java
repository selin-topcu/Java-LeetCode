class Solution {
    public void duplicateZeros(int[] arr) {
        int[] resultNums = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                resultNums[j] = arr[i];
                j++;
                if (j == arr.length) {
                    break;
                }
                resultNums[j] = 0;
                j++;
            } else {
                resultNums[j] = arr[i];
                j++;
            }
            if (j == arr.length) {
                break;
            }
        }
        for(int i = 0; i<arr.length;i++){
            arr[i]=resultNums[i];
        }
    }
}
