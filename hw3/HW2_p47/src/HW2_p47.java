import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class HW2_p47 
{
	public static void main (String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�п�J5�H������");
		Integer test[]=new Integer [5];
		
		for(int i=0;i<test.length;i++)
		{
			String str =br.readLine();
			test[i]=Integer.parseInt(str);
		}
		
		Arrays.sort(test, Collections.reverseOrder());
		
		for(int i=0;i<5;i++)
		{
			System.out.println("��"+(i+1)+"�ӤH�����ƬO"+test[i]+"��");
		}
	}
}