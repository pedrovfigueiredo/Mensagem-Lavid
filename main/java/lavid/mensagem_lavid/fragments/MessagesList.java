package lavid.mensagem_lavid.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lavid.mensagem_lavid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessagesList extends Fragment {


    public MessagesList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_messages_list, container, false);
    }

}
