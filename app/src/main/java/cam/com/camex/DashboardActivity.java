package cam.com.camex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cam.com.camex.fragments.MainItemFragment;
import cam.com.camex.pojos.CamItem;

public class DashboardActivity extends AppCompatActivity implements MainItemFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    @Override
    public void onListFragmentInteraction(CamItem item) {
        if(item.getSubitemList()==null){
            return;
        }
    }
}
