package com.liangbx.design.pattern.practice.state.good;

/**
 * Created by liangbx on 2017/5/25.
 */
public class MusicPlayer {

    private MusicPlayerState musicPlayerState = new PowerOffState();

    public void setState(MusicPlayerState state) {
        musicPlayerState = state;
    }

    public void powerOn() {
        musicPlayerState.powerOn();
        setState(new PowerOnState());
    }

    public void powerOff() {
        musicPlayerState.powerOff();
        setState(new PowerOffState());
    }

    public void next() {
        musicPlayerState.next();
    }

    public void last() {
        musicPlayerState.last();
    }
}
