package com.example.ods14;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;



import java.util.ArrayList;
import java.util.List;

public class Viwprojetos extends AppCompatActivity {

    public static List<projeto> Listaprojeto = new ArrayList<projeto>();
    private AppBarConfiguration appBarConfiguration;



    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_viwprojetos);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}