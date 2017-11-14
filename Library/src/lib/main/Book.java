package lib.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_DETAILS")
public class Book {

	public Book(long isbnNo, String authorName, int bookId, String publication, int edition) {
		super();
		this.isbnNo = isbnNo;
		this.authorName = authorName;
		this.bookId = bookId;
		this.publication = publication;
		this.edition = edition;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "ISBN_NUMBER", nullable = false)
	private long isbnNo;
	@Column(name = "AUTHOR_NAME")
	private String authorName;
	@Column(name = "BOOK_ID")
	private int bookId;
	@Column(name = "PUBLICATION")
	private String publication;
	@Column(name = "EDITION")
	private int edition;

	public long getIsbnNo() {
		return isbnNo;
	}

	public void setIsbnNo(long isbnNo) {
		this.isbnNo = isbnNo;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

}
