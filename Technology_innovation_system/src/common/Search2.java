package common;

public class Search2 {
	private String ptmc;/*平台名称*/	
	private String ptjb;/*平台级别*/
	private String jsly;/*技术领域*/
	private String pzrq;/*批准日期*/
	private String szxs;/*所在县市*/
	private String jjjgj;/*京津冀共建*/
	private String tbr;/*填表人*/
	private String tb_time;/*填报日期*/
	
	public String getTbr() {
		return tbr;
	}
	public void setTbr(String tbr) {
		this.tbr=tbr;
	}
	public String getTb_time() {
		return tb_time;
	}
	public void setTb_time(String tb_time) {
		this.tb_time=tb_time;
	}
	public String getPtmc() {
		return ptmc;
	}
	public void setPtmc(String ptmc) {
		this.ptmc=ptmc;
	}
	public String getPtjb() {
		return ptjb;
	}
	public void setPtjb(String ptjb) {
		this.ptjb=ptjb;
	}
	public String getJsly() {
		return jsly;
	}
	public void setJsly(String jsly) {
		this.jsly=jsly;
	}
	public String getPzrq() {
		return pzrq;
	}
	public void setPzrq(String pzrq) {
		this.pzrq=pzrq;
	}
	public String getSzxs() {
		return szxs;
	}
	public void setSzxs(String szxs) {
		this.szxs=szxs;
	}
	public String getJjjgj() {
		return jjjgj;
	}
	public void setJjjgj(String jjjgj) {
		this.jjjgj=ptmc;
	}
	Search2(){
		
	}

	public Search2(String ptmc,String ptjb,String jsly,String pzrq,String szxs,String jjjgj) {
		this.ptmc=ptmc;
		this.ptjb=ptjb;
		this.jsly=jsly;
		this.pzrq=pzrq;
		this.szxs=szxs;
		this.jjjgj=jjjgj;
	}
	public Search2(String ptmc,String pzrq,String szxs,String tbr,String tb_time) {
		this.ptmc=ptmc;		
		this.tbr=tbr;
		this.pzrq=pzrq;
		this.szxs=szxs;
		this.tb_time=tb_time;
	}
}
