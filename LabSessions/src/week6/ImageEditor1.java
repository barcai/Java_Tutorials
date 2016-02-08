package week6;

import java.awt.Color;

import week4.Picture;

public class ImageEditor1 {
	
	public static double luminance(Color color) {
		double R = color.getRed();
		double G = color.getGreen();
		double B = color.getBlue();
		double luminance=0.299*R+0.587*G+0.114*B;
		return luminance;
	}

    public static Color toGrey(Color color) {
    	int lum = Math.round((float)(luminance(color)));
    	Color grey = new Color(lum, lum, lum);
    	return grey;
    }
    
    public static Picture makeGreyscale(Picture pic) {
    	Picture grey = pic;
    	int height = grey.height();
    	int width = grey.width();
    	for (int i = 0; i < width; i++){
    		for (int k = 0; k < height; k++) {
    			Color c = grey.get(i, k);
    			c = toGrey(c);
    			grey.set(i, k, c);
    		}
    	}
    	return grey;
    	
    }
    
	public static void main(String[] args) {
		
		Picture p = new Picture("assets/spider.jpg"); // or use any other colour image
		Picture greyscale = makeGreyscale(p);
		greyscale.show();
	}
}
