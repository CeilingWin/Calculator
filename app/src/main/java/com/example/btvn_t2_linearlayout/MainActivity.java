package com.example.btvn_t2_linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.text.Html.fromHtml;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button xbp=(Button) findViewById(R.id.btn_xbp);
        Button cbh=(Button) findViewById(R.id.btn_cbh);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.N){
            xbp.setText(Html.fromHtml(getString(R.string.btn_xbp),Html.FROM_HTML_MODE_COMPACT));
            cbh.setText(Html.fromHtml(getString(R.string.btn_cbh),Html.FROM_HTML_MODE_COMPACT));
        }else{
            xbp.setText(Html.fromHtml(getString(R.string.btn_xbp)));
            cbh.setText(Html.fromHtml(getString(R.string.btn_cbh)));
        }
    }
}