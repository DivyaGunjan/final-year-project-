package com.example.applicationfoodchem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.applicationfoodchem.databinding.ActivityLogin2Binding;
import com.example.applicationfoodchem.databinding.ActivityStartAcitivityBinding;

 class StartActivity extends AppCompatActivity {
    private ActivityStartAcitivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize the binding
        binding = ActivityStartAcitivityBinding.inflate(getLayoutInflater());

        // Set the content view to the root of the binding
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(view -> {
            Intent intent = new Intent(StartActivity.this, loginActivity2.class);
            startActivity(intent);
        });
    }
}
