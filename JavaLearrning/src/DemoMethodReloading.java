// Demo of Method Reloading
public class Demo {
	public int add(int n, int m) {
		int result = n + m;
		return result;
	}	
	public int add(int n, int m,int o) {
		int result = n + m +o;
		return result;
	}	
	public int add(int n, int m,int o, int p) {
		int result = n + m +o +p;
		return result;
		
	}
	public static void main(String[] args) {
		Demo obj= new Demo();
		int n1=4;
		int n2=2;
		int n3=1;
		int n4=2;
		int result=obj.add(n1, n2,n3,n4);
		System.out.println(result);
		
		

	}

}
