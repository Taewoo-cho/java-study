package abstractClass;

public class App {

	public static void main(String[] args) {
		
		GameObject[] objs = { new Player(), new Monster() };
		
		for(GameObject obj : objs) {
			System.out.println(obj);
			obj.describe();
		}
		
		//추상 클래스는 객체를 만들 수 없다.
		//GameObject go = new GameObject();
		//new GameObject();
	}

}
