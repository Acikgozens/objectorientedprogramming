package exam.finalExam.ch8;

class One{
	public One(int x){
		System.out.print("int constructor");
	}
	public One(char c){
		System.out.print("char constructor");
	}
	public One(String str){
		System.out.print("String constructor");
	}
}

public class Test{
	public static void main(String[] args){
		String ch = "c";
		One one = new One(ch);		
	}		
}

