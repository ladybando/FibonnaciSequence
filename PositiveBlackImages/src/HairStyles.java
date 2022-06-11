import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
//jsoup
public class HairStyles extends ServiceCommunicator{
//http://ajax.googleapis.com/ajax/services/search/images
    public HairStyles(String serviceURL, String styles) throws IOException {
        super(serviceURL + styles);
    }
    //BufferedImage image = ImageIO.read(new File("www.google.com/search?q="));

    /*tester method*/
    public static void main(String[] args) throws IOException {
        HairStyles style = new HairStyles("www.google.com/search?q=","short+hairstyles");
        System.out.println(style.get());
    }

}
