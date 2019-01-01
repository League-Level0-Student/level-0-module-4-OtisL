PImage back;
PImage creep;
int x = 0;
int y = 0;
void setup(){
  back = loadImage("minecraft-panda.png");
  creep = loadImage("creep.png");
  size(1000,563);
}

void draw(){
  background(back);
  image(creep,mouseX-10,mouseY-10);
  creep.resize(20,20);
  if(mousePressed==true){
    x=mouseX;
    y=mouseY;
  }
  fill(#F03405);
  ellipse(x,y,20,20);
}