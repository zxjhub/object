package common;

public class System4 {
	private int id;
	private String scxmc;/*中试生产线(基地)名称*/
	private String szdw;/*所在单位*/
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
