
public class QueueArray<E> implements Queue<E>{
	public static final int MAX = 100;
	E queue[];
	int ini=0;
	int fim=0;
	int tamanho = 0;
	
	public QueueArray(int t){
		queue = (E[]) new Object[t+1];
		tamanho = t;
	}
	
	public QueueArray(){
		this(MAX);
		tamanho = MAX;
	}
	
	public void enqueue(E o) throws OverflowQueueException {
		if (size() == queue.length -1)
			throw new OverflowQueueException("Está Cheio");
		queue[fim] = o;
		fim = inc(fim);
	}
	
	public E front() throws EmptyQueueException {
		return queue[ini];
	}
	
	public E dequeue() throws EmptyQueueException {
		if (empty())
			throw new EmptyQueueException("Está Vazio");
		E x = queue[ini];
		queue[ini] = null;
		ini = inc(ini);
		return x;
	}

	public int size() {
		return (queue.length-ini+fim)%queue.length;
	}
	
	public boolean empty() {
		
		return ini==fim;
	}
	
	public int inc(int i){
		return (i+1)% queue.length;
	}
	
	public String toString(){
		String s = "[";
		for(int i=ini; i!= fim; i=inc(i))
			s+= queue[i]+" ";
		return s+"]";
	}
}