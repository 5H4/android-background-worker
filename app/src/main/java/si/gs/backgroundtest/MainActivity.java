package si.gs.backgroundtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // startActivityForResult(new Intent(android.provider.Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS), 0);
        this.setupBackgroundWorker();
    }

    private void setupBackgroundWorker(){
        String backgroundWorkTag = "myBackgroundWork";
        PeriodicWorkRequest workRequest = new PeriodicWorkRequest.Builder(BackgroundWorker.class, 15, TimeUnit.MINUTES)
                .addTag(backgroundWorkTag)
                .setInitialDelay(15, TimeUnit.SECONDS)
                .build();
        WorkManager.getInstance(this).enqueueUniquePeriodicWork(backgroundWorkTag, ExistingPeriodicWorkPolicy.REPLACE, workRequest);
        Toast.makeText(this, "Background worker configured", Toast.LENGTH_LONG).show();
    }

}