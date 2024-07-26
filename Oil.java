public class Oil{
	public static void main(String[] args){
		Character1 ref = new Character1();  //className from which you want to create object, objectName,new =keyword used to create object, className(arguments)
		Action1 ref2 = new Action1();
		
		System.out.println(ref.color);
		System.out.println(ref.weight+" kg");
		System.out.println(ref2.use);
		System.out.println(ref2.use2);
		
	}
}

class Character1{  // as many classes can be called in single java file but only one public class allowed in one file.
	String color =" orange ";
	double weight =20;
}

class Action1{
	String use =" Cook ";
	String use2=" Eat ";
}
