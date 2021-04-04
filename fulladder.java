class fulladder{
int XOR_gate(int n1,int n2,int n3)
	{
		int a,b,c;
		a=n1; b=n2; c=n3;

		int XOR_ans;

		XOR_ans = a ^ b ^ c;
		return XOR_ans;
	}

	int carry(int n1,int n2,int n3){
		int a,b,c;
		a=n1; b=n2; c=n3;
		int carry_ans;
		carry_ans = (a&b) | (b&c) | (c&a);
		return carry_ans;	
	}
public static void main(String [] args){

	int inp1=1, inp2=0, inp3=1;
	fulladder lg = new fulladder();
	int res1=lg.XOR_gate(inp1,inp2,inp3);
	int res2=lg.carry(inp1,inp2,inp3);
	System.out.println("Output of  sum in full adder  :"+res1);
	System.out.println("Output of carry in full adder :"+res2);
}
}