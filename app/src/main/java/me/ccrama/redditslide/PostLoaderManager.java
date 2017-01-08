package me.ccrama.redditslide;

public class PostLoaderManager {
    private static PostLoader instance;

    private PostLoaderManager() {}

    public static PostLoader getInstance() {
        return instance;
    }

    public static void setInstance(PostLoader loader)
    {
        instance = loader;
    }
}