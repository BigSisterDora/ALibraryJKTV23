package helpers;

import org.example.helpers.AppHelperAuthor;
import org.example.model.Author;
import org.example.tools.Input;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AppHelperBookTest {
    Input inputMock;
    Author authorMock;
    List<Author> authors;
    Author author;

    @BeforeEach
    void setUp(){
        inputMock = Mockito.mock(Input.class);
        authorMock = Mockito.mock(Author.class);
        author = new Author("Lev", "Tolstoy");
        authors = new ArrayList<>();
        author.add(author);
        AppHelperAuthor appHelperAuthor = new AppHelperAuthor(inputMock, authors);
    }

    @AfterEach
    void tearDown(){
        inputMock = null;
        authorMock = null;
        authors = null;
        author = null;
    }

    @Test
    void create(){
        when(inputMock.nextLine()).thenReturn("Lev", "Tolstoy");
        Author actual = appHelperAuthor.create();
        assertTrue(actual.getFirstname(), expected.getFirstname());
        assertTrue(actual.getLastname(), expected.getLastname());
    }

    @Test
    void printList(){
        appHelperAuthor.print
    }
}
