
package DTN2508.com.vti.entity;

import java.util.Date;

public class Exam {
    private static int counter = 0;
    private int examID;
    private String code;
    private CategoryQuestion categoryID;
    private int duration;
    private Accounts creatorID;
    private String title;
    private Date createDate;
    public Exam(){
        this.examID = ++counter;
    }
    public int getExamID() {
        return examID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CategoryQuestion getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(CategoryQuestion categoryID) {
        this.categoryID = categoryID;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Accounts getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(Accounts creatorID) {
        this.creatorID = creatorID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
