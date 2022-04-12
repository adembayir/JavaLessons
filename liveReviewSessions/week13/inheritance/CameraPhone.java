package week13.inheritance;

public class CameraPhone extends Phone {

    public int imageSize, memorySize;

    public CameraPhone(int imageSize, int memorySize) {
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }

    public int numPictures() {
        return memorySize/imageSize*1000;
    }
}
