import java.io.*;
import java.util.*;
public class Count {

public int counter(String str) {
int j = 0;
char[] chr = str.toCharArray();
for(char c : chr) {
	j++;
	System.out.println(j);
	}
return j;
    }

public static void main(String[] args) {
	Count c = new Count();
	c.counter("Hello");
}
}
