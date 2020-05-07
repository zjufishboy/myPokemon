package xyz.fishstar.mypokemon.ui.directory;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import xyz.fishstar.mypokemon.R;

public class DirectoryFragment extends Fragment {

    private DirectoryViewModel directoryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        directoryViewModel =
                ViewModelProviders.of(this).get(DirectoryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_directory, container, false);
        final TextView textView = root.findViewById(R.id.text_directory);
        directoryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}