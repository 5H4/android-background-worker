package si.gs.backgroundtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootCompletedReceiver extends BroadcastReceiver {
    private static final String TAG = "BootCompletedReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        String text = "Application started on boot";
        Log.d(TAG, text);
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }
}
