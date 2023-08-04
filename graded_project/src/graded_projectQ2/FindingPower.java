package graded_projectQ2;


public class FindingPower {
public int power(int num,int pow) {
	
	if(pow==0)
	{
		return 1;
	}
		else 
		
			return power (num, pow-1)* num;
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num = 2;
		int pow = 5;
FindingPower a=new FindingPower();
System.out.println(a.power(num, pow));

	}
	
	}

