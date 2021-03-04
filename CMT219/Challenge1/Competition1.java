
import java.util.*;

public class Competition1 {
    public static String ciphertext = "ETEVHTWGSAHGWYVPNKQOEGWYVPNKPDEPHWAOVWPFWNHANEVWXAVOAEAJEUXTAOWBTEVHTWGSAHGWYVPNQAOQVGTYHAVAXETOANFQEOIQPLANTEVHFYNSQVEBEOWSKNCKLOPEVTYJAUFWYNCOTWZESQEPERQSQOPEVYCEVHEGDEHEVHEYOPNQEEHWYFTKTEVHTWGSAHGWYVPNKQOWVAPDEPWVTKFWNHANOTEVHTWGSAHGWYVPNQAOPDANAENAWVTKPIWHWYFTKTEVHTWGSAHGWYVPNQAOQVPDAIWNTHWVAWBPDAUQOYLFASQOPEVIDEPQOPDAWPDANWVA";
    public static String phrase = "NEPALSERBIASWITZERLANDBURKINAFASOKYRGYZSTANLUXEMBOURGSLOVAKIATAJIKISTANUGANDACHADANDAUSTRIA";

    public static void main( String[] args ) {
		int[] phrase_arr = new int[phrase.length()];
		int count = 1;
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase_arr[i] != 0) {
				continue;
			}
			for (int j = i; j < phrase.length(); j++) {
				
				if (phrase.charAt(i) == phrase.charAt(j)) {
					phrase_arr[j] = count;
				}
			}
			count += 1;
		}
		
		int startPoint=0;
		for (int u = 0; u < (ciphertext.length() - phrase.length()); u++) {
			int[] test_arr = new int[phrase.length()];

			count = 1;
			for (int i = 0; i < phrase.length(); i++) {
				if (test_arr[i] != 0) {
					continue;
				}
				for (int j = i; j < phrase.length(); j++) {
				
					if (ciphertext.charAt(i+u) == ciphertext.charAt(j+u)) {
						test_arr[j] = count;
					}
				}
				count += 1;
			}
			if (Arrays.equals(phrase_arr,test_arr)) {
				
				startPoint = u;
				
			}	
		}
		Map <Character,Character> conversion = new HashMap<>();
		for (int i = 0; i < phrase.length(); i++) {
			
			if (conversion.containsKey(ciphertext.charAt(i+startPoint))) {
				continue;
			}
			else {
				conversion.put(ciphertext.charAt(i+startPoint),phrase.charAt(i));
			}
		}
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < ciphertext.length(); i++) {
			if (conversion.containsKey(ciphertext.charAt(i))) {
				str.append(conversion.get(ciphertext.charAt(i)));
			}
			else {
				str.append(ciphertext.charAt(i));	
			}
		}
		System.out.print(str.toString());	
	}
}