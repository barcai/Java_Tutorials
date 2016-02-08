package week6;

import java.awt.Color;

import week4.Picture;

public class ImageEditor2 {
	
	public static Picture threshold(Picture p, int thresh) {
		Picture greyscale = p;
		int width = p.width();
		int height = p.height();
		for (int i = 0; i < width; i++){
    		for (int k = 0; k < height; k++) {
    			Color pixel = greyscale.get(i, k);
    			if (thresh > ImageEditor1.luminance(pixel)) {
    				pixel = Color.BLACK;
    			} else {
    				pixel = ImageEditor1.toGrey(pixel);
    			}
    			greyscale.set(i, k, pixel);
    		}
		}
    	return greyscale;	
	}
	
	public static void main(String[] args) {
		
		Picture p = new Picture("assets/spider.jpg"); // or use any other colour image
		Picture greyscale = threshold(p, 250);
		greyscale.show();
	}
}
