import java.util.Scanner;
class book{
String name;
String author;
int price;
int num_pages;
book(){
name="";
author="";
price=0;
num_pages=0;
}
void set(){
System.out.println("ENTER THE NAME OF THE BOOK");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
System.out.println("ENTER THE AUTHOR");
author=sc.nextLine();
System.out.println("ENTER THE PRICE");
price=sc.nextInt();
System.out.println("ENTER THE NUMBER OF PAGES");
num_pages=sc.nextInt();
}
public String toString() {
return("name of the book: "+name+"\n"+"name of the author: "+author+"\n"+"price of book: "+price+"\n"+"number of pages: "+num_pages);
}
}
class supply{
public static void main(String args[]){
int n;
System.out.println("ENTER THE NUMBER OF BOOKS");
Scanner kp=new Scanner(System.in);
n=kp.nextInt();
book b1[]=new book[n];
for(int i=0;i<n;i++){
b1[i]=new book();
b1[i].set();
}
for(int i=0;i<n;i++){
System.out.println("details of book "+(i+1));
System.out.println(b1[i]);
}
}
}