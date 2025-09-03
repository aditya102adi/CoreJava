public class DSA_Questions {
    public static void main(String[] args) {
        String s = "1011011";
        int decimal = binaryToDecimal(s);
        System.out.println(decimal);
        System.out.println(decimalToBinary(decimal));

        System.out.println(tribonacci(5));
    }
    private static int tribonacci(int n)
    {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }


    private static String decimalToBinary(int num)
    {
        if (num == 0) return "0";
        StringBuilder s = new StringBuilder();
        while (num > 0)
        {
            if(num % 2 == 1)
                s.append('1');
            else
                s.append('0');

            num = num / 2;
        }

        s.reverse();
        return s.toString();
    }
    private static int binaryToDecimal(String s)
    {
        int n = s.length();

        int num = 0;
        int pow = 1;
        for(int i = n-1; i>=0; i--)
        {
            if(s.charAt(i)=='1')
            {
                num = num + pow;
            }
            pow = pow * 2;
        }

        return num;
    }
}
