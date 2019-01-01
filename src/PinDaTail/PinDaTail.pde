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
  fill(#000000);
  text("Pin The Tail on the Donkey",40,10);
  rect(0,0,30,30);
  //rect(182,32,30,30);
  if(dist(0,0,mouseX,mouseY)>30){
    background(#6BFA19);
    //text("Pin The Tail on the Donkey",40,10);
  }
  image(tail,mouseX-10,mouseY-10);
  noFill();
  rect(0, 0, 30, 30);
  
  if(mousePressed==true){
    println("X: "+mouseX+" Y: "+mouseY+" ");
    if(dist(198,36,mouseX,mouseY)<10){
      println("win");
      background(donkey);
      text("YOU WIN!!",10,150);
    }
  }
}