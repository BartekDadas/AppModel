package eu.tutorials.makeapp.data.model;

public class APP {
    private String title;
    private String image;
    private Integer imageInt;

    public APP(String title, String image) {
        this.title = title;
        this.image = image;
    }
    public APP(String title, int imageInt) {
        this.title = title;
        this.imageInt = imageInt;
    }

    public String getTitle() {
        return title;
    }

    public Integer getImageInt() {
        return imageInt;
    }

    public void setImageInt(Integer imageInt) {
        this.imageInt = imageInt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
