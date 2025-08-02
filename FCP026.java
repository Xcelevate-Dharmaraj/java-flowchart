import java.util.*;
public class FCP026{
    public static void main(String[] args){
Scanner ab = new Scanner(System.in);
int a = ab.nextInt();
int b = ab.nextInt();
int sum = 0;
for (int i = a;i<=b;i++){
sum = sum + i;
}
System.out.println(sum);
}
}