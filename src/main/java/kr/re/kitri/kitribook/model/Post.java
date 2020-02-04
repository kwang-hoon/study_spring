package kr.re.kitri.kitribook.model;


// author, title, content, likes

public class Post {
    private String author;
    private String title;
    private String content;
    private long likes;

    public Post() {}

    public Post(String author, String title, String content, long likes) {
        this.author = author;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                '}';
    }
}
