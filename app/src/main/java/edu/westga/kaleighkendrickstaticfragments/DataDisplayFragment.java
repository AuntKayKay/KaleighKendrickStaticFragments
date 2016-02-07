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
public class DataDisplayFragment extends Fragment {
    TextView zeroTextView;
    double integer1;
    double integer2;
    double results;

    /**
     * Constructor
     */
    public DataDisplayFragment() {
        // Required empty public constructor
    }

    /**
     * Sets the value of the first integer.
     * @param integer1 The first integer.
     */
    public void setInteger1(double integer1) {
        this.integer1 = integer1;
    }

    /**
     * Sets the value of the second integer.
     * @param integer2 The second integer.
     */
    public void setInteger2(double integer2) {
        this.integer2 = integer2;
    }

    /**
     * Stores the product of the two numbers.
     * @param integer1 The first integer.
     * @param integer2 The second integer.
     * @param results The product of the two integers.
     */
    public void multiply(double integer1, double integer2, double results) {
        this.results = integer1 * integer2;
    }

    /**
     * Displays the product.
     */
    public void displayProduct() {
        this.zeroTextView.setText(Double.toString(this.results));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.fragment_data_display, container, false);
        TextView theTextView = zeroTextView;
        return theView;
    }

}
