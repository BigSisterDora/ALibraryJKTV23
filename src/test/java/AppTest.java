public class AppTest {
    Input inputMock;
    BookRepository bookRepositoryMock;
    PrintStream defaultOut;
    ByteArrayOutputStream mockOut;
    @BeforeEach
    void setUp() {
        inputMock = Mockito.mock(ConsoleInput.class);
        bookRepositoryMock = Mockito.mock(StorageBook.class);
        defaultOut = System.out;
        mockOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(mockOut));
    }

    @AfterEach
    void tearDown() {
        System.setOut(defaultOut);
    }

    @Test
    void runExit() {
        when(inputMock.nextLine()).thenReturn("0");
        App app = new App(inputMock,bookRepositoryMock);
        app.run();
        String expected = "До свидания!";
        String actual = mockOut.toString();
//        System.setOut(defaultOut);
//        System.out.println(actual);
        assertTrue(actual.contains(expected));
    }
    void runAddBook(){

        assertTrue(actual.contains(expected));
    }
}
