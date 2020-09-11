package com.example.gadsleaderboardcharmaine;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import retrofit2.Call;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import okhttp3.ResponseBody;
import retrofit2.Callback;
import retrofit2.Response;

public class Post extends AppCompatActivity {
    private EditText editTextEmail;
    private EditText editTextName;
    private EditText editTextLastName;
    private EditText editTextLinkToProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section_four);

        editTextEmail = findViewById(R.id.edit_email);
        editTextName = findViewById(R.id.edit_name);
        editTextLastName = findViewById(R.id.edit_lastname);
        editTextLinkToProject-= findViewById(R.id.link_to_project);

        findViewById(R.id.).setOnClickListener(this);
        findViewById(R.id.).setOnClickListener(this);


    }

    private void userSubmit() {
        String email = editTextEmail.getText().toString().trim();
        String Name = editTextName.getText().toString().trim();
        String LastName = editTextLastName.getText().toString().trim();
        String LinkToProject = editTextLinkToProject.getText().toString().trim();

        if (email.isEmpty()) {
            editTextEmail.setError("Email is required");
            editTextEmail.requestFocus();
            return;

        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) ;
        {
            editTextEmail.setError("Enter a valid email");
            editTextEmail.requestFocus();
            return;
        }

        if (Name.isEmpty()) {
            editTextName.setError("Name is required");
            editTextName.requestFocus();
            return;
        }

        if (LastName.isEmpty()) {
            editTextLastName.setError("Last Name is required");
            editTextLastName.requestFocus();
            return;

        }
        Call<ResponseBody> call = ApiClient.
                getInstance().
                getApi()
                .formResponse(email, Name, LastName, LinkToProject);
        call.enqueue((new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Toast.makeText(Post.this, "Sucessful", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(Post.this, "Failed", Toast.LENGTH_LONG).show();
            }
        }));
    }

    @Override
    public void onClick(View v){
    }
}