package DTN2508.com.vti.baiTapBuoi5.exercise1;

public class News implements INews {
    private int newsID;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;
    private int[] rates = new int[3];

    public int getNewsID(){
        return newsID;
    }

    public void setNewsID(int newsID){
        this.newsID = newsID;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getPublishDate(){
        return publishDate;
    }

    public void setPublishDate(String publishDate){
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }

    public float getAverageRate(){
        return averageRate;
    }

    public void setRate(int index, int value) {
        if (index >= 0 && index < 3) {
            rates[index] = value;
        }
    }

    @Override
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Publish Date: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average Rate: " + averageRate);
    }

    @Override
    public float calculate() {
        int sum = 0;
        for (int rate : rates) {
            sum += rate;
        }
        averageRate = sum / 3.0f;
        return averageRate;
    }


}











