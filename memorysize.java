//java program to find the memory size in bytes given the input as address length. 
public class memorysize {
	public static void main(String args[]) {
		int initialaddr = 26688;
		int finaladdr = 28698;
		int bytes = (finaladdr - initialaddr)/8;
		System.out.println("Memory size in bytes : "+bytes);
	
}
}