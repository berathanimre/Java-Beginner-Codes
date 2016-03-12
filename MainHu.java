
public class MainHu {

	public static void main(String[] args) {
		String str1="berathan"; //creates a new variable that has the value berathan
		String str2="imre";	//creates a new variable that has the value imre
		if(str1.equals(str2)){ //this line checks whether str1 is equal to str2. if that statement is true, code below will be executed
			System.out.println("You cant see this line because str1 is not equals to str2!");
		}
		
		int a=10;//creates a new variable that has the value 10
		int b=100;//creates a new variable that has the value 100
		b=b-90; //this line says that b is now equal to b minus 90(so 100-90=10 then b=10)
		if(b==a){//this two equal sign ask whether b is equal to a.(one equals sign assigns a value, two equals sign checks whether it is true or not
			System.out.println("You will see this line because b is now 10");
		}
		if(100>b){
			System.out.println("You will see this line because b is now 10 and 100 is greater than b");
		}
		if(a>b){
			System.out.println("You wont see this line because b is now 10 and a is also 10. so the statement a>b is false");
		}
		if(a>=b){
			System.out.println("You will see this line because b is now 10 and a is also 10. so the statement (greater or equals to) a>=b is true.");
		}

	}

}
