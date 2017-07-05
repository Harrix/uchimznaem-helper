package ru.uchimznaem.uchimznaemhelper;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RoomFragment extends Fragment {

    private TextView numberRoom;

    private static final String TAG = "uz-helper";

    public RoomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_room, container, false);

        String message = getArguments().getString("message");

        numberRoom = (TextView)v.findViewById(R.id.numberroom);

        numberRoom.setText(message);

        return v;
    }
}