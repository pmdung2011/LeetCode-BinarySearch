public class AddBinaryString {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int sum;
        int carry = 0;
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;

        //Start from the end of the strings
        while (indexA >= 0 || indexB >= 0) {
            //In case the index exceed the length, the bit set to 0
            int bitA = (indexA >= 0) ? Integer.parseInt(String.valueOf(a.charAt(indexA))) : 0;
            int bitB = (indexB >= 0) ? Integer.parseInt(String.valueOf(b.charAt(indexB))) : 0;

            //1011 + 101
            sum = carry ^ bitA ^ bitB;
            carry = (carry + bitA + bitB) > 1 ? 1 : 0;
            result.append((sum));
            indexA--;
            indexB--;
        }

        if (carry > 0) {
            result.append((carry));
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1111";
        System.out.println(addBinary(a, b));
    }
}
