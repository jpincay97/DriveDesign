package com.example.drivedesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.drivedesign.Adapter.AdaptadorArchivo;
import com.example.drivedesign.Model.Archivo;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navView;
    ArrayList<Archivo> listaArchivos;
    RecyclerView rvArchivos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.iconmenu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navView = (NavigationView)findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(this);

        listaArchivos = new ArrayList<>();
        rvArchivos = (RecyclerView) findViewById(R.id.rvArchivos);
        rvArchivos.setLayoutManager(new LinearLayoutManager(this));
        llenarArchivos();

        AdaptadorArchivo adapter = new AdaptadorArchivo(listaArchivos);
        rvArchivos.setAdapter(adapter);

    }

    public void llenarArchivos(){
        listaArchivos.add(new Archivo("Taller modelado en 3D","Lo abriste ayer",
                R.drawable.word,R.drawable.documentoword,R.drawable.johnp));
        listaArchivos.add(new Archivo("Herramientas CRM","Editado hace menos de una " +
                "semana por...",
                R.drawable.slide,R.drawable.documentoslide,R.drawable.w));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        boolean fragmentTransaction = false;

        Fragment fragment = null;
        /*switch (menuItem.getItemId()) {
            case R.id.menu_reciente:
                fragment = new Fragment1();
                fragmentTransaction = true;
                break;
        }*/

        if(fragmentTransaction) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, fragment)
                    .commit();

            menuItem.setChecked(true);
            getSupportActionBar().setTitle(menuItem.getTitle());
        }
        drawerLayout.closeDrawers();
        return true;

    }
}
