package inheritance;

public class main {

	public static void main(String[] args) {
		
		instructor instructor1=new instructor();
		student student1=new student();
		 String instructorName="engin";
		 String kurs="java";
		  usermanager usermanager1=new usermanager();
		  studentmanager studentmanager1=new studentmanager();
		  instructormanager instructormanager1=new instructormanager();
		  usermanager1.kayıt("hosgeldiniz");
		  usermanager1.kayıt(kurs+" kursuna baslayınız");
		  usermanager1.kayıt("egitmeniniz "+ instructorName);
		usermanager[]dizi=new usermanager[] {new studentmanager(),new instructormanager()};
	
		for(usermanager elemanlar:dizi) {
			String msj;
			System.out.println(elemanlar);
			

			
			
			
		}

	}

}
