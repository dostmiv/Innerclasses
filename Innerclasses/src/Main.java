
public class Main{
	public static void main(String [] args) {
		int yaricap = 10;
		problem.Matematik.dairealan(yaricap);
		
		int kenar1 = 4;
		int kenar2 = 3;
		int kenar3 = 7;
		problem.Matematik.ucgencevresi(kenar1, kenar2, kenar3);
		vec vec1 = new vec("vec1", 5, 3, 4);
		vec vec2 = new vec("vec2", 5, 12, 13);
		problem.Fizik.icCarpim(vec1, vec2);
		vec.mov mert = vec1.new mov("dokota");//inner class initializing
		mert.callmyname();//call inner class's method
		
	}
	
}