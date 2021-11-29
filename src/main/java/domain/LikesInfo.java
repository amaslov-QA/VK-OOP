package domain;

public class LikesInfo {
    private int count;
    private boolean userLikesInfo;
    private boolean canLike;
    private boolean canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean getUserLikesInfo() {
        return userLikesInfo;
    }

    public void setUserLikesInfo(boolean userLikesInfo) {
        this.userLikesInfo = userLikesInfo;
    }

    public boolean getCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
