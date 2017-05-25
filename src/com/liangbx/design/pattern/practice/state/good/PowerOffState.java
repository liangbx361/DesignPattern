package com.liangbx.design.pattern.practice.state.good;

/**
 * Created by liangbx on 2017/5/25.
 */
public class PowerOffState implements MusicPlayerState {

    @Override
    public void powerOn() {
        System.out.println("开机中...");
    }

    @Override
    public void powerOff() {
        System.out.println("已关机");
    }

    @Override
    public void next() {
        System.out.println("关机状态，该功能无法使用");
    }

    @Override
    public void last() {
        System.out.println("关机状态，该功能无法使用");
    }
}
