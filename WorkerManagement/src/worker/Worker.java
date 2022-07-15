package worker;

public class Worker {
	private int id;
	private String name;
	private String joinDate;
	
	public Worker(int id, String name, String joinDate) {
		this.id = id;
		this.name = name;
		this.joinDate = joinDate;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJoinDate() {
		return joinDate;
	}
	
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
}