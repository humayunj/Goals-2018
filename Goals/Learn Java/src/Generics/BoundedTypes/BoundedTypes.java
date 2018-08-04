import java.io.OutputStream;


class CloneTest implements Cloneable {
	int x,y;

	public CloneTest getClone() {
		try {
			return (CloneTest)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}

public class BoundedTypes {

	public static void main(String[] args) throws Exception {
		
		CloneTest t1 = new CloneTest();
		t1.x = 10;
		t1.y = 20;

		CloneTest t2 = t1.getClone();
		t2.y = 30;
		System.out.println("X:"+t1.x+",Y:"+t1.y);
	

	}
}