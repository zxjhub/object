package common;

public class Fm{
	private int id;
	private String username;/*��¼��*/
	private String glbm;/*��ڹ�����*/
	private String tbr;/*�����*/
	private String szbm;/*��������ڲ���*/
	private String lxdh;/*�������ϵ�绰*/
	private String sjhm;/*������ֻ�����*/
	private String e_mail;/*E-mail��ַ*/
	private String tb_time;/*���ʱ��*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getGlbm() {
		return glbm;
	}
	public void setGlbm(String glbm) {
		this.glbm=glbm;
	}
	public String getTbr() {
		return tbr;
	}
	public void setTbr(String tbr) {
		this.tbr=tbr;
	}
	public String getSzbm() {
		return szbm;
	}
	public void setSzbm(String szbm) {
		this.szbm=szbm;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh=lxdh;
	}
	public String getSjhm() {
		return sjhm;
	}
	public void setSjhm(String sjhm) {
		this.sjhm=sjhm;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail=e_mail;
	}
	public String getTb_time() {
		return tb_time;
	}
	public void setTb_time(String tb_time) {
		this.tb_time=tb_time;
	}
	public Fm() {}	
	public Fm(int id,String glbm,String tbr,String szbm, String lxdh,String sjhm,String e_mail,String tb_time,String username) {
		this.id = id;
		this.glbm=glbm;
		this.tbr=tbr;
		this.szbm=szbm;
		this.lxdh=lxdh;
		this.sjhm=sjhm;
		this.e_mail=e_mail;
		this.tb_time=tb_time;
		this.username=username;
	}
	public Fm(String glbm,String tbr,String szbm, String lxdh,String sjhm,String e_mail,String tb_time,String username) {
		this.glbm=glbm;
		this.tbr=tbr;
		this.szbm=szbm;
		this.lxdh=lxdh;
		this.sjhm=sjhm;
		this.e_mail=e_mail;
		this.tb_time=tb_time;
		this.username=username;
	}

}

