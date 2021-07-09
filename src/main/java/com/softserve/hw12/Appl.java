package com.softserve.hw12;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Appl {

	public static void main(String[] args) {
		String template = ")]}";
		//String text = "{a(a{a}a)a}a[a(a{a}a)a]";
		String text = "{a(a{a(})a)a}a[a(a{a}a)a]";
		//
		Map<Character, Character> dic = new HashMap<>();
		dic.put('{', '}');
		dic.put('(', ')');
		dic.put('[', ']');
		//
		Stack<Character> stk = new Stack<>();
		boolean result = true;
		//
		Character key;
		Character value;
		for (int i = 0; result && i < text.length(); i++) {
			key = text.charAt(i);
			value = dic.get(key);
			if (value != null) {
				stk.push(value);
			}
			if (template.contains(String.valueOf(key))) {
				result = result && key.equals(stk.pop());
			}
		}
		System.out.println("result = " + result);
	}
}
