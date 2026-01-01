class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] product = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int sum = product[i + j + 1] + digit1 * digit2;
                product[i + j + 1] = sum % 10; 
                product[i + j] += sum / 10;    
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : product) {
            if (!(sb.length() == 0 && num == 0)) { // skip leading zeros
                sb.append(num);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}