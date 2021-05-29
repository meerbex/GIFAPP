package GIF;

public class Screen {
    private String title;
    private String imageUrl;
    private String[] faces;


    public Screen(String title, String[] faces, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.faces = faces;
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

    public String[] getFaces() {
        return faces;
    }

    public void setFaces(String[] faces) {
        this.faces = faces;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
