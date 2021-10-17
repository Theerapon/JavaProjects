package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());

        String stringData = "5 2 4 3 29 7 8 10";
        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());

        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());
    }
}
