import java.util.*;
public class FCP014{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int a = ab.nextInt();
int b = ab.nextInt();
int c = ab.nextInt();
if (a>b&&a>c){
System.out.println(a);
}
else if (b>c&&a>c){
System.out.println(b);
}
else {
System.out.println(c);
}
}
}


