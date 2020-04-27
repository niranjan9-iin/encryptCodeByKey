package encrypt_by_key_progra;

public class Tester {

	public static void main(String[] args) {
		
		String sentence="journey";
		String key="team";
		char[] s=sentence.toCharArray();
		char[] k=key.toCharArray();
		
		int[] arr=new int[s.length];
		char[] sol=new char[s.length];
		
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=(int)k[i%k.length]-97;
		
		}
		
		for(int i=0;i<s.length;i++)
		{
			int t=arr[i]+(int)s[i]-97;
			if(t>25)
			{
				t=t-26;
			}
			sol[i]=(char)(t+97);
			
		}
		
		sol.toString();
		System.out.println(sol);
	
	}

}
