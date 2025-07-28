package classEd;

public class SeasonEx {
	public static void main(String[] args) {
		for (Season a : Season.values()) {
			System.out.println(a.name+a.temp);
		}
	}
}
