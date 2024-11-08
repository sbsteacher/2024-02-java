package com.green.day27.ioc;

import com.green.day27.Speaker;
import com.green.day27.Woofer;

public class GenelecSpeaker implements Speaker {
    private Woofer woofer;

    public GenelecSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("Genelec Speaker: 소리가 엄청나다.");
        woofer.baseSound();
    }
}
