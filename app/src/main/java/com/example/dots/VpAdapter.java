package com.example.dots;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class VpAdapter extends FragmentStateAdapter {
    Integer size=3;
    public VpAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public BPfragment createFragment(int position) {
        return BPfragment.newInstance(position);
    }

    @Override
    public int getItemCount() {
        return size;
    }
}
