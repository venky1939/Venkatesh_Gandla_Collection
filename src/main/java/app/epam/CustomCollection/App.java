package app.epam.CustomCollection;
import java.util.*;
class App{
public static void main(String args[])
{
Collection col=new Collection();
col.add("v");
col.add("e");
col.add("n");
col.add("k");
col.add("y");
col.add("1");
col.add("9");
col.add("3");
col.add("9");
col.add("h");
System.out.println("The predefined elements in collection are:");
col.print();
Label:while("True"!=null)
{
System.out.println("1.Adding an element into the collection\n2.Retrieve an element from the collection\n3.Remove an elemnt from the collection");
System.out.println("Enter your choice:");
Scanner s=new Scanner(System.in);
int choice=s.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter the number of elements:");
Scanner ss=new Scanner(System.in);
int var1=ss.nextInt();
System.out.println("Enter the elements:");
for(int i=0;i<var1;i++)
{
Scanner v=new Scanner(System.in);
String vv=v.next();
col.add(vv);
}
     col.print();
     break;
case 2:
System.out.println("Enter the index number of an element to retrieve:");
Scanner sc=new Scanner(System.in);
int g=sc.nextInt();
Object o=col.get(g);
System.out.println("The element at index "+g +" is:"+o);
break;
case 3:
System.out.println("Enter index number of an element to remove from the collection:");
Scanner sss=new Scanner(System.in);
int r=sss.nextInt();
col.remove(r);
System.out.println();
System.out.println("Elements in collection after removing an element are:");
col.print();
break;
default:
System.out.println("Wrong selection");
}
Label1:while("True"!=null) {    
    System.out.println();
	System.out.println("Do you want to continue(Y/N):"); 
    Scanner ch=new Scanner(System.in);
    char c=ch.next().charAt(0);
    
        if(c=='Y'||c=='y') {
        	continue Label;
        }
        else if(c=='N'||c=='n'){
        	break Label;
        }
        else if(c!='Y'&&c!='N'&&c!='y'&&c!='n') {
        	System.out.println("Wrong choice");
        	continue Label1;
        }
}
}
}
}
