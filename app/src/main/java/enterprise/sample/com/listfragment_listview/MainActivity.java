package enterprise.sample.com.listfragment_listview;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LstFragment lstfragment=(LstFragment)getSupportFragmentManager().findFragmentByTag("lstfragment");
        if(lstfragment==null){
            lstfragment=new LstFragment();
            FragmentTransaction transact=getSupportFragmentManager().beginTransaction();
            transact.add(android.R.id.content,lstfragment,"lstfragment");
            transact.commit();

        }
    }

}