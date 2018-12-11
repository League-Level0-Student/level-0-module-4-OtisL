PImage donkey;
PImage tail;

void setup(){
  donkey = loadImage("download.jpg");
  tail = loadImage("Wolf_Tail.png");
  size(224,160);
  donkey.resize(224,160);
  tail.resize(50,50);
}

void draw(){
  background(donkey);
  image(tail,mouseX-10,mouseY-10);
  noFill();
  rect(0, 0, 30, 30);
  
  if(mousePressed==true){
    println("X: "+mouseX+" Y: "+mouseY+" ");
  }
}