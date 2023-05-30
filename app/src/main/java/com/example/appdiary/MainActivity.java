package com.example.appdiary;
//10120133 - Muhammad Saeful Rizki - IF 4
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.appdiary.Fragment.FragmentDiary;
import com.example.appdiary.Fragment.FragmentHome;
import com.example.appdiary.Fragment.FragmentProfil;
import com.example.appdiary.Fragment.InfoFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity{
        private BottomNavigationView bottomNavigationView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);

            //menampilkan halaman yang pertama muncul
            getFragmentPage(new InfoFragment());

            //insialisasi bottom nav
            bottomNavigationView = findViewById(R.id.bottomNavigationView);
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragment = null;

                    switch (item.getItemId()){
                        case
                                R.id.home:
                            fragment = new FragmentHome();
                            break;
                        case
                                R.id.person:
                            fragment = new FragmentProfil();
                            break;
                        case
                                R.id.diary:
                            fragment = new FragmentDiary();
                            break;
                    }
                    return getFragmentPage(fragment);
                }
            });
        }

        private boolean getFragmentPage(Fragment fragment){
            if (fragment != null){
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.page_container, fragment)
                        .commit();
                return true;
            }
            return false;
        }
}