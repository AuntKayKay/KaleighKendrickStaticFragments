package edu.westga.kaleighkendrickstaticfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataProductDisplayFragment extends Fragment {
    TextView productTextView;
    double integer1;
    double integer2;
    double results;
    EditText textEntry1;
    EditText textEntry2;
    DataEntryListener listener;

    /**
     * Gets the two numbers when the multiply button is clicked.
     */
    interface DataEntryListener {
        void onDataAdd(double entry1, double entry2);
    }

    /**
     * Constructor
     */
    public DataProductDisplayFragment() {
        // Required empty public constructor
    }

    /**
     * Gets the numbers entered by the user in the EditText fields.
     * Calls the data member listener's onDataEntry method and passes it
     * the two double values from the EditText fields.
     * @param v The view.
     */
    public void addButtonClicked(View v){
        listener.onDataAdd(this.integer1, this.integer2);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (DataEntryListener) context;
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
     * Stores the product of the two numbers.
     */
    public void multiply() {
        this.results = this.integer1 * this.integer2;
    }

    /**
     * Displays the product.
     */
    public void displayProduct() {
        if(Double.class.isInstance(this.results)){
            this.productTextView.setText(Double.toString(this.results));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.fragment_data_product_display, container, false);
        this.productTextView = (TextView) theView.findViewById(R.id.textViewProduct);

        final Button sumButton = (Button) theView.findViewById(R.id.addButton);
        sumButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 addButtonClicked(v);
            }
        });
        return theView;
    }

}
