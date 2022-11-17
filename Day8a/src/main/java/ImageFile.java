package main.java;

import java.awt.image.BufferedImage;
import java.util.logging.Logger;



public class ImageFile extends GenericFile{
    private int height;
    private int width;

    public ImageFile(String name, int height, int width, byte[] bte, String version) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getFileInfo() {
        return "Image File Impl";
    }

    public static void main(String[] args) {

        GenericFile genericFile=new ImageFile("testImage", 100, 200,
                new BufferedImage(100, 200, BufferedImage.TYPE_INT_RGB)
                        .toString()
                        .getBytes(), "v1.0.0");

        Logger logger = Logger.getLogger(
                ImageFile.class.getName());
        logger.info("File Info: \n" + genericFile.getFileInfo());



    }


}
