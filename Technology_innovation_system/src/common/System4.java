package common;

public class System4 {
	private int id;
	private String scxmc;/*����������(����)����*/
	private String szdw;/*���ڵ�λ*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getScxmc() {
		return scxmc;
	}
	public void setScxmc(String scxmc) {
		this.scxmc=scxmc;
	}
	public String getSzdw() {
		return szdw;
	}
	public void setSzdw(String szdw) {
		this.szdw=szdw;
	}
	System4(){}
	public System4(int id,String scxmc, String szdw) {
		this.id = id;
		this.scxmc= scxmc;
		this.szdw=szdw;
	}
	public System4(String scxmc, String szdw) {
		this.scxmc= scxmc;
		this.szdw=szdw;
	}
}
