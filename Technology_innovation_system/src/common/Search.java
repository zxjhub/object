package common;

public class Search {
	private String ptmc;/*ƽ̨����*/
	private String dcnd;/*�������*/
	private String tbr;/*�����*/
	private String tb_time;/*�ʱ��*/
	private String szbm;/*�ʱ��*/
	private String ptlx;/*�ʱ��*/
	public String getPtlx() {
		return ptlx;
	}
	public void setPtlx(String ptlx) {
		this.ptlx = ptlx;
	}
	public String getSzbm() {
		return szbm;
	}
	public void setSzbm(String szbm) {
		this.szbm=szbm;
	}
	public String getPtmc() {
		return ptmc;
	}
	public void setPtmc(String ptmc) {
		this.ptmc=ptmc;
	}
	public String getDcnd() {
		return dcnd;
	}
	public void setDcnd(String dcnd) {
		this.dcnd=dcnd;
	}
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
	public Search() {}	
	public Search(String ptmc,String dcnd,String tbr,String tb_time) {
		this.ptmc=ptmc;
		this.dcnd=dcnd;
		this.tbr=tbr;
		this.tb_time=tb_time;

	}
	public Search(String ptmc,String dcnd,String tbr,String tb_time,String szbm, String ptlx) {
		this.ptmc=ptmc;
		this.dcnd=dcnd;
		this.tbr=tbr;
		this.tb_time=tb_time;
		this.szbm=szbm;
		this.ptlx=ptlx;
	}

}
