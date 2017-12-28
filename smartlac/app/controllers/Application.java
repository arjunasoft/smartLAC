
package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

  
	public static void index() {
        render();
    }
   
    public static void sensing(int x){
    	render(x);
    }
    public static void test(ruangan ruang, Gedung ged, lampu lamp){
    	List<ruangan> ruang1 = ruang.findAll();
    	List<Gedung> gedung1 = ged.findAll();
    	List<lampu> lamp1= lamp.findAll();
    	render(ruang1,gedung1,lamp1);
    }
    
    /*
    
    public static void newRuangan() {
      
        render();
    }
     public static void buatBaru(ruangan objruang){
    
    	 render(objruang);
    	 
     }*/
}