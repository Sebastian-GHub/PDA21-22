package Blatt7;

public class Library {
	
	public static void main(String[] args) {
		Book hamster = new Book();
		hamster.setTitle("Progammieren spielend gelernt");
		hamster.setAuthor("D. Boles");
		hamster.publish("3-190-2297-4", 39.90);
		Book hp1 = new Book();
		hp1.setTitle("Harry Potter und der Stein der Weisen");
		hp1.setAuthor("J.K. Rowling");
		hp1.publish("978-3551551672", 22.02);
		Book hdr = new Book();
		hdr.setTitle("Der Herr der Ringe - Einbändige Ausgabe");
		hdr.setAuthor("J.R.R. Tolkien");
		hdr.publish("978-3-608-93828-9", 50.00);
	}
}
