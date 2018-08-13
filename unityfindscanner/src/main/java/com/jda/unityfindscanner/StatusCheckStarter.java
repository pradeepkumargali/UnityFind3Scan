package com.jda.unityfindscanner;


import android.content.Intent;
import android.app.Activity;

/**
 * Created by J1012748 on 21/03/18.
 */

public final class StatusCheckStarter {
    static Activity myActivity;

    // Called From C# to get the Activity Instance
    public static void receiveActivityInstance(Activity tempActivity) {
        myActivity = tempActivity;
    }

    public static void StartCheckerService() {
        myActivity.startService(new Intent(myActivity, ScanService.class));
    }
}
