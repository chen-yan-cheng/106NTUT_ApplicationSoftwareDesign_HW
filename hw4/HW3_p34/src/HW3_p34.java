import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW3_p34 
{
	public static void main (String[] args)throws IOException
	{
		System.out.println("�п�J�@�Ӿ��");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str =br.readLine();
		
		int num =Integer.parseInt(str);
		System.out.println("�A��J����ƬO"+num);
		
	}

}