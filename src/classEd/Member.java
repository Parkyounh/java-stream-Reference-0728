package classEd;

public class Member {
	String name;
	String phone;
	String address;
	int sal;
	
	Member(){
		
	}
	
	public Member(String name, String phone) {
		this(name,phone,"서울",100);
		this.name = name;
		this.phone = phone;
	}

	public Member(String name, String phone, String address) {
		this(name,phone,"서울",100);
	}

	public Member(String name, String phone, String address, int sal) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.sal = sal;
	}

	public static void main(String[] args) {
		Member member =new Member();
		
	}

}
