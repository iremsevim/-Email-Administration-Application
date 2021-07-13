package EmailApp;


public class EmailApp 
{
   public static void main(String[] arg)
   {
	Email mEmail=new Email("İrem", "Sevim");
	mEmail.setAlternateEmail("iremsevim2442@outlook.com");
	System.out.println(mEmail.GetAlternateEmail());
}
}
