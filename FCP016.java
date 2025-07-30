import java.util.*;
public class FCP016{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int a  = ab.nextInt();
if (a%4==0){
if (a%100==0){
if (a%400==0){
System.out.println("YES");
}
else {

System.out.println("NO");

} 
 } else {

System.out.println("YES");
}
 } else {

System.out.println("NO");
}
}
}

