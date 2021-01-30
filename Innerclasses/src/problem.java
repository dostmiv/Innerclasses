public class problem{
	
	
	public static class Matematik{
		public static void dairealan(int yaricap) {
			System.out.println("dairenin alani : " + Math.PI*yaricap*yaricap);
		}
		public static void ucgencevresi(int kenar1, int kenar2,int kenar3)
		{
			System.out.println("ucgen cevresi = " + (kenar1+kenar2+kenar3));
		}
	}
	
	
	public static class Fizik{
		
		public static void icCarpim(vec vec1,vec vec2) {
			int iccarpim = vec1.getI()*vec2.getI()*vec1.getJ()*
					vec2.getJ()*vec1.getK()*vec2.getK();
			System.out.println(iccarpim);
		}
		
	}
}