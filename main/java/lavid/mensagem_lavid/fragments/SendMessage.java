package lavid.mensagem_lavid.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import lavid.mensagem_lavid.LoginActivity;
import lavid.mensagem_lavid.MainActivity;
import lavid.mensagem_lavid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SendMessage extends Fragment {


    public SendMessage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_send_message, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);

    }

    public void ChangeUsername(String username){
        TextView mTextView = (TextView) this.getView().findViewById(R.id.username_show_main);
        mTextView.setText(username);
    }



}
