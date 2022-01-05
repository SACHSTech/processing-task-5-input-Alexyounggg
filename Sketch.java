import processing.core.PApplet;

public class Sketch extends PApplet {

  int count = 0;
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 255);

    fill(255,255,255);
    rect (0 , 300, 400, 100);
    noStroke();
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

  fill (255,255,0);
  ellipse(0, 0, 50, 50);

   if (keyPressed){
     if (keyCode == UP){
      fill(255, 255, 255); 
      rect(0, 300 - count, 400, 5);
      count++;
     }
     if (key == 'd'){
      fill(0,0,139);
      rect(0, 0, 400, 300 - count);
      fill(192, 192, 192);
      ellipse(0, 0, 50, 50);
    }
   }
   if (mousePressed){
    fill (255,255, 255);
    ellipse(mouseX, mouseY, 5, 5);
  }

  }

  public void keyReleased(){
    if (key == 'd'){
    
    fill(0, 0, 255);
    rect(0, 0, 400, 300 - count);
   
  }
}
public void mouseClicked(){
  fill (255,255,255);
  ellipse(mouseX, mouseY, 10, 10);
  }
}