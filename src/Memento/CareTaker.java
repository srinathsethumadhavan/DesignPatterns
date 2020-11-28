package Memento;

import java.util.ArrayList;

public class CareTaker {

	ArrayList<Memento> list = new ArrayList<>();
	
	
	public void add(Memento memento)
	{
		list.add(memento);
	}
	
	public Memento get(int index)
	{
		return list.get(index);
	}
}
