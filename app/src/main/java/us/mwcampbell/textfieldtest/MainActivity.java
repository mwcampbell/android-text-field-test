package us.mwcampbell.textfieldtest;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public final class MainActivity extends AppCompatActivity {
    private EditText mEdit = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEdit = (EditText) findViewById(R.id.edit);
        mEdit.setText("My Next Task");
        mEdit.setSelection(0, 0);
    }
}
