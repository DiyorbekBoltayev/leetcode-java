package arrays.easy;

public class Problem66 {

    public int[] plusOne(int[] digits) {
     int n = digits.length;
     int buffer = 1;
     for (int i = n-1; i>=0; i--){
       int num = digits[i]+buffer;
       if (num > 9){
         digits[i] = 0;
       } else {
         digits[i] = num;
         buffer=0;
         break;
       }
     }
     if (buffer == 1){
       int[] newArray = new int[n + 1];
       newArray[0] = 1;
       System.arraycopy(digits, 0, newArray, 1, 1);
       return newArray;
     }
     return digits;
    }

}
