package JavaProgm;

public class CustomExceptionExample extends Exception
{
private static int accno[]= {1001,1002,1004,1005,1007};
private static String name[]= {"Ram","Lakshman","John","Buddha"};
private static double balanc[]= {10000,20000,999,65000,55000};
    public CustomExceptionExample() {}
    public CustomExceptionExample(String str) {
    	super(str);
    }
    
	public static void main(String[] args) {
		
         try {
        	 System.out.println("ACCNO\tNAME\tBALANCE");
        	 for(int i=0;i<5;i++) {
        		 System.out.println(accno[i]+"\t"+name[i]+"\t"+balanc[i]);
        		 if (balanc[i]<1000) {
        			 CustomExceptionExample me=new CustomExceptionExample("balance is less than 1000");
        			  throw me;// we are creating object me so use throw
        			  
        		 }}}
        	 catch(CustomExceptionExample me) {
        		 me.printStackTrace();//for specific
        	 }
        	 
         
	}

}
