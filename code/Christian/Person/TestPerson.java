public class TestPerson{
	public static void main(String[]args){
		String vorname;
		String name;
		Person piffi;
		
		piffi = new Person();
		piffi.setName("Piffi Hinten");
		piffi.setVorname("Piffus");
		
		name = piffi.getName();
		vorname = piffi.getVorname();
		System.out.println("Vorname: " + vorname);
		System.out.println("Name: " + name);
	}
}