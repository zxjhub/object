package common;

public class Ptmessage {
	private int id;
	private String ptmc;/*ƽ̨����*/
	private String ytdw;/*���е�λ*/
	private String ptjb;/*ƽ̨����*/
	private String ptlx;/*ƽ̨����*/
	private String pzrq;/*��׼����*/
	private String pzwh;/*��׼�ĺ�*/
	private String username;/*��¼��*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getPtmc() {
		return ptmc;
	}
	public void setPtmc(String ptmc) {
		this.ptmc=ptmc;
	}
	public String getYtdw() {
		return ytdw;
	}
	public void setYtdw(String ytdw) {
		this.ytdw=ytdw;
	}
	public String getPtjb() {
		return ptjb;
	}
	public void setPtjb(String ptjb) {
		this.ptjb=ptjb;
	}
	public String getPtlx() {
		return ptlx;
	}
	public void setPtlx(String ptlx) {
		this.ptlx=ptlx;
	}
	public String getPzrq() {
		return pzrq;
	}
	public void setPzrq(String pzrq) {
		this.pzrq=pzrq;
	}
	public String getPzwh() {
		return pzwh;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public Ptmessage () {}	
	public Ptmessage(int id,String ptmc, String ytdw,String ptjb,String ptlx,String pzrq,String pzwh,String username) {
		this.id = id;
		this.ytdw= ytdw;
		this.ptmc=ptmc;
		this.ytdw=ytdw;
		this.ptjb=ptjb;
		this.ptlx=ptlx;
		this.pzrq=pzrq;
		this.pzwh=pzwh;
		this.username=username;
	}
	public Ptmessage(String ptmc, String ytdw,String ptjb,String ptlx,String pzrq,String pzwh,String username) {		
		this.ytdw= ytdw;
		this.ptmc=ptmc;
		this.ytdw=ytdw;
		this.ptjb=ptjb;
		this.ptlx=ptlx;
		this.pzrq=pzrq;
		this.pzwh=pzwh;
		this.username=username;
	}
	public Ptmessage(String ptmc, String ytdw,String ptlx) {		
		this.ytdw= ytdw;
		this.ptmc=ptmc;
		this.ptlx=ptlx;

	}
	public Ptmessage(String ptmc,String ytdw,String pzrq,String pzwh) {		
		this.ytdw= ytdw;
		this.ptmc=ptmc;
		this.pzrq=pzrq;
		this.pzwh=pzwh;

	}

}
