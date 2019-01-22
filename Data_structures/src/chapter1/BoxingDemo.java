package chapter1;

public class BoxingDemo {
	public static void main(String[] args) {
		GenericMemoryCell<Integer> m=new GenericMemoryCell<Integer>();
		//java7ÁâĞÎÔËËã·û:GenericMemoryCell<Integer> m=new GenericMemoryCell<>();
		m.write(37);
		int val=m.read();
		System.out.println("Contents are:"+val);
	}
}
