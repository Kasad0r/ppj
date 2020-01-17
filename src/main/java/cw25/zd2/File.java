package cw25.zd2;

public class File {
    private String name;
    private int pages;
    private String text;

    public void show() {
        System.out.println("Czy masz dostep?");
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
