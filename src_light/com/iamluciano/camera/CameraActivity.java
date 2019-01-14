package com.iamluciano.camera;

import android.os.Bundle;
import com.android.camera.app.CameraAppUI;

public class CameraActivity extends com.android.camera.CameraActivity {

    @Override
    public void onCreateTasks(Bundle state) {
        super.onCreateTasks(state);
        CameraAppUI ui = getCameraAppUI();
        if (ui != null) {
            ui.setSwipeEnabled(false);
        }
    }

}
