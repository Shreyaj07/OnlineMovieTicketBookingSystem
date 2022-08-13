package javaSourseCode;

public class CustomerInput {
	
	String name;
	String mob;
    int seat;
    String type;
    int age;
    int cid;
	
	public CustomerInput(int cid,String name, String mob, int seat, String type, int age) {
		super();
		this.cid=cid;
		this.name = name;
		this.mob = mob;
		this.seat = seat;
		this.type = type;
		this.age = age;
	}
	public CustomerInput() {
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
    
    public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
    
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
