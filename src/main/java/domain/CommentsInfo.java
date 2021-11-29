package domain;

public class CommentsInfo {
    private int count;
    private boolean Post;
    private String author;
    private String dateAndTime;
    private String textOfComment;
    private String image;
    private int likesCount;

    public int getCount() {
        return count;
    }

    public boolean isCanPost() {
        return Post;
    }

    public String getAuthor() {
        return author;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getTextOfComment() {
        return textOfComment;
    }

    public String getImage() {
        return image;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanPost(boolean canPost) {
        this.Post = canPost;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setTextOfComment(String textOfComment) {
        this.textOfComment = textOfComment;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }
}
