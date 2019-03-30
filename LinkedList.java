package com.reg.java;

public class LinkedList {

	Node head = null;
	Node current = null;

	void add (int data){
		
 		Node n = new Node();
		n.data = data;
		
		if(head == null)
		{
			head =n;
			current =n;
		}else
		{
			current.nextNode = n;
			current = n;
			
		}
	}
	
	

    void delete (int d) {
		Node t = null;
		Node n = head;
		
		while (n!= null) {
			if(n.data == d) {
				t.nextNode = n.nextNode ;
				break;
			}
			t = n;
			n= n.nextNode;
		}
	}
	
	
	void removeind (int p) {
		
		Node t = null; 
		Node n = head;
		int ind= 1;
		while (n!= null) {
			if (p == 1) {
				head = n.nextNode;
			}else if (ind == p) {
				t.nextNode = n.nextNode;
			}
			ind++;
			t = n;
			n = n.nextNode;
		}
		System.out.println("data is:");
	}
	
	
	void size () {
		int size = 0;
		Node temp = head;
		while(temp!= null) {
			
			size++;
			temp = temp.nextNode;
			
		}System.out.println("size is:"+size);
	}
	
	
	void max() {
		
		int max = head.data;
		Node temp = head;
		while (temp!= null) {
			if (temp.data >max) {
				max = temp.data;
			}
			temp = temp.nextNode;
			}
		System.out.println("max ele is:"+ max);
		}
	void min() {
		
		int min = head.data;
		Node temp = head;
		while (temp!= null) {
			if (temp.data < min) {
				
				min = temp.data;
			}
			temp = temp.nextNode;
		}
		System.out.println("min ele is :"+ min);
	}
	

	void display() {
		Node n = head;
		while (n != null) {
			System.out.println("the data at node is :" + n.data);
			n = n.nextNode;
			
		}

	}

}
