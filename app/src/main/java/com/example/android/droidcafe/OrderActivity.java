/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This activity is blank for now. Subsequent versions of the app
 * provide input controls and a delivery method for an order.
 */
public class OrderActivity extends AppCompatActivity implements View.OnClickListener {
    String date;
    TextView showDate;
    EditText enterDate;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        init();
    }
    public void init(){
        showDate=findViewById(R.id.textView);
        enterDate=findViewById(R.id.editText);
        submit=findViewById(R.id.button);
        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            date=enterDate.getText().toString();
            showDate.setText("Placement Date: "+date);

            CharSequence text = "The Order has Been Placed on: "+date;
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(getApplicationContext(), text, duration);
            toast.show();




        }

    }
}
