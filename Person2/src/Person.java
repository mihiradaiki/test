/**
 *
 */

/**
 * @author testuser
 *
 */
public class Person {
 public Person(){}

 public Person(String name,int age){
		this.name=name;
		this.age=age;
	}

public Person(String name){
	this.name=name;
	this.age=0;
}
public Person(int age){
	this.name="–¼‘O‚È‚µ";
	this.age=age;

}
public Person(int age,String name){
	this.name=name;
	this.age=age;
}
	
	public String getName(){
		return this.name;
		
	}
	public void setName(String name){
		this.name=name;
	
}

	/**
	 * @param args
	 */

	private String name=null;
	private int age=0;

	public void talk(){
		System.out.println(this.name+"‚ª˜b‚·");
	}
		public void walk(){
			System.out.println(this.name+"‚ª•à‚­");
		}
			public void run(){
				System.out.println(this.name+"‚ª‘–‚é");
				
				


	}

}