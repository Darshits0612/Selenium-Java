package oops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ABC {
	public static int overlappingRectangles(String[] strArr) {
	    // Parse the input string
	    int[] rect1 = new int[4];
	    int[] rect2 = new int[4];
	    Pattern p = Pattern.compile("\\((-?\\d+),(-?\\d+)\\)");
	    Matcher m = p.matcher(strArr[0]);
	    for (int i = 0; i < 4 && m.find(); i++) {
	        rect1[i] = Integer.parseInt(m.group(1));
	        rect1[i+1] = Integer.parseInt(m.group(2));
	    }
	    for (int i = 0; i < 4 && m.find(); i++) {
	        rect2[i] = Integer.parseInt(m.group(1));
	        rect2[i+1] = Integer.parseInt(m.group(2));
	    }
	    
	    // Check if there is any overlap between the two rectangles
	    int x1 = Math.min(rect1[0], rect1[2]);
	    int y1 = Math.min(rect1[1], rect1[3]);
	    int x2 = Math.max(rect1[0], rect1[2]);
	    int y2 = Math.max(rect1[1], rect1[3]);
	    int x3 = Math.min(rect2[0], rect2[2]);
	    int y3 = Math.min(rect2[1], rect2[3]);
	    int x4 = Math.max(rect2[0], rect2[2]);
	    int y4 = Math.max(rect2[1], rect2[3]);
	    if (x1 <= x4 && x2 >= x3 && y1 <= y4 && y2 >= y3) {
	        // Calculate the area of the overlapping rectangle
	        int area = (Math.min(x2, x4) - Math.max(x1, x3)) * (Math.min(y2, y4) - Math.max(y1, y3));
	        // Calculate the number of times the overlapping rectangle can fit into the first rectangle
	        return (rect1[2] - rect1[0]) * (rect1[3] - rect1[1]) / area;
	    } else {
	        return 0;
	    }
	}

}
