public class CategoryQuestion {
    static int counter = 0;
    int categoryID;
    String categoryName;
    public CategoryQuestion(){
        this.categoryID = ++counter;
    }
}
