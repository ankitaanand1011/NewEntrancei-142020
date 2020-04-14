package com.exam.entranceinew.ui.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.exam.entranceinew.R;
import com.exam.entranceinew.ui.activity.ChangePasswordScreen;

public class ProfileFragment extends Fragment {
    String TAG ="profile";
    LinearLayout ll_qty;
    TextView qty_spinner;
    RelativeLayout rl_password;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        initialize_view(view);
        functions();


        return view;

    }

    private void initialize_view(View view) {
        ll_qty = view.findViewById(R.id.ll_qty);
        qty_spinner = view.findViewById(R.id.qty_spinner);
        rl_password = view.findViewById(R.id.rl_password);
    }

    private void functions() {
        ll_qty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty_dialog();
            }
        });

        rl_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChangePasswordScreen.class);
                startActivity(intent);
            }
        });
    }

    private void qty_dialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Change Class");
        final String[] qty_arr = getResources().getStringArray(R.array.class_array);
        builder.setItems(qty_arr, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {

                String selected_item= qty_arr[item];
                Log.d(TAG, "onClick:selected_item>> "+selected_item);
                String[] separated = selected_item.split(" ");
                String str1 = separated[0];
                String str2 = separated[1];
                qty_spinner.setText(str2);

               // update_cart_qty(holder,sku,quote_id,item_id,selected_item);
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

}
