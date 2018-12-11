//UL 252 276
//UR 265 274
//LL 252 312
//LR 272 310
void setup() {
      PImage waldo = loadImage("waldo2.jpg"); // 5. Change this to match your file name.
      size(600, 400);
      waldo.resize(600,400);
      image(waldo, 0, 0);
     doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
     woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
}

void draw() {
      // 6. Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
      if(mousePressed==true){
        println("X: " + mouseX + " Y: " + mouseY); 
        if (mouseX>252 && mouseX<272 && mouseY>274 && mouseY<312){
          println("WALDO FOUND!!!");
          playWoohoo();
        }else {
          println("oof");
          playDoh();
        }
      }
      

      // 7. If the mouse is on Waldo, print “Waldo found!”

      // 8. If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // 9. If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;