
public class EmptyQueueException extends RuntimeException{
	
	public EmptyQueueException(){
		super();
	}
	
	public EmptyQueueException(String n){
		super(n);
	}
}
