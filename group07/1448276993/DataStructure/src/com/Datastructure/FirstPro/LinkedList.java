package com.Datastructure.FirstPro;

import com.Datastructure.FirstPro.List;
import com.Datastructure.FirstPro.LinkedList.Node;

public class LinkedList implements List {
	
	private Node head=null;
	private Node last=null;
	private int size=0;
	
	public void add(Object o){
		Node newNode = new Node(o,null);
		if(head==null){
			head = newNode;
			last = newNode;
			size++;
		}else{
			addLast(o);
        }
       
	}
	public void add(int index , Object o){
		if(index<0&&index>size+1){
			System.out.println("Wrong Input!");
		}
		Node newNode = new Node(o,null);
		if(index==0){
			addFirst(o);
		}else if(index==size){
			addLast(o);
		}else{
			Node a=head;
			for(int i=0;i<index;i++){
				a=a.next;
				if(i==index-1){
					newNode.next=a.next;
					a.next=newNode;
					break;
				}
			}size++;
		}
		
	}
	public Node getNode(int index){
		if(head==null){
			return head;
		}
		Node a=head;
		for(int i=0;i<index;i++){
			a=a.next;
			if(i==index){
				break;
			}
		}
		return a;
	}
	public Object remove(int index){
		if(head==null){
			return head;
		}
		if(index>=size){
			System.out.println("wrong input!");
			return null;
		}
		if(index==0){
			removeFirst();
		}
		if(index==size){
			removeLast();
		}
		Node a=head;
		for(int i=0;i<index;i++){
			a=a.next;
			if(i==index-1){
				a.next=a.next.next;
				//a.next.next=null;
				size--;
			}
		}
		return a;
	}
	
	public int size(){
		return this.size;
	}
	
	public void addFirst(Object o){
		Node newNode = new Node(o,null);
		if(head==null){
			head=newNode;
			last=newNode;
		}else{
			newNode.next=head;
			head=newNode;
		}
		size++;
	}
	public void addLast(Object o){
		Node newNode = new Node(o,null);
		if(head==null){
			head=newNode;
		}else{
			last.next=newNode;
		}
		last=newNode;
		size++;
	}
	public Object removeFirst(){
		if(head==null){
			System.out.println("List Is Empty!");
		}else{
			head=head.next;
		}
		size--;
		return head;
	}
	public Object removeLast(){
		if(head==null){
			System.out.println("List Is Empty!");
			return null;
		}else{
			Node a=head;
			for(int i=0;i<size;i++){
				a=a.next;
				if(i==size-1){
					a=last;
					a.next=null;
					size--;
				}
			}
		}
		return head;
	}
	
	
	public static  class Node{
		Object data;
		
		Node next;
		
		public Node(Object e,Node node){
			this.data = e;
			this.next = node;
		}
	}
	public Object get(int index){
		return getNode(index).data;
	}
}
