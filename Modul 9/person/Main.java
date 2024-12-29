package person;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Astriani";
		System.out.println("Nama : " + person1.name);
		
		System.out.println("[Mengubah nama menggunakan setName]");
		person1.setName("Astriani Komeri");
		System.out.println("Nama Lengkap : " + person1.name);

	}

}
