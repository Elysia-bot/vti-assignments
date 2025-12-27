package DTN2508.com.vti.entity;

public class CategoryQuestion {
    private static int counter = 0;
    private int categoryID;
    private String categoryName;
    public CategoryQuestion(){
        this.categoryID = ++counter;
    }
    public int getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
