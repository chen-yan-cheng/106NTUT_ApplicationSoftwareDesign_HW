public class HW5_p55
{
	public static void main (String[] args)
	{
		Company cmp = new Company();
		
		Driver drv1=new Driver(cmp);
		drv1.start();
		
		Driver drv2=new Driver(cmp);
		drv2.start();
		

	}
}

class Company
{
	private int sum =0;

	public synchronized void add (int a)
	{
		int temp=sum;
		System.out.println("�ثe�X�p�����B�O"+temp+"��");
		System.out.println("�Ȩ�"+a+"��");
		temp=temp+a;
		System.out.println("�X�p�����B�O"+temp+"��");
		sum= temp;
	}
}
class Driver extends Thread
{
	private Company comp;
	public Driver(Company c)
	{
		comp = c;
	}
	public void run()
	{
		for (int i=0;i<3;i++)
		{
			comp.add(50);
		}
	}
}