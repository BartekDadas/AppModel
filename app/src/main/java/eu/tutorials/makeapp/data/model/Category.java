package eu.tutorials.makeapp.data.model;

public class Category {
    String categoryName;
    int imageCategory;

    public Category(String categoryName, int imageCategory) {
        this.categoryName = categoryName;
        this.imageCategory = imageCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getImageCategory() {
        return imageCategory;
    }

    public void setImageCategory(int imageCategory) {
        this.imageCategory = imageCategory;
    }
}
