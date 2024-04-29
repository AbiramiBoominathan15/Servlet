package com.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;
public class Program1 {
	public static void main(String[] args) {
		System.out.println("ArrayList implementation");
		ArrayList al = new ArrayList();
		int i;
		for(i=1;i<=5;i++)
		{
			al.add(i+1);
		}
System.out.println("print array list value:");
System.out.println(al);
al.add(2, "ram");
System.out.println("Add index=2");
System.out.println(al);
al.remove(2);
System.out.println("Remove index=2 ");
System.out.println(al);
System.out.println("Linked List");
LinkedList ll = new LinkedList();
System.out.println("add first object in linked list");
ll.addFirst("abi");
System.out.println("add Last object in linked list");
ll.addLast("Boominathan");
for(i=1;i<=5;i++)
{
	ll.add(i);
}
System.out.println("Display linked list");
System.out.println(ll);
//ll.clear();
//System.out.println(ll);
for(i=1;i<ll.size();i++)
{
	System.out.println(ll.get(i)+"");
	ll.pop();
	System.out.println("After pop"+ll);
}
System.out.println("vector implementation");
Vector v = new Vector();
for(i=1;i<=5;i++) {
	v.add(i);
}
System.out.println(v);
v.remove(3);
HashSet hs = new HashSet();
hs.add(101);
hs.add(102);
System.out.println(hs);
}
}