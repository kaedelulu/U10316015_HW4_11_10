//Implementing a stack using inheritance
class MyStack extends java.util.ArrayList<Object> {
	public boolean isEmpty() {
		return super.isEmpty(); //回傳型態:boolean
	}
	
	public int getSize() {
		return size();  //回傳型態:int
	}
	
	//會回傳最上層最後的元素
	public Object peek() {
		return get( getSize() - 1 );  //回傳型態:Object
	}
	
	//會回傳最上層最後的元素並從ArrayList中刪除
	public Object pop() {
		Object o = get( getSize() - 1 );
		remove(getSize() - 1);
		return o;  //回傳型態:Object
	}
	
	public Object push( Object o ) {
		add(o);
		return o;  //回傳型態:Object
	}
	
	public int search( Object o ) {
		return indexOf(o);  //回傳型態:int
	}
	
	public String toString() {
		return "stack: " + toString();  //回傳型態:String
	}
}
