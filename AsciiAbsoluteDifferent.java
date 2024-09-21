

//TypeCasting
public class Main
{
	public static void main(String[] args) {
	
	int n='a';
	
	char g=97;
	
	System.out.println("int to char"+" is:  "+g);
	
	int nn='b';
	int d=nn-n;
	
	
	
	//single line output/solution
	
	System.out.println('a'*'b');
	System.out.println('a'+'b');
	System.out.println('a'%'b');
	
	System.out.println("asci value is:: "+n);
	System.out.println("asci value is:: "+nn);
	System.out.println("asci value is:: "+d);
	
//	System.out.println(g);
	
	
	
	
	
	//absolute diffrent is know as if any number are giving - value like 1-2 is -1 then absolute is make it as only positive it remove the negative and gives you positive number
	
	int temp=1-2;
	System.out.println("negative to"+" positive "+Math.abs(temp));
	if(temp<0)
	{
	    temp=temp*-1;
	}
	System.out.println("temp after value   "+temp);
	
	
	  
	}
}