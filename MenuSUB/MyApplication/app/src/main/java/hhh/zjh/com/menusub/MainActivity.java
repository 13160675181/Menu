package hhh.zjh.com.menusub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.SubMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu sub=menu.addSubMenu("搜索");
        sub.setIcon(android.R.mipmap.sym_def_app_icon);
        sub.add(0,1,1,R.string.local);
        sub.add(0,2,2,R.string.network);
        return super.onCreateOptionsMenu(menu);
    }
}
