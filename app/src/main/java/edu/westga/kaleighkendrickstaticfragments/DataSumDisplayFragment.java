package edu.westga.kaleighkendrickstaticfragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataSumDisplayFragment extends Fragment {
    TextView sumTextView;
    double integer1;
    double integer2;
    double results;

    /**
     * Constructor
     */
    public DataSumDisplayFragment() {
        // Required empty public constructor
    }

    /**
     * Sets the value of the first integer.
     * @param integer1 The first integer.
     */
    public void setInteger1(double integer1) {
        if(Double.class.isInstance(this.integer1)){
            this.integer1 = integer1;
        }
    }

    /**
     * Sets the value of the second integer.
     * @param integer2 The second integer.
     */
    public void setInteger2(double integer2) {
        if(Double.class.isInstance(this.integer2)){
            this.integer2 = integer2;
        }

    }

    /**
     * Stores the sum of the two numbers.
     */
    public void add() {
        this.results = this.integer1 + this.integer2;
    }

    /**
     * Displays the sum.
     */
    public void displaySum() {
        if(Double.class.isInstance(this.results)){
            this.sumTextView.setText(Double.toString(this.results));
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.fragment_data_sum_display, container, false);
        this.sumTextView = (TextView) theView.findViewById(R.id.textViewSum);
        return theView;
    }

}
