package common;

public class Pay4 {

	private int id;
	private String zcze;/*科技活动经费支出总额*/
	private String gzjnwf;/*人员工资及劳务费*/
	private String jjf;/*基建费*/
	private String sbgzf;/*仪器设备购置费*/
	private String zcjf;/*研发项目（课题）支出经费*/
	private String bgjf;/*日常运行和办公经费*/
	private String qtzc;/*其他支出*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getZcze() {
		return zcze;
	}
	public void setZcze(String zcze) {
		this.zcze=zcze;
	}
	public String getGzjnwf() {
		return gzjnwf;
	}
	public void setGzjnwf(String gzjnwf) {
		this.gzjnwf=gzjnwf;
	}
	public String getJjf() {
		return jjf;
	}
	public void setJjf(String jjf) {
		this.jjf=jjf;
	}
	public String getSbgzf() {
		return sbgzf;
	}
	public void setSbgzf(String sbgzf) {
		this.sbgzf=sbgzf;
	}
	public String getZcjf() {
		return zcjf;
	}
	public void setZcjf(String zcjf) {
		this.zcjf=zcjf;
	}
	public String getBgjf() {
		return bgjf;
	}
	public void setBgjf(String bgjf) {
		this.bgjf=bgjf;
	}
	public String getQtzc() {
		return qtzc;
	}
	public void setQtzc(String qtzc) {
		this.qtzc=qtzc;
	}
	public Pay4() {}
	public Pay4(int id,String zcze,String gzjnwf,String jjf,String sbgzf,String zcjf,String bgjf,String qtzc) {
		this.id = id;
		this.zcze=zcze;
		this.gzjnwf=gzjnwf;
		this.jjf=jjf;
		this.sbgzf=sbgzf;
		this.zcjf=zcjf;
		this.bgjf=bgjf;
		this.qtzc=qtzc;
	}
	public Pay4(String zcze,String gzjnwf,String jjf,String sbgzf,String zcjf,String bgjf,String qtzc) {
		this.zcze=zcze;
		this.gzjnwf=gzjnwf;
		this.jjf=jjf;
		this.sbgzf=sbgzf;
		this.zcjf=zcjf;
		this.bgjf=bgjf;
		this.qtzc=qtzc;
	}
}
