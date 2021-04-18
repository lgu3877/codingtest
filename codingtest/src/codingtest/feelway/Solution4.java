//package codingtest.feelway;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.io.*;
//class Node {
//	private char data;
//	private Node left;
//	private Node right;
//
//	public Node(char data) {
//		this.data = data;
//	}
//
//	public char getData() {
//		return data;
//	}
//
//	public void setData(char data) {
//		this.data = data;
//	}
//
//	public Node getLeft() {
//		return left;
//	}
//
//	public void setLeft(Node left) {
//		this.left = left;
//	}
//
//	public Node getRight() {
//		return right;
//	}
//
//	public void setRight(Node right) {
//		this.right = right;
//	}
//}
//
//class Tree {
//	public Node root; 
//	
//	public void createNode(int data, int leftData, int rightData) {
//		if(root == null) { 
//			root = new Node(data);
//
//			if(leftData != -1) {
//				root.left = new Node(leftData); 
//			}
//			if(rightData != -1) {
//				root.right = new Node(rightData); 
//			}
//		} else { 
//			searchNode(root, data, leftData, rightData);
//		}
//	}
//	
//	public void postorder(Node n) {
//		if (n != null) {
//			postorder(n.getLeft());
//			postorder(n.getRight());
//			System.out.print(n.getData() + " ");
//		}
//	}
//	
//}
//
//class Main {
//	
//	
//	
//	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		
//		Tree tr = new Tree();
//		
//		for(int i=0; i < input; i++) {
//			int i = sc.nextInt();
//			int j = sc.nextInt();
//			int k = sc.nextInt();
//			
//			tr.createNode(i,j,k);
//			
//		}
//		
//		tr.postorder(tr.root);
//		
//		
//	}
//}