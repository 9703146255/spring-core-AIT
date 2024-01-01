package in.ashokit.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import in.ashokit.dao.BookDao;
import in.ashokit.model.Book;

public class BookDaoImpl implements BookDao {

	private final JdbcTemplate jdbcTemplate;
	// Constructor injection here
	public BookDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertBook(Book book) {
		String sql = "INSERT INTO books (title, author) VALUES (?, ?)";

		jdbcTemplate.update(sql, book.getTitle(), book.getAuthor());
	}

}