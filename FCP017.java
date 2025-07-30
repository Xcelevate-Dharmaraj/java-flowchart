import java.util.*;
public class FCP017{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int a = ab.nextInt();
int b = ab.nextInt();
int c = ab.nextInt();
int min = 0 ;
int max = 0 ;
if (a>b){
min = b ;
max = a;
}
else {
min = a;
max = b;
}
if (min>c){
 System.out.println(min);
}
else  {
min = c;
}
if (max>min){
 System.out.println(min);
}
else{
 System.out.println(max); 
}
}
}





