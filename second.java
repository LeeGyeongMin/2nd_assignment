import java.util.Scanner;

public class second {
 public static void main (String[] args){
  String str1, str2, str3;
  Scanner sc = new Scanner(System.in);
  System.out.print("Give me a sentence (No space):");
  str1 = sc.next();
  System.out.print("Give me characters to delete :");
  str2 = sc.next();
  
  str3 = str1.replace(str2,"");
  System.out.print("Original sentence :");
  System.out.println(str1);
  
  System.out.print("Modified sentence : ");
  System.out.println(str3);
 }
} 