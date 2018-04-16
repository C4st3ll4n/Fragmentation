package senac.cadaluno.castellan.fragmentation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AFragment extends Fragment {
    private View v;
    private TextView tv;

    public AFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_a, container, false);
        tv = v.findViewById(R.id.txtFrag1);
        tv.setText("FRAGMENTO A ALTERADO !");
        return v;
    }

}
