package chapter1;

public class TestMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryCell m=new MemoryCell();
		m.write("37");
		String val=(String) m.read();
		System.out.println("Contents are:"+val);
	}

}
