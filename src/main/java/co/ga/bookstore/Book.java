package co.ga.bookstore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Book entity to represent books in our data model. A book has a title.
 * We'll be able to search for books by title in {@link BookRepository}.
 *
 * @author alex
 */
@ApiModel(value="Book")
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @ApiModelProperty(value="id")
    private Long id;
    private String title;

    public Book() {
    }

    /**
     *
     * @param title description: title
     */
    public Book(String title) {
        this.title = title;
    }

    /**
     *
     * @return returns the id of the user
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id  retrieves is for user
     *
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return returns the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title  takes the title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}