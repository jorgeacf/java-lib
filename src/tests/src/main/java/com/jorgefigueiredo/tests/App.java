package com.jorgefigueiredo.tests;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Set<Integer> set1 = new HashSet<Integer>();
    	
    	Integer a = 1;
    	Integer b = 2;
    	
    	set1.add(a);
    	set1.add(b);
    	
    	for(Integer i : set1) {
    		System.out.print(i + " ");
    	}
    	
    	a = 99;
    	
    	for(Integer i : set1) {
    		System.out.print(i + " ");
    	}
    	
    	System.out.println("-----------");
    	
    	Set<Element> set2 = new HashSet<Element>();
    	
    	Element a2 = new Element("a2");
    	Element b2 = new Element("b2");
    	
    	set2.add(a2);
    	set2.add(b2);
    	
    	for(Element i : set2) {
    		System.out.print(i + " ");
    	}
    	
    	a2 = new Element("XX");
    	
    	for(Element i : set2) {
    		System.out.print(i + " ");
    	}
    	
    	System.out.println(set2.iterator().next() == b2);
    	
    	Iterator<Element> i = set2.iterator();
    	i.next();
    	System.out.println(i.next() == b2);
    	
        System.out.println( "End!" );
        
        Element x = new Element("X");
        Element y = new Element("Y");
        Element w = new Element("X");
        
        System.out.println(x == y);
        System.out.println(x == w);
        
        System.out.println(x.equals(y));
        System.out.println(x.equals(w));
    }
    
    private static class Element {
    	
    	private final String value;
    	
    	public Element(String value) {
    		this.value = value;
    	}
    	
    	@Override
    	public int hashCode() {
    		return value.hashCode();
    	}
    	
    	@Override
    	public boolean equals(Object obj) {
    		
    		if (obj instanceof Element) {
    			Element element = (Element)obj;
    			return element.value.equals(this.value);
    		}
    		
    		return false;
    	}
    	
    	@Override
    	public String toString() {
    		return value.toString();
    	}
    }
}
