package com.example.formulas;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.formulas.R;
public class PythagoreanFragment extends Fragment {
    private EditText editTextA, editTextB;
    private TextView textViewC;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //  inflate the fragment_pythagorean layout
        View rootView = inflater.inflate(R.layout.fragment_pythagorean, container, false);
        //  wire widgets using that layout
        //  call findViewByIf on the rootview
        wireWidgets(rootView);
        //  set any listeners for those widgets
        editTextA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if(!editTextA.getText().toString().equals("") && !editTextB.getText().toString().equals("")){
                    double a = Double.parseDouble(editTextA.getText().toString());
                    double b = Double.parseDouble(editTextB.getText().toString());
                    double n = Math.sqrt(a * a + b * b);
                    String abom = n + "";
                    textViewC.setText(abom);
                }
            }
        });
        editTextB.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if(!editTextA.getText().toString().equals("") && !editTextB.getText().toString().equals("")){
                    double a = Double.parseDouble(editTextA.getText().toString());
                    double b = Double.parseDouble(editTextB.getText().toString());
                    double n = Math.sqrt(a * a + b * b);
                    String abom = n + "";
                    textViewC.setText(abom);
                }
            }
        });
        //  return the inflated view
        return rootView;
    }
    private void wireWidgets(View rootView){
        editTextA = rootView.findViewById(R.id.editText_pythagorean_a);
        editTextB = rootView.findViewById(R.id.editText_pythagorean_b);
        textViewC = rootView.findViewById(R.id.textView_pythagorean_c);
    }
}
