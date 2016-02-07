package edu.westga.kaleighkendrickstaticfragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.EventObject;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataEntryFragment extends Fragment {
    EditText textEntry1;
    EditText textEntry2;
    DataEntryListener listener;

    interface DataEntryListener {
        void onDataEntry(double entry1, double entry2);
    }

    public DataEntryFragment() {
        // Required empty public constructor
    }

    public void multiplyButtonClicked(View v){
        double firstNumber = Double.parseDouble(this.textEntry1.getText().toString());
        double secondNumber = Double.parseDouble(this.textEntry2.getText().toString());
        listener.onDataEntry(firstNumber, secondNumber);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
            listener = (DataEntryListener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View theView =  inflater.inflate(R.layout.fragment_data_entry, container, false);

        this.textEntry1 = (EditText) theView.findViewById(R.id.editTextNumbers1);
        this.textEntry2 = (EditText) theView.findViewById(R.id.editTextNumbers2);

        final Button multiplyButton = (Button) theView.findViewById(R.id.buttonMultiply);
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                multiplyButtonClicked(v);
            }
        });
        return theView;
    }

}
