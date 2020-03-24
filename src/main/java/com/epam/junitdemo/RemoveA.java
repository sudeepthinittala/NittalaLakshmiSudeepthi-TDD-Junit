package com.epam.junitdemo;

public class RemoveA {

	public String remove(String string) {
		String str=string;
		if(string.equals("")) {
			return str;
		}
		else if(string.length()==1) {
			if(string.charAt(0)=='A') {
				return "";
				
			}
			else {
				return string;
			}
		}
		else {
			if(string.charAt(0)=='A' && string.charAt(1)=='A') {
				str=string.substring(2);
			}
			else if(string.charAt(0)=='A') {
				str=str.substring(1);
			}
			else if(string.charAt(1)=='A'){
				str=string.charAt(0)+string.substring(2);
			}
			return str;
		}
	}

}