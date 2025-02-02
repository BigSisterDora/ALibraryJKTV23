package org.example.helpers;

import org.example.model.Author;
import org.example.tools.Input;

import java.util.ArrayList;

public class AppHelperAuthor {
    Input inputMock;
    Author authorMock;
    @BeforeEach
    void setUp(){
        inputMock = Mockito.mock(Input.class);
        authorMock = Mockito.mock(Author.class);
    }

    @AfterEach
    void tearDown(){
    }

    @Test
    void create(){
        when(inputMock.nextLine()).thenReturn("Lev", "Tolstoy");
        Author expected = new Author("Lev", "Tolstoy");
        List authors = new ArrayList<>();
        authors.add(expected);
        when(authorMock).thenReturn(expected);
        AppHelperAuthor appHelperAuthor = new AppHelperAuthor(inputMock, authors);
        Author actual = appHelperAuthor.create();
        assertTrue(actual.getFirstname(), expected.getFirstname());
        assertTrue(actual.getLastname(), expected.getLastname());
    }

    void printList(){

    }
}
