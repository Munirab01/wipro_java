//import java.util.*;

public class nambiar_number {
    public static int generateNambiar(String input){
        StringBuilder res = new StringBuilder();
        int i = 0;

        while(i<input.length()){
            int sum = 0;
            int digit = input.charAt(i)-'0';

            boolean findingEven = (digit%2!=0);
            sum += digit;
            i++;

            while(i<input.length()){
                int nextDigit = input.charAt(i)-'0';
                sum += nextDigit;

                if((sum%2==0 && findingEven) || (sum%2!=0 && !findingEven)){
                    i++;
                    break;
                }
                i++;
            }
            res.append(sum);
        }
    return Integer.parseInt(res.toString()) ;
    }

    public static void main(String[] args) {
        System.out.println(generateNambiar("9880127431"));  // ✅ 26971
        System.out.println(generateNambiar("9860857152"));  // ✅ 3687
        System.out.println(generateNambiar("8123454210"));  // ✅ 95970
        System.out.println(generateNambiar("9900114279"));  // ✅ 181149
    }
}
