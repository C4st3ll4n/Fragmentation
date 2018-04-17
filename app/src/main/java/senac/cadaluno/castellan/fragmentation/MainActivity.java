package senac.cadaluno.castellan.fragmentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean status = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trocarFragment(View v) {
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();

        if (!status) {
            AFragment aFragment = new AFragment();
            ft.add(R.id.containerFragment, aFragment);
            TextView bt = (TextView) v;
            bt.setText("CLIQUE AQUI PARA TROCAR DE FRAGMENT");
            status = true;
        } else {
            BFragment bFragment = new BFragment();
            ft.add(R.id.containerFragment, bFragment);
            TextView bt = (TextView) v;
            bt.setText("CLIQUE AQUI PARA TROCAR DE FRAGMENT");
            status = false;
        }
            ft.commit();

    }
}
