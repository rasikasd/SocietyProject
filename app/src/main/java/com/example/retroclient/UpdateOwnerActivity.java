package com.example.retroclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UpdateOwnerActivity extends AppCompatActivity {

    EditText edtId;
    LoginService loginService;
    Button btnFetchOwner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_owner);

        edtId = (EditText) findViewById(R.id.edtId);


        loginService = ServiceGenerator.createService(LoginService.class);

        /*btnFetchOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UpdateOwnerActivity.this, OwnerActivity.class);
                intent.putExtra("user_name", "");
                startActivity(intent);
                //String temp = edtId.getText().toString().trim();
                // int finalValue=Integer.parseInt(temp);

                // o.getId(Integer.parseInt(temp));

            }
            });
           Owner o = new Owner();
            Call<List<Owner>> call = loginService.getOwner();
               call.enqueue(new Callback<List<Owner>>() {
                    @Override
                    public void onResponse(Call<List<Owner>>call, Response<List<Owner>> response) {

                        if (response.isSuccessful()) {
                            Toast.makeText(UpdateOwnerActivity.this, "Owner is available", Toast.LENGTH_SHORT).show();
                            Log.d("Owner Fetched", response.body().toString());
                             //Owner o = response.body();

                            //startActivity(new Intent(getApplicationContext(), UpdateOwnerActivity2.class));
                            // user object available
                        } else {
                            // error response, no access to resource?
                            Toast.makeText(getApplicationContext(), "Cannot Add Owner", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Owner>> call, Throwable t) {

                        Log.d("Error", t.getMessage());
                    }
                });*/

    }
}
