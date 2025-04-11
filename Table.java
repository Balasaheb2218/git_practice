// print table of a number 

public class Table {
	public static void main(String[] args){
		int num = 7;
		System.out.println("table of " + num );
		for(int i=1;i<=10;i++){
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}

}