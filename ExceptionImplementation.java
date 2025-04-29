package JavaProgm;

public class ExceptionImplementation {

	public static void main(String[] args) {
		try
		{
			int num[]= {1,2,3,4,5,6};
			System.out.println(num[11]);
		}
		catch(Exception e)
		{System.out.println("something went wrong"+e);
	}
		finally {
			System.out.println("try catch completed");
		}

}
}
