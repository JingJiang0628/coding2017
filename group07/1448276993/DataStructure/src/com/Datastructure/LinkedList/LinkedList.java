package com.Datastructure.LinkedList;

import com.Datastructure.FirstPro.List;
import com.Datastructure.FirstPro.LinkedList.Node;

public class LinkedList implements List {
	
	private Node head=null;
	private Node last=null;
	private int size=0;
	private int length;
	
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
		if(index>=this.size()){
			System.out.println("wrong input!");
			return null;
		}
		if(index==0){
			removeFirst();
		}
		if(index==this.size()-1){
			removeLast();
		}
		Node a=head;
		for(int i=0;i<=index;i++){
			if(i==index-1){
				a.next=a.next.next;
				//a.next.next=null;
				size--;
			}else{
				a=a.next;
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


	
	
	/**
	 * �Ѹ���������
	 * ��������Ϊ 3->7->10 , ���ú��Ϊ  10->7->3
	 */
	@SuppressWarnings("null")
	public  void reverse(){	
		int a=0;
		for(int i=this.size()-1;i>=0;i--){
			for(int j=0;j<this.size();j++){
				if(i!=j&&i>j){
					a=(int) this.getNode(i).data;
					this.getNode(i).data=this.getNode(j).data;
					this.getNode(j).data=a;
				}
			}
			
		}
	}
	
	
	/**
	 * ɾ��һ����������ǰ�벿��
	 * ���磺list = 2->5->7->8 , ɾ���Ժ��ֵΪ 7->8
	 * ���list = 2->5->7->8->10 ,ɾ���Ժ��ֵΪ7,8,10

	 */
	public void removeFirstHalf(){
		this.head=this.getNode(size/2);
		this.size=this.size-this.size/2;
	}
	
	/**
	 * �ӵ�i��Ԫ�ؿ�ʼ�� ɾ��length ��Ԫ�� �� ע��i��0��ʼ
	 * @param i
	 * @param length
	 */
	public  void remove(int i, int length){
		if(i==0&&length<size){
			head=getNode(size-length-1);
		}else if(i==size&&length==1){
			removeLast();
		}else if(length<size-i&&i>0&&i<size){
			for(int k=i;k<length+i-1;k++){
				remove(k);
			}
		}
	}
	/**
	 * �ٶ���ǰ������list���������������е�����
	 * �ӵ�ǰ������ȡ����Щlist��ָ����Ԫ��
	 * ���統ǰ���� = 11->101->201->301->401->501->601->701
	 * listB = 1->3->4->6
	 * ���صĽ��Ӧ����[101,301,401,601]  
	 * @param list
	 */
	public  int[] getElements(LinkedList list){
		int newlist[]=new int[list.size()];
		for(int i=0;i<list.size();i++){
			newlist[i]=(int)this.get((int)list.get(i));
		}
		return newlist;
	}
	
	/**
	 * ��֪�����е�Ԫ����ֵ�����������У����Ե��������洢�ṹ��
	 * �ӵ�ǰ��������ɾ����list�г��ֵ�Ԫ�� 

	 * @param list
	 */
	
	public  void subtract(LinkedList list){
		for(int i=this.size()-1;i>=0;i--){
			for(int j=0;j<list.size();j++){
				if(this.get(i)==list.get(j)){
					this.remove(i);
					break;
				}
			}
		}
	}
	
	/**
	 * ��֪��ǰ�����е�Ԫ����ֵ�����������У����Ե��������洢�ṹ��
	 * ɾ����������ֵ��ͬ�Ķ���Ԫ�أ�ʹ�ò���������Ա�������Ԫ�ص�ֵ������ͬ��
	 */
	public  void removeDuplicateValues(){
		for(int i=0;i<this.size();i++){
			for(int j=i+1;j<this.size();j++){
				if(this.get(i)==this.get(j)){
					this.remove(i);
					i=--i;
					break;
				}
			}
		}
	}
	
	/**
	 * ��֪�����е�Ԫ����ֵ�����������У����Ե��������洢�ṹ��
	 * ��дһ��Ч���㷨��ɾ����������ֵ����min��С��max��Ԫ�أ������д���������Ԫ�أ�
	 * @param min
	 * @param max
	 */
	public  void removeRange(int min, int max){
		for(int i=0;i<size;i++){
			if((int)get(i)>min&&(int)get(i)<max){
				remove(i);
			}
		}
	}
	
	/**
	 * ���赱ǰ�����Ͳ���listָ������������Ԫ����ֵ�����������У�ͬһ���е�Ԫ��ֵ������ͬ��
	 * ��Ҫ������������C����Ԫ��Ϊ��ǰ������list��Ԫ�صĽ������ұ�C�е�Ԫ������ֵ������������
	 * @param list
	 */
	@SuppressWarnings("null")
	public  LinkedList intersection( LinkedList list){
		LinkedList C = null;
		for(int i=this.size()-1;i>=0;i--){
			for(int j=0;j<list.size();j++){
				if(this.get(i)==list.get(j)){
					C.add((int)this.get(i));
				}
			}
		}
		return C;
	}
}