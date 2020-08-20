package sg.edu.rp.c346.id19036308.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private BroadcastReceiver br;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        br = new AnotherBroadcastReceiver();

        IntentFilter filter = new IntentFilter(ConnectivityManager.EXTRA_NO_CONNECTIVITY);
        filter.addAction("com.example.broadcast.MY_BROADCAST");
        this.registerReceiver(br, filter);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        this.unregisterReceiver(br);
    }
}
