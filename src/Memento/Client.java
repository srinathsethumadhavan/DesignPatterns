package Memento;

public class Client {
public static void main(String args[]) {
	CareTaker caretaker = new CareTaker();
	Originator originator = new Originator();
	originator.setState("state 1");
	caretaker.add(originator.saveStateToMemento());
	System.out.println(originator.getState());
	originator.setState("state 2");
	caretaker.add(originator.saveStateToMemento());
	System.out.println(originator.getState());
	System.out.println(caretaker.get(1).getState());
	originator.setState("state 3");
	caretaker.add(originator.saveStateToMemento());
originator.getStateFromMemento(caretaker.get(0));

System.out.println(originator.getState());
}
	
}
