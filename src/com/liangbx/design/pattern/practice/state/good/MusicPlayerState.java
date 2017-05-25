package com.liangbx.design.pattern.practice.state.good;

/**
 * Created by liangbx on 2017/5/25.
 */
public interface MusicPlayerState {

    void powerOn();

    void powerOff();

    void next();

    void last();
}
