package edu.westga.kaleighkendrickstaticfragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements DataEntryFragment.DataEntryListener, DataProductDisplayFragment.DataEntryListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Gets a reference to the DataProductDisplayFragment using the FragmentManager returned
     * by the activity's getSupportFragmentManager method.
     * @param entry1 The first entry.
     * @param entry2 The second entry.
     */
    @Override
    public void onDataEntry(double entry1, double entry2) {
        DataProductDisplayFragment displayFragmentProduct = (DataProductDisplayFragment)
                getSupportFragmentManager().findFragmentById(R.id.dataProductDisplayFragment);
        displayFragmentProduct.setInteger1(entry1);
        displayFragmentProduct.setInteger2(entry2);
        displayFragmentProduct.multiply();
        displayFragmentProduct.displayProduct();
    }
    /**
     * Gets a reference to the DataProductDisplayFragment using the FragmentManager returned
     * by the activity's getSupportFragmentManager method.
     * @param entry1 The first entry.
     * @param entry2 The second entry.
     */
    @Override
    public void onDataAdd (double entry1, double entry2){
        DataSumDisplayFragment displayFragmentSum = (DataSumDisplayFragment)
                getSupportFragmentManager().findFragmentById(R.id.dataSumDisplayFragment);
        displayFragmentSum.setInteger1(entry1);
        displayFragmentSum.setInteger2(entry2);
        displayFragmentSum.add();
        displayFragmentSum.displaySum();
    }
}
