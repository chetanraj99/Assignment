package generics;

public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics");
        System.out.println("String content: " + stringBox.getContent());

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer content: " + integerBox.getContent());

	}

}
