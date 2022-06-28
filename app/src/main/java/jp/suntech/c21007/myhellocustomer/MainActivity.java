package jp.suntech.c21007.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//課題
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        CustomerListener listener = new CustomerListener();
        btClick.setOnClickListener(listener);

        Button btomClear1 = findViewById(R.id.btomLive);
        btomClear1.setOnClickListener(listener);

        Button btomClear2 = findViewById(R.id.btomName);
        btomClear2.setOnClickListener(listener);
    }

    private class CustomerListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            EditText input1 = findViewById(R.id.etLive);
            EditText input2 = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            switch (id){
                case R.id.btClick:
                    String inputStr1 = input1.getText().toString();
                    String inputStr2 = input2.getText().toString();
                    output.setText(inputStr1 + "にお住まいの" + inputStr2 + "さん、こんにちは！");
                    break;
                case R.id.btomLive:
                    input1.setText("");
                    output.setText("");
                    break;
                case R.id.btomName:
                    input2.setText("");
                    output.setText("");
                    break;
            }
        }
    }
}