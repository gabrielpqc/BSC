public class ElementoTabela<T>
	{
		public T elemento;
		public boolean activo;
		public ElementoTabela( T e )
		{ 
			this( e, true ); 
		}
		public ElementoTabela( T e, boolean i )
		{ 
			elemento = e; 
			activo = i; 
		}
		public String toString(){
			return (String) elemento;
		}
	}