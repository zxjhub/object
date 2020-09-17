package common;

public class Pay3 {

	private int id;
	private String rygz;/*人员工资*/
	private String bgfy;/*办公费用*/
	private String ss;/*设施*/
	private String yqsb;/*仪器设备*/
	private String kyxmjf;/*科研项目经费*/
	private String qt;/*其他*/
	private String xj3;/*小计*/
	private String lhyf;/*联合研发*/
	private String jszr;/*技术转让*/
	private String jszxfw;/*技术咨询服务*/
	private String xj4;/*小计*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getRygz() {
		return rygz;
	}
	public void setRygz(String rygz) {
		this.rygz=rygz;
	}
	public String getBgfy() {
		return bgfy;
	}
	public void setBgfy(String bgfy) {
		this.bgfy=bgfy;
	}
	public String getYqsb() {
		return yqsb;
	}
	public void setYqsb(String yqsb) {
		this.yqsb=yqsb;
	}
	public String getKyxmjf() {
		return kyxmjf;
	}
	public void setKyxmjf(String kyxmjf) {
		this.kyxmjf=kyxmjf;
	}
	public String getSs() {
		return ss;
	}
	public void setSs(String ss) {
		this.ss=ss;
	}
	public String getQt() {
		return qt;
	}
	public void setQt(String qt) {
		this.qt=qt;
	}
	public String getXj3() {
		return xj3;
	}
	public void setXj3(String xj3) {
		this.xj3=xj3;
	}
	public String getLhyf() {
		return lhyf;
	}
	public void setLhyf(String lhyf) {
		this.lhyf=lhyf;
	}
	public String getJszr() {
		return jszr;
	}
	public void setJszr(String jszr) {
		this.jszr=jszr;
	}
	public String getJszxfw() {
		return jszxfw;
	}
	public void setJszxfw(String jszxfw) {
		this.jszxfw=jszxfw;
	}
	public String getXj4() {
		return xj4;
	}
	public void setXj4(String xj4) {
		this.xj4=xj4;
	}
	public Pay3() {}
	public Pay3(int id,String rygz,String bgfy,String ss,String yqsb,String kyxmjf,String qt,String xj3,String lhyf,String jszr,String jszxfw,String xj4) {
		this.id = id;
		this.rygz=rygz;
		this.bgfy=bgfy;
		this.ss=ss;
		this.yqsb=yqsb;
		this.kyxmjf=kyxmjf;
		this.qt=qt;
		this.xj3=xj3;
		this.lhyf=lhyf;
		this.jszr=jszr;
		this.jszxfw=jszxfw;
		this.xj4=xj4;
	}
	public Pay3(String rygz,String bgfy,String ss,String yqsb,String kyxmjf,String qt,String xj3,String lhyf,String jszr,String jszxfw,String xj4) {
		this.rygz=rygz;
		this.bgfy=bgfy;
		this.ss=ss;
		this.yqsb=yqsb;
		this.kyxmjf=kyxmjf;
		this.qt=qt;
		this.xj3=xj3;
		this.lhyf=lhyf;
		this.jszr=jszr;
		this.jszxfw=jszxfw;
		this.xj4=xj4;
	}
}
