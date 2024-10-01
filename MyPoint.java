package mypoint;



public class Mypoint {

	int x,y;

	

	Mypoint();

	{

		x=0;

		y=0;

	}

	

	Mypoint(int x1,int y1)

	{

		x=x1;

		y=y1;

	}

	

	public void setXY(int n,int m)

	{

		x=n;

		y=m;

	

	}

	

	public int[] getXY() {

		int xy[] =new int[2];

		xy[0]=x;

		xy[1]=y;

		return xy;

	}

	

	public String tostring()

	{

		String s = "("+x+" ,"+y+")";

			return s;

	}

	

	double distance(Mypoint another)

	{

		return Math.sqrt((another.x-x)*(another .x-x)+(another.y-y));

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Mypoint p =new Mypoint(1,5); 

		System.out.println(p.x);

		System.out.println(p.y);

		

	}	

	}