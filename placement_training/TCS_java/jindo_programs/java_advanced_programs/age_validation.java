public class age_validation {
static void mark(int a){
    if(a<=23 ||a>=27){
        throw new ArithmeticException
            ("the Age is not valid");
        
    }
    System.out.println("age is valid");
    
}

	public static void main(String[] args) {
	    int a=25;
		try{
		    mark(a);
		}
		catch(Exception e){
		    System.out.println(e.getMessage());
		}
		finally{
		    System.out.println("Executed");
		}
	}
}