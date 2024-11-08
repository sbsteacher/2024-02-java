package com.green.day27.ioc;

import com.green.day27.MartenWoofer;
import com.green.day27.Speaker;
import com.green.day27.Tv;
import com.green.day27.Woofer;

public class IocTest {
    public static void main(String[] args) {
        Woofer woofer = new MartenWoofer();
        Speaker speaker = new GenelecSpeaker(woofer);
        Tv tv = new LgTv(speaker);

        tv.sound();
    }
}

class IocTest2 {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
        TvFactory tvFactory2 = TvFactory.getInstance();
        TvFactory tvFactory3 = TvFactory.getInstance();

        System.out.println(tvFactory == tvFactory2);
        System.out.println(tvFactory2 == tvFactory3);
        System.out.println(tvFactory);
        System.out.println(tvFactory2);
        System.out.println(tvFactory3);

    }
}

class IocTest3 {
    //이제 우리는 코드 수정없이 객체를 마음대로 바꿀 수 있습니다.
    public static void main(String[] args) {
        System.out.println("-- IoC Test --");
        TvFactory tvFactory = TvFactory.getInstance();
        Tv tv = tvFactory.factory(args[0], args[1], args[2]);
        tv.sound();
    }
}