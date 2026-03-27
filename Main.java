import java.util.Arrays;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
      public void reverseString(char[] s) {
        int i = 0;
        int j= s.length -1;
        char temp;
        while(i < j){
            temp = s[i];
            s[i] = s[j];
            s[j]= temp;
            i++;
            j++;
        }
    }

}