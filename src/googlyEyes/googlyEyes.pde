//UpperLeft 185 275
//Upperright 228 276
//lowerleft 186 319
//lowerright 232 320
PImage face;
void setup(){
  face=loadImage("googlyEyes.png");
  size(800,600);
  face.resize(800,600);
  background(face);

}

void draw(){
  if(mousePressed==true){
    print(mouseX+" "+mouseY);
  }
  background(face);
  fill(#FFFFFF);
  ellipse(207,297,70,70);
  ellipse(368,301,70,70);
  if (mouseX<185){
    mouseX=185;
  }
  if (mouseX>232){
    mouseX=232;
  }
  if (mouseY<275){
    mouseY=275;
  }
  if (mouseY>320){
    mouseY=320;
  }
  fill(#000000);
  ellipse(mouseX,mouseY,20,20);
  ellipse(mouseX+160,mouseY+5,20,20);
}