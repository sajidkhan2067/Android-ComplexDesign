package com.example.sajidkhan.complexdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CommunicationChannel {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setCommunicationMessage(String str) {

        if (str.contains("Left")) {
            RightFragment rightFragment = (RightFragment) getSupportFragmentManager().findFragmentById(R.id.displayDetail);
            if (null != rightFragment && rightFragment.isInLayout()) {
                rightFragment.setReceivedText("Clicked on Left Fragment");
                Toast.makeText(MainActivity.this, "Clicked on Left fragment", Toast.LENGTH_LONG).show();
                //Changed inside tab can changed in Fragment without loading whole activity
            }
        } else if (str.contains("Right")) {
            LeftFragment leftFragment = (LeftFragment) getSupportFragmentManager().findFragmentById(R.id.displayList);
            if (null != leftFragment && leftFragment.isInLayout()) {
                Toast.makeText(MainActivity.this, "Reload by clicking right fragment", Toast.LENGTH_LONG).show();
                finish();
                startActivity(new Intent(MainActivity.this, MainActivity.class));
                //Change in your database , sqlite or your needed things and reload this activity so that
                //your changes can be showed inside tab
            }


        }
    }

}
