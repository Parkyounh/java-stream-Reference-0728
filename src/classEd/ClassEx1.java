package classEd;

class A{
	
}
class b{
	A a;
}
class C extends A{
	
}
interface D{
	
}
class E implements D{}
class F implements D{}
class G{
	D d1 = new E();
	D d2 = new F();
}
class H{
	void gmethod() {
		
	}
}
class I{
	void hmethod() {
		H h = new H();
		h.gmethod();
	}
}


public class ClassEx1 {

}
