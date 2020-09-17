package common;

public class System5 {
	private int id;
	private String fwxm;/*服务项目*/
	private String fwnr;/*服务内容(限50字以内*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getFwxm() {
		return fwxm;
	}
	public void setFwxm(String fwxm) {
		this.fwxm=fwxm;
	}
	public String getFwnr() {
		return fwnr;
	}
	public void setFwnr(String fwnr) {
		this.fwnr=fwnr;
	}
	System5(){}
	public System5(int id,String fwxm, String fwnr) {
		this.id = id;
		this.fwxm= fwxm;
		this.fwnr=fwnr;
	}
	public System5(String fwxm, String fwnr) {
		this.fwxm= fwxm;
		this.fwnr=fwnr;
	}
}
