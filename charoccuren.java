/*java program to check whether there is any occurance of characters in a n-digit input number.*/ 
// input through command line arg 
public class charoccuren {
 	public static void main(String args[]){ 
 	 	int i;  	 	char ch; 
 	 	int flag = 1; 
 	 	String str1 = args[0]; 
 	 	for(i = 0; i < str1.length() ; i++){ 
 	 	 	ch = args[0].charAt(i);  	 	 	
//System.out.println(ch);  	 	 
	if((ch < '0') || (ch > '9')){ 
 	 	
		flag = 0;  	 	 
	 	break; 
 	 	 	} 
 	 	} 
 	 	 
 	 	if(flag == 1){ 
 	 System.out.println("No character present"); 
 	 	} 
 	 	else{ 
 	 System.out.println("character present"); 
 	 	} 
 
}
}
