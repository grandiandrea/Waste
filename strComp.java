class strComp{
	public static void main(String[] args){
		String a = "Ciao come va?";
		String b = "Ciao come va?";
		System.out.println(a.equals(b));
		Test ax = new Test(1,3);
		Test bx = new Test(1,3);
		System.out.println(ax.equals(bx));
	}
}

class Test {
	int x;

	int j;
	public Test(int x, int j){
		this.x = x;
		this.j = j;
	}
	public boolean equals(Test altro){
		return ( (x == altro.x) && (j == altro.j) );
	}
}