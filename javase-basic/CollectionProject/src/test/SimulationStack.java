package test;

import java.util.LinkedList;

public class SimulationStack {
	private LinkedList list;
	
	public SimulationStack() {
		list = new LinkedList<>();
	}
	
	public void add(Object e) {
		this.list.addFirst(e);
	}
	
	public Object get() {
		return this.list.removeFirst();
	}
	
	public Boolean isEmpty() {
		return this.list.isEmpty();
	}
}
