package mypoint;



public class Testmypoint {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

				Mypoint p=new Mypoint(1,5);

				System.out.println(p.x);

				System.out.println(p.y);

				p.setXY(1,1);

				int[] xy=p.getXY();

				System.out.println(+xy[0]+ " " +xy[1]);

				double dist=p.distance(5,5);

				System.out.println("Distance between (1,1) and (5,5):"+dist);

				Mypoint p2=new Mypoint(1,7);

				double dist2=p.distance(p2);

				System.out.println("Dist2:"+dist2);

				

	}



}