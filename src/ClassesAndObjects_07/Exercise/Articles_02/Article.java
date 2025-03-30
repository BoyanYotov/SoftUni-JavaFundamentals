package ClassesAndObjects_07.Exercise.Articles_02;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(title + " - ").append(content + ": ").append(author);
//        return sb.toString();
//    }
}
