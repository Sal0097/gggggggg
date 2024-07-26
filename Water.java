public class Water{
	public static void main(String[] args){
		Character ref = new Character();
		Action ref2 = new Action();
		
		System.out.println(ref.color);
		System.out.println(ref.volume);
		System.out.println(ref2.use);
		System.out.println(ref2.use2);
		
	}
}

class Character{
	String color =" colorless ";
	String volume=" 2 liters ";
}

class Action{
	String use =" Drinking ";
	String use2=" Washing ";
}
