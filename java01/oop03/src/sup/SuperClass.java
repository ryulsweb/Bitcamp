package sup;

//	부모 클래스

public class SuperClass{
	
	private String pri_name;	// 접근 금지
	public String pub_name;		// 누구나 접근가능 class에서는 쓰는 경우 거의 없음.
	protected String pro_name;	// 자식클래스에서만 접근허용
	
	public SuperClass() {
		
	}
	
	public String getPri_name() {
		return pri_name;
	}

	public void setPri_name(String pri_name) {
		this.pri_name = pri_name;
	}

	
	public void Super_method() {
		System.out.println("SuperClass Super_method()");
	}
	
}
