package ru.netology.manager;
import ru.netology.domain.Film;


public class PosterManager {
    private Film[] poster = new Film[0];
    private int filmQuantity = 10;

    public PosterManager() {

    }
//реализация методов:
    public PosterManager(int filmQuantity){

        this.filmQuantity = filmQuantity;
    }

    //добавить новый фильм
    public void add(Film newFilm){
        int length = poster.length + 1;
        Film[] newPoster = new Film[length];
        for (int i = 0; i < poster.length; i++){
            newPoster[i] = poster[i];
        }
        newPoster[newPoster.length - 1] = newFilm;
        poster = newPoster;
    }
//получить последний фильм
    public Film[] getLast(){
        int quantity = Math.min(filmQuantity, poster.length);
        Film[] result = new Film[quantity];
        for (int i = 0; i < quantity; i++){
            int index = poster.length - 1 -i;
            result[i] = poster[index];
        }
        return result;
    }
}


