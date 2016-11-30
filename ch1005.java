import java.util.Scanner;

public class ch1005{

	public static void main( String[] args ){
		StackOfIntegers stack = new StackOfIntegers() ;
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter an integer: ") ;
		int input = in.nextInt() ;
		int ss = 2 ;
		while( ss <= input ){
			if( input % ss != 0 ){
				++ss ;
				continue ;
			}
			while( input%ss == 0 ){
				stack.push(ss) ;
				input /= ss ;
			}
		}
		while( !stack.isEmpty() ){
			System.out.print(stack.pop()+" ") ;
		}
		System.out.println() ;
	}

}

class StackOfIntegers{
	private int[] array ;
	private int size ;

	StackOfIntegers(){
		this.array = new int[32] ;
		this.size = 0 ;
	}

	StackOfIntegers( int size ){
		this.array = new int[size] ;
		this.size = 0 ;
	}

	void push( int elem ){

		if( this.size >= array.length ){
			int[] tmp = new int[array.length*2] ;
			System.arraycopy(array,0,tmp,0,array.length) ;
			array = tmp ;
		}

		array[size++] = elem ;
	}

	int pop(){
		return array[--size] ;
	}

	int peek(){
		return array[size-1] ;
	}

	int getSize(){
		return size ;
	}

	boolean isEmpty(){
		return size==0 ;
	}

}