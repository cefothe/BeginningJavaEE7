import com.cefothe.book.Book;
import com.cefothe.service.BookService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * Created by cefothe on 28.08.16.
 */
public class Main {

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        BookService bookService = container.instance().select(BookService.class).get();
        Book book = bookService.createBook("Test",12.0f,"Test book" );
        System.out.println(book);

        weld.shutdown();
    }
}
