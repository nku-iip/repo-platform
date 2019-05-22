package test;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

import javax.security.auth.x500.X500Principal;

public class test {

    public static void main(String argv[]) throws IOException{
    	
        String encoding="GBK";
        InputStreamReader read = new InputStreamReader(new FileInputStream("points"),encoding);//¿¼ÂÇµ½±àÂë¸ñÊ½
        BufferedReader bufferedReader = new BufferedReader(read);
        String lineTxt = null;
        Point []po = new Point[50];
        int i = -1;
        while((lineTxt = bufferedReader.readLine()) != null){  
        	lineTxt.split(",");
        	i=i+1;
        	int x = Integer.parseInt(lineTxt.split(",")[0]);
        	int y = Integer.parseInt(lineTxt.split(", ")[1]);
        	po[i] = new Point();
        	po[i].setX(x);
        	po[i].setY(y);
        	//po[i].setX(Integer.parseInt(lineTxt.split(",")[0]));
            //po[i].setY(Integer.parseInt(lineTxt.split(", ")[1]));
            //i=i+1;
            //System.out.println(Integer.parseInt(lineTxt.split(",")[0]));  
            //System.out.println(Integer.parseInt(lineTxt.split(", ")[1]));
        	
        }

    		for(int j = 0; j < po.length; i ++)
    		{
    			System.out.println( po[j].getX() + ", " + po[j].getY());                    
    		}
    		 read.close(); 
   }
}
