package DTN2508.com.vti.entity;

import java.util.Date;

public class Question {
    private static int counter = 0;
    private int questionID;
    private String content;
    private CategoryQuestion category;
    private TypeQuestion type;
    private Accounts creator;
    private Date createDate;
    public Question() {
        this.questionID = ++counter;
    }
    public int getQuestionID() {
        return questionID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public TypeQuestion getType() {
        return type;
    }

    public void setType(TypeQuestion type) {
        this.type = type;
    }

    public Accounts getCreator() {
        return creator;
    }

    public void setCreator(Accounts creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
