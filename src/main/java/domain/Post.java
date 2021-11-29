package domain;

import java.util.Date;

public class Post {
    private String id;
    private boolean fixed;
    private String bandLogoUrl;
    private String groupNameUrl;
    private Date dateAndTimeOfPostingUrl;
    private Button interactionButton;
    private String text;
    private String imageUrl;
    private String videoUrl;
    private int likesCount;
    private CommentsInfo commentsInfo;
    private int sharedCount;
    private int viewsCount;


    public boolean isFixed() {
        return fixed;
    }

    public String getBandLogoUrl() {
        return bandLogoUrl;
    }

    public String getGroupNameUrl() {
        return groupNameUrl;
    }

    public Date getDateAndTimeOfPostingUrl() {
        return dateAndTimeOfPostingUrl;
    }

    public Button getInteractionButton() {
        return interactionButton;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public int getSharedCount() {
        return sharedCount;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setInteractionButton(Button interactionButton) {
        this.interactionButton = interactionButton;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public void setSharedCount(int sharedCount) {
        this.sharedCount = sharedCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }
}

