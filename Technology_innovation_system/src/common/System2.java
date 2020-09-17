package common;

public class System2 {
	private int id;
	private String jgmc;/*»ú¹¹Ãû³Æ*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public String getJgmc() {
		return jgmc;
	}
	public void setJgmc(String jgmc) {
		this.jgmc=jgmc;
	}
	System2(){}
	public System2(int id,String jgmc) {
		this.id = id;
		this.jgmc= jgmc;
	}
	public System2(String jgmc) {
		this.jgmc= jgmc;
	}
}
