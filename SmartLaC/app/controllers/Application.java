
package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

  
	public static void index() {
        render();
    }
	public static void dokumentasi() {
        render();
    }
    public static void sensing(int x){
    	render(x);
    }
    public static void rumusan_masalah() {
        render();
    }
    public static void identifikasi_masalah() {
        render();
    }
    public static void problem_statement() {
        render();
    }
    public static void fr() {
        render();
    }
    public static void nfr() {
        render();
    }
    public static void potclass() {
        render();
    }
    public static void refind() {
        render();
    }
    public static void potclassfin() {
        render();
    }
    public static void diagramclass() {
        render();
    }
    public static void home() {
        render();
    }
    public static void textual() {
        render();
    }
    public static void usecase() {
        render();
    }
    
    public static void test(ruangan ruang, Gedung ged, lampu lamp){
    	
    	List<ruangan> ruang1 = ruang.findAll();
    	List<Gedung> gedung1 = ged.findAll();
    	List<lampu> lamp1= lamp.findAll();
    	render(ruang1,gedung1,lamp1);
    }
   public static void tampilgedung(){
	   render();
   }
    /*
    
    public static void newRuangan() {
      
        render();
    }
     public static void buatBaru(ruangan objruang){
    
    	 render(objruang);
    	 
     }*/
}