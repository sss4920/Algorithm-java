package reflectionTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 어노테이션 정보를 읽어 올 수 있다.
 * 클래스 로더에 클래스 정보를 읽어들여서 메모리에 올리는데, 이때 정보를 읽어드리는게 원본이 아닌 거울에 투영된 것 같은 리플렉션으로 가져온다.
 * 접근 지정자를 무시하고 내용을 가져올 수 있다.
 */

class MyClass{
	private final String name = "수현";
}

public class HelloServiceFactory {
	public static void main(String[] args) throws Exception {
		// 1번째 방법. '클래스 타입'.class
		// final Class<MyClass> claxx1 = MyClass.class;

		// 2번째 방법. '인스턴스'.getClass()
		// final HelloService helloService = new HelloService();
		// final Class<? extends HelloService> clazz2 = helloService.getClass();
		//
		// // 3번째 방법. Class.forName('올 패키지 경로')
		// final Class<?> clazz3 = Class.forName("reflectionTest.HelloService");
		final Class<HelloService> serviceClass = HelloService.class;
		final Constructor<HelloService> constructor = serviceClass.getDeclaredConstructor(String.class, int.class);
		constructor.setAccessible(true);
		final HelloService helloService = constructor.newInstance("안뇽", 10);

		final Method declaredMethod = serviceClass.getDeclaredMethod("print");
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(helloService);

		final Field declaredName = serviceClass.getDeclaredField("name");
		final Field declaredAge = serviceClass.getDeclaredField("age");
		declaredAge.setAccessible(true);
		declaredName.setAccessible(true);

		declaredName.set(helloService, "안뇽뇽");
		declaredAge.set(helloService, 100);

		declaredMethod.invoke(helloService);



	}

}
