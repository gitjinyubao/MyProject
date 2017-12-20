package test;

public class GenericPamInterfaceImpl<T> implements GenericPamInterface<T>{

	@Override
	public void show(T t) {
		System.out.println(t);
	}
}
