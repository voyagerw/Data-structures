package chapter1;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoryCell m=new MemoryCell ();
		m.write(new Integer(37));
		Integer wrapperValue=(Integer)m.read();
		int val=wrapperValue.intValue();
		System.out.println("Contents are:"+val);
	}

}
