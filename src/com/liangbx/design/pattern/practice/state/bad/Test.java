package com.liangbx.design.pattern.practice.state.bad;

/**
 * Created by liangbx on 2017/5/25.
 */
public class Test {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.powerOn();
        musicPlayer.next();
        musicPlayer.last();
        musicPlayer.powerOff();
        musicPlayer.last();
        musicPlayer.last();
    }
}
