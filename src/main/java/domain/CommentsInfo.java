package domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private boolean groupsCanPost;
    private boolean Close;
    private boolean Open;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isClose() {
        return Close;
    }

    public void setClose(boolean close) {
        this.Close = close;
    }

    public boolean isOpen() {
        return Open;
    }

    public void setOpen(boolean open) {
        this.Open = open;
    }
}
