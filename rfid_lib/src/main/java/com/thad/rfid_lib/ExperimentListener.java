package com.thad.rfid_lib;

import android.content.Context;
import android.view.ViewGroup;

import com.thad.rfid_lib.Static.Utils;

/**
 * Created by theo on 2/27/18.
 */

public interface ExperimentListener {

    Context getContext();
    ViewGroup getExperimentContainer();
    boolean isGlass();

    void onFakeScan(String scan);
    void playSound(Utils.SOUNDS sound);

    void mLog(String str);
}
