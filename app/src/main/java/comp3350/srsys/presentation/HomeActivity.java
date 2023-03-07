package comp3350.srsys.presentation;

import comp3350.srsys.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    public void buttonStartWorkoutOnClick(View v) {
        Intent swIntent = new Intent(HomeActivity.this, StartWorkoutActivity.class);
        HomeActivity.this.startActivity(swIntent);
    }

    public void buttonMyRoutinesOnClick(View v) {
        Intent mrIntent = new Intent(HomeActivity.this, MyRoutinesActivity.class);
        HomeActivity.this.startActivity(mrIntent);
    }

    public void buttonGraphOnClick(View v) {
        Intent graphIntent = new Intent(HomeActivity.this, GraphActivity.class);
        HomeActivity.this.startActivity(graphIntent);
    }

    public void buttonStatisticsOnClick(View v) {
        Intent statisticsIntent = new Intent(HomeActivity.this, StatisticsActivity.class);
        HomeActivity.this.startActivity(statisticsIntent);
    }
}
