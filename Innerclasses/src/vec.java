public class vec {
	private String isim;
	private int i;
	private int j;
	private int k;
	public class mov {
		private String name = "doritos";
		public void callmyname() {
			System.out.println("hello "+ name);
		}
		mov(String name){
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
	}
	public vec(String isim,int i,int j,int k) {
		this.isim = isim;
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	
}