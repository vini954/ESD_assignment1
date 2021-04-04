//HALF ADDER
class halfadder{
int XOR_gate(int n1,int n2)
	{
		int a,b;
		a=n1;
		b=n2;

		int XOR_ans;
		
		XOR_ans = a ^ b;
		return XOR_ans;
	}

	int AND_gate(int n1,int n2){
		int a,b;
		a=n1;
		b=n2;

		int AND_ans;

		if(n1 == 1 && n2 == 1)
			AND_ans = 1;
		else
			AND_ans = 0;
	
		return AND_ans;	
	}
public static void main(String [] args){

	int inp1=0;
	int inp2=0;
	halfadder lg = new halfadder();
	int res1=lg.XOR_gate(inp1,inp2);
	int res2=lg.AND_gate(inp1,inp2);
	System.out.println("the output of  sum in half adder  :"+res1);
	System.out.println("the output of carry in half adder :"+res2);
}
}