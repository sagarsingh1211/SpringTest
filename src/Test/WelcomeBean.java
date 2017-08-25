package Test;

public class WelcomeBean {
	 
	   private String message;
	   private String name;
	   public WelcomeBean(String name){
		   this.name = name;
	   }

	   public void setMessage(String message)
	   {
		   this.message = message;
	   }

	   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void show()
	   {
		   System.out.println(name+ " - "+message);
		   
	   }

	}
