package Statickeyword;

public class library {

		//public static void main(String[] args) {
			// TODO Auto-generated method stubString browser="firefox";
			static String browser="chrome";
		  String url="url";
			String user="username";
			String pw="passwords";
			void login() {
				System.out.println(user);
				System.out.println(pw);
			}
			 void getBrowserandUrl() {
				System.out.println(browser);
				System.out.println(url);
			}
			void initializeMethod(String browser1, String url1, String user1, String pw1 ) {
				browser=browser1;
				url=url1;
				user=user1;
				pw=pw1;
				

		}
			static void getStaticMethod() {
				System.out.println("get static methods");
			}
	
}

	


