package common;

public class System1 {
	private int id;
	private String yjfx;/*研究方向*/
	private String yjnr;/*研究内容*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getYjfx() {
		return yjfx;
	}
	public void setYjfx(String yjfx) {
		this.yjfx=yjfx;
	}
	public String getYjnr() {
		return yjnr;
	}
	public void setYjnr(String yjnr) {
		this.yjnr=yjnr;
	}
	System1(){}
	public System1(int id,String yjfx, String yjnr) {
		this.id = id;
		this.yjfx= yjfx;
		this.yjnr=yjnr;
	}
	public System1(String yjfx, String yjnr) {
		this.yjfx= yjfx;
		this.yjnr=yjnr;
	}
}
