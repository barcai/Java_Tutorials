package week5;

import java.awt.Color;

import week4.StdDraw;

public class Voronoi {

    public static double pointDist(Point2D point1, Point2D point2) {
        double distance = Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2));
        return distance;
    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
        int closest = 0;
        
        for (int i = 1; i < sites.length; i++) {
        	if (pointDist(point, sites[closest]) > pointDist(point, sites[i])) {
        		closest = i;
        	}
        }
        
        return closest;
    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
        int[][] indexmap = new int[width][height];
        
        for (int i = 0; i < width; i++) {
        	for (int k = 0; k < height; k++) {
        		indexmap[i][k] = findClosestPoint(new Point2D(i, k), sites);
        	}
        }
        
        return indexmap;
    }
    
    public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
        int width = indexMap.length;
        int height = indexMap[0].length;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        
        for (int i = 0; i < width; i++) {
        	for (int k = 0; k < height; k++) {
        		StdDraw.setPenColor(colors[indexMap[i][k]]);
        		StdDraw.point(i, k);
        	}
        }
        
        StdDraw.setPenColor(Color.BLACK);
        for (Point2D site : sites) {
            StdDraw.filledCircle(site.getX(), site.getY(), 1);
        }
    }

    public static void main(String[] args) {
        int width = 200;
        int height = 200;
        
        
        int nSites = (int) (Math.random()*200);
        Point2D[] sites = new Point2D[nSites];
        Color[] colors = new Color[nSites];
        /*
        sites[0] = new Point2D(50, 50);
        sites[1] = new Point2D(100, 50);
        sites[2] = new Point2D(50, 100);
        sites[3] = new Point2D(125, 50);
        sites[4] = new Point2D(100, 175);
        */
        
        // Instead of the normal initialization we give
        // the points random locations and colours with
        // variable amount of different sites
        for (int i = 0; i < nSites; i++) {
        	sites[i] = new Point2D((int) (Math.random() * width), (int) (Math.random() * height));
        	colors[i] = new Color((int) (Math.random()*256), (int) (Math.random()*256), (int) (Math.random()*256));
        }
        
        int[][] indexmap = buildVoronoiMap(sites, width, height);
        plotVoronoiMap(sites, colors, indexmap);

    }
/*
    // Main function for testing
    public static void main(String[] args) {
    	
    	int nSites = 5;
        Point2D[] sites = new Point2D[nSites];
    	sites[0] = new Point2D(50, 50);
        sites[1] = new Point2D(100, 50);
        sites[2] = new Point2D(50, 100);
        sites[3] = new Point2D(125, 50);
        sites[4] = new Point2D(100, 175);
        System.out.println(pointDist(new Point2D(3,4), new Point2D(6,8)));
        System.out.println(findClosestPoint(new Point2D(130,4), sites));
        System.out.println(buildVoronoiMap(sites, 300, 200)[120][3]);
    }
*/
}