package game.objects;

public class GameObject {
	private int id;
	private String name;
	private int[][] comparison = {
			//가위0 바위1 보2 win(1) lose(-1) 비김(0)
	/*가위0*/		{0, -1, 1},
	/*바위1*/		{1, 0, -1},
	/*보2*/		{-1, 1, 0}
	
	};
	
	public int compare(GameObject ob) {
		return comparison[id][ob.id];
	}
	
	// get 가져오기 // set 저장하기
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "GameObject [ id= " + id + ", name= " + name + " ]" ;
	}
	
}
	
	
	

