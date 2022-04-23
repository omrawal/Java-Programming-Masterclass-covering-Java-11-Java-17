package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Codec obj = new Codec();
        String url="https://leetcode.com/problems/design-tinyurl";
        String tiny = obj.encode(url); // returns the encoded tiny url.
        String ans = obj.decode(tiny); // returns the original url after deconding it.
        System.out.println(tiny);
        System.out.println(ans);
    }
}
