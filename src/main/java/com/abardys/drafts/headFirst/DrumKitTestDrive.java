package com.abardys.drafts.headFirst;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();

        d.playSnare();
        d.playToHat();
        d.snare = false;
        if(d.snare == true){
            d.playSnare();
        }



    }
}
