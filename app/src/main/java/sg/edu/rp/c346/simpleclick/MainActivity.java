package sg.edu.rp.c346.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step 1: Declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvDisplay = (TextView)findViewById(R.id.textViewDisplay);
        btnDisplay = (Button)findViewById(R.id.buttonDisplay);
        etInput = (EditText)findViewById(R.id.EditTextInput);
        tbtn =(ToggleButton)findViewById(R.id.toggleButton);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                etInput.getText().toString();
                String string1 = etInput.getText().toString();
                tvDisplay.setText(string1);

            }
        });



        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When toggle button is not checked, editTextInput is enabled
                if (tbtn.isChecked() == (false)){
                    etInput.setEnabled(false);
                    btnDisplay.setEnabled(false);
                }
                else{
                    // when it's checked the editText is disabled
                    etInput.setEnabled(true);
                    btnDisplay.setEnabled(true);
                }

            }
        });





    }
}
