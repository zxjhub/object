package common;

public class Pay2 {

		private int id;
		private String gjcz;/*国家财政*/
		private String sjcz;/*省级财政*/
		private String sjcz1;/*市级财政*/
		private String xjcz;/*县级财政*/
		private String xj1;/*小计*/
		private String rygz;/*人员工资*/
		private String bgfy;/*办公费用*/
		private String ss;/*设施*/
		private String yqsb;/*仪器设备*/
		private String zzyfxm;/*自主研发项目*/
		private String hzyfxm;/*合作研发项目*/
		private String qt;/*其他*/
		private String xj2;/*小计*/
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getGjcz() {
			return gjcz;
		}
		public void setGjcz(String gjcz) {
			this.gjcz=gjcz;
		}
		public String getSjcz() {
			return sjcz;
		}
		public void setSjcz(String sjcz) {
			this.sjcz=sjcz;
		}
		public String getSjcz1() {
			return sjcz1;
		}
		public void setSjcz1(String sjcz1) {
			this.sjcz1=sjcz1;
		}
		public String getXjcz() {
			return xjcz;
		}
		public void setXjcz(String xjcz) {
			this.xjcz=xjcz;
		}
		public String getXj1() {
			return xj1;
		}
		public void setXj1(String xj1) {
			this.xj1=xj1;
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
		public String getZzyfxm() {
			return zzyfxm;
		}
		public void setZzyfxm(String zzyfxm) {
			this.zzyfxm=zzyfxm;
		}
		public String getYqsb() {
			return yqsb;
		}
		public void setYqsb(String yqsb) {
			this.yqsb=yqsb;
		}
		public String getHzyfxm() {
			return hzyfxm;
		}
		public void setHzyfxm(String hzyfxm) {
			this.hzyfxm=hzyfxm;
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
		public String getXj2() {
			return xj2;
		}
		public void setXj2(String xj2) {
			this.xj2=xj2;
		}
		public Pay2() {}	
		public Pay2(int id,String gjcz, String sjcz,String sjcz1,String xjcz,String xj1,String rygz,String bgfy,String ss,String yqsb,String zzyfxm,String hzyfxm,String qt,String xj2) {
			this.id = id;
			this.gjcz= gjcz;
			this.sjcz=sjcz;
			this.sjcz1=sjcz1;
			this.xjcz=xjcz;
			this.xj1=xj1;
			this.rygz=rygz;
			this.bgfy=bgfy;
			this.ss=ss;
			this.yqsb=yqsb;
			this.zzyfxm=zzyfxm;
			this.hzyfxm=hzyfxm;
			this.qt=qt;
			this.xj2=xj2;
		}
		public Pay2(String gjcz, String sjcz,String sjcz1,String xjcz,String xj1,String rygz,String bgfy,String ss,String yqsb,String zzyfxm,String hzyfxm,String qt,String xj2) {
			this.gjcz= gjcz;
			this.sjcz=sjcz;
			this.sjcz1=sjcz1;
			this.xjcz=xjcz;
			this.xj1=xj1;
			this.rygz=rygz;
			this.bgfy=bgfy;
			this.ss=ss;
			this.yqsb=yqsb;
			this.zzyfxm=zzyfxm;
			this.hzyfxm=hzyfxm;
			this.qt=qt;
			this.xj2=xj2;
		}

	}



