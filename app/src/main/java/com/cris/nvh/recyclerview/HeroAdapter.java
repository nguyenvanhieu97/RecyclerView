package com.cris.nvh.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {
	private int[] mImageResources = {R.drawable.batman, R.drawable.captain, R.drawable.deadpool,
			R.drawable.flash, R.drawable.hulk, R.drawable.wolverine, R.drawable.superman,
			R.drawable.spiderman, R.drawable.venom, R.drawable.thor};
	private String[] mHeroNames = {"Batman", "Captain America", "Deadpool", "Flash", "Hulk",
			"Wolverine", "Superman", "Spiderman", "Venom", "Thor"};

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
		View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.viewholder, viewGroup, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder myViewHolder, int i) {
		myViewHolder.bindData(i);
	}

	@Override
	public int getItemCount() {
		return mImageResources != null ? mImageResources.length : 0;
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		private ImageView mImageView;
		private TextView mTextView;

		public ViewHolder(@NonNull View itemView) {
			super(itemView);
			mImageView = (ImageView) itemView.findViewById(R.id.image_view);
			mTextView = (TextView) itemView.findViewById(R.id.text_view);
		}

		public void bindData(int position) {
			mTextView.setText(mHeroNames[position]);
			mImageView.setImageResource(mImageResources[position]);
		}
	}
}
