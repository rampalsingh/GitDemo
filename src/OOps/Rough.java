package OOps;

public class Rough {

	public static void main(String[] args) {
		point pt1 = new point();
		
		segment s1 = new segment();
		System.out.println(s1.p1);
		System.out.println(s1.p2);
		
		pt1.x=1;
		pt1.y=2;
		
		System.out.println(pt1);
		
		System.out.println(s1);
	}

}

class segment{
	point p1 =  new point();
	point p2 =  new point();
	@Override
	public String toString() {
		return "segment [p1=" + p1 + ", p2=" + p2 + "]";
	}
	
	
}

class point{

	point e1 = new point();
	point e2 = new point();
	
	
	int x;
	int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "x="+e1.x+"  y= "+e1.y +"x="+e2.x+"  y= "+e2.y;
	}
	
	
}