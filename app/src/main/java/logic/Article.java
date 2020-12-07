package logic;

import java.util.ArrayList;

public class Article implements Bookmark {

    private int id;
    private String title, hyperlink;
    private ArrayList<String> tags = new ArrayList<>(); // TODO: alusta tietokannasta

    public Article() {

    }

    public Article(int id, String title, String hyperlink, ArrayList<String> tags) {
        this.id = id;
        this.title = title;
        this.hyperlink = hyperlink;
        this.tags = tags;
    }

    public Article(String title, String hyperlink, ArrayList<String> tags) {

        this.title = title;
        this.hyperlink = hyperlink;
        this.tags = tags;
    }

    public Article(String title, String hyperlink) {

        this.title = title;
        this.hyperlink = hyperlink;

    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    @Override
    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Article article = (Article) o;
        return hyperlink.equals(article.hyperlink)
                && title.equals(article.title);
    }

    @Override
    public String toString() {
        return this.title + " linkki: " + this.hyperlink;

    }

}
