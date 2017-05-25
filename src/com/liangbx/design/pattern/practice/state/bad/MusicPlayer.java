package com.liangbx.design.pattern.practice.state.bad;

/**
 * Created by liangbx on 2017/5/25.
 */
public class MusicPlayer {

    private boolean isPowerOn = false;

    public void powerOn() {
        isPowerOn = true;
        System.out.println("开机中...");
    }

    public void powerOff() {
        isPowerOn = false;
        System.out.println("关机中...");
    }

    public void next() {
        if(isPowerOn) {
            System.out.println("下一首");
        } else {
            System.out.println("已关机，操作无效");
        }
    }

    public void last() {
        if(isPowerOn) {
            System.out.println("上一首");
        } else {
            System.out.println("已关机，操作无效");
        }
    }
}
