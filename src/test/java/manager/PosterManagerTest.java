package manager;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;
import org.junit.jupiter.api.BeforeEach;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest{
    private PosterManager manager = new PosterManager();
    private Film one = new Film(1, "one", "Comedy", "www.oneFilm.com");
    private Film two = new Film(2, "two", "Detective", "www.twoFilm.com");
    private Film three = new Film(3, "three", "Drama", "www.threeFilm.com");
    private Film four = new Film(4, "four", "Horrors", "www.fourFilm.com");
    private Film five = new Film(5, "five", "Anime", "www.fiveFilm.com");
    private Film six = new Film(6, "two", "Biography", "www.sixFilm.com");
    private Film seven = new Film(7, "three", "Military", "www.sevenFilm.com");
    private Film eight = new Film(8, "four", "Story", "www.eightFilm.com");
    private Film nine = new Film(9, "one", "Music", "www.nineFilm.com");
    private Film ten = new Film(10, "two", "Thriller", "www.tenFilm.com");
    private Film eleven = new Film(11, "three", "Fantasy", "www.elevenFilm.com");

    @BeforeEach
    public void setUp() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
    }

    @Test
    void getLastWithQuantityMoreThanInList() { //пол-ть последн. с кол-вом БОЛЬШЕ, чем в списке
        Film[] actual = manager.getLast();
        Film[] expected = new Film[]{nine,eight,seven,six,five,four,three,two,one};
        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastWithQuantityLessThanInList() { //пол-ть последн. с кол-вом МЕНЬШЕ, чем в списке
        manager.add(ten);
        manager.add(eleven);
        Film[] actual = manager.getLast();
        Film[] expected = new Film[]{eleven, ten, nine, eight, seven, six, five, four, three, two};
        assertArrayEquals(expected, actual);
    }
}

