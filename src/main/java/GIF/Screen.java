package GIF;

public class Screen {
    private String title;
    private String imageUrl;
    private int type;

    public Screen(String title, String imageUrl, int type) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
