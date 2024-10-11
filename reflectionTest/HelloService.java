package reflectionTest;

public class HelloService {
	private final String name;
	private final int age;
	public HelloService(String name, int age) {
		this.name = name;
		this. age = age;
	}

	private void print(){
		System.out.println(name + " "+ age);
	}
}
