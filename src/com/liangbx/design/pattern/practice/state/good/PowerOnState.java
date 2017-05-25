package com.liangbx.design.pattern.practice.state.good;

/**
 * Created by liangbx on 2017/5/25.
 */
public class PowerOnState implements MusicPlayerState {

    @Override
    public void powerOn() {
        System.out.println("已开机");
    }

    @Override
    public void powerOff() {
        System.out.println("关机中...");
    }

    @Override
    public void next() {
        System.out.println("下一首");
    }

    @Override
    public void last() {
        System.out.println("上一首");
    }
}
