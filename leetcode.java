class Solution {
    public int scoreOfString(String s) {


int ans=0;
		for(int i=0;i<s.length()-1;i++)
		{
		    int a=i;
		    int b=i+1;
		   
		    char first=s.charAt(a);
		    char second=s.charAt(b);
		    
		    int aascii=first;
		    int bascii=second;
		    
		    int temp=Math.abs(aascii-bascii);
		    
		    System.out.println(temp);
		    
		    ans=ans+temp;
		    //System.out.println(first+"  "+second);
		}
		
		//System.out.println("some of above asci values is"+ans);
		
		
        

        return ans;

        
    }
}