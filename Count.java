import java.io.*;

public class Count {

public int counter(String str) {
	if(str == null) return -1;
int j = 0;
char[] chr = str.toCharArray();
for(char c : chr) {
	j++;
	}
return j;
    }

public static void main(String[] args) {
	Count c = new Count();
	System.out.println(c.counter("Hello World"));
}
}
