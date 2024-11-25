package lab_13;

import java.util.ArrayList;
import java.util.List;

class NoGenericLibrary {
    private List<Book> books;
    private List<Video> videos;
    private List<Newspaper> newspapers;

    public NoGenericLibrary() {
        books = new ArrayList<>();
        videos = new ArrayList<>();
        newspapers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public void addNewspaper(Newspaper newspaper) {
        newspapers.add(newspaper);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public List<Newspaper> getNewspapers() {
        return newspapers;
    }
}


class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book: " + "title: " + title + ", author: " + author;
    }
}

class Video {
    private String title;
    private String director;

    public Video(String title, String director) {
        this.title = title;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Video: " + "title: " + title + ", director: " + director;
    }
}

class Newspaper {
    private String title;
    private String date;

    public Newspaper(String title, String date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Newspaper: " + "title: " + title + ", date: " + date;
    }
}
