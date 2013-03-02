package com.waves.collections;

import java.util.LinkedList;

public class Queue1<T> 
{
	private LinkedList<T> items = new LinkedList<T>();
	public void enqueue(T item)
	{
		items.addLast(item);
	}
	public T dequeue()
	{
		return items.removeFirst();
	}
	public boolean isEmpty()
	{
		return (items.size() == 0);
	}
}
