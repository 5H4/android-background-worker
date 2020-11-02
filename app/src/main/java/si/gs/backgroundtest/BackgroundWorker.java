package si.gs.backgroundtest;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class BackgroundService extends IntentService {
    private static final String TAG = "BackgroundWorker";
    
    /*
    public BackgroundWorker(
            @NonNull Context context,
            @NonNull WorkerParameters params) {
        super(context, params);
    }*/

    /*
    @Override
    public Result doWork() {
        String text = "Application executing background work";
        Log.d(TAG, text);
        return Result.success();
    }*/
    
    protected void onHandleIntent(Intent service) {
        Log.d("TAG", service.getDataString());
    }
    
    /*
    Add to manifest:
    Start your serivce in background...
    <application>
        <service
                android:name=".BackgroundService"
                android:exported="false"/>
    </application>
    */
}
