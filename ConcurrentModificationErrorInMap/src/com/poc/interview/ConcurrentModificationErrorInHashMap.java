package com.poc.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationErrorInHashMap extends Thread{
	static ConcurrentHashMap m=
			new ConcurrentHashMap<Integer,String>();
	
	public  void run( )
	{
		try{
			Thread.sleep(1000);
			
		}catch(InterruptedException ie)
		{
			
		}
		System.out.println("Child thread");
		m.put(103,"C");
	}

	
	public static void main(String... args ) throws InterruptedException
	{
		m.put(101,"A");
		m.put(102,"B");
		
		ConcurrentModificationErrorInHashMap t = new ConcurrentModificationErrorInHashMap();
		t.start();
		Set keySet = m.keySet();
		
		Iterator itr = keySet.iterator();
		
		while(itr.hasNext())
		{
			Integer i=(Integer) itr.next();
			System.out.println("Main thread Iterating Map and current entry is "+i+"   "+m.get(i));
		Thread.sleep(3000);
		}
		System.out.println(m);
	}

}
