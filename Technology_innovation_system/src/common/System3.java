package common;

public class System3 {
	private int id;
	private String jgmc;/*��������*/
	private String zzdj;/*���ʵȼ�*/
	private String pdbm;/*������������*/
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
	public String getZzdj() {
		return zzdj;
	}
	public void setZzdj(String zzdj) {
		this.zzdj=zzdj;
	}
	public String getPdbm() {
		return pdbm;
	}
	public void setPdbm(String pdbm) {
		this.pdbm=pdbm;
	}
	System3(){}
	public System3(int id,String jgmc,String zzdj,String pdbm) {
		this.id = id;
		this.jgmc= jgmc;
		this.zzdj= zzdj;
		this.pdbm= pdbm;
		
	}
	public System3(String jgmc,String zzdj,String pdbm) {
		this.jgmc= jgmc;
		this.zzdj= zzdj;
		this.pdbm= pdbm;
		
	}

}
