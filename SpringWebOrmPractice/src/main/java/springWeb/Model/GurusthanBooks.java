package springWeb.Model;

import javax.persistence.*;

@Entity 
public class GurusthanBooks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sno;
	private String bookName;
	private String author;
	private double rating;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "GurusthanBooks [bookName=" + bookName + ", author=" + author + ", rating=" + rating + "]";
	}

}
