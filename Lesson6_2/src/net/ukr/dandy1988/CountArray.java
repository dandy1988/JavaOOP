package net.ukr.dandy1988;

public class CountArray implements Runnable{

	private int a, b;

	private int [] d;
	
	private int result;
	
	public CountArray() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CountArray(int a, int b, int[] d) {
		this.a = a;
		this.b = b;
		this.d = d;
	}

	
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	@Override
	public void run() {
		int sum = 0;
		if ((a<b)&&(b<=d.length)) {
			for (int i = a; i < b; i++) {
			sum = sum + d[i];
			}
		}
		this.result = sum;
	}
	
	
}
