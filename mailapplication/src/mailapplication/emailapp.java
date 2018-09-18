package mailapplication;

public class emailapp {

	public static void main(String[] args) {
		
		Email em1 = new Email("bora" , "özkan");
		//em1.setAlternateEmail("js@gmail.com");
		//System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
	}

}
