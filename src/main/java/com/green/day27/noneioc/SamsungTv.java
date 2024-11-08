package com.green.day27.noneioc;

import com.green.day27.*;

public class SamsungTv implements Tv {
    private Speaker speaker;

    public SamsungTv() {
        //speaker = new HarmanSpeaker();
        speaker = new JBLSpeaker();
    }

    @Override
    public void sound() {
        System.out.println("Samsung Tv: 소리가 난다.");
        speaker.speakerSound();
    }
    /*
    Samsung Tv: 소리가 난다.
    Harman Speaker: 소리가 웅장하다.
    Hanil Woofer: 웅!! 웅!! 웅!!
     */
}
