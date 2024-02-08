package com.example.jawadmughalfinalmadhpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jawadmughalfinalmadhpractice.databinding.SingleModelBinding;

import java.util.ArrayList;

public class ModelAdapter  extends  RecyclerView.Adapter<ModelAdapter.ModelView>{

    ArrayList<Model> dummyDataList = new ArrayList<>();
    Context context;
    ModelAdapter(Context context  , ArrayList<Model> dummyDataList )
        {

            this.context = context;
            this.dummyDataList = dummyDataList;
        }

    @NonNull
    @Override
    public ModelView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item layout for the RecyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_model, parent, false);

        // Create a ModelView object with the inflated view
        ModelView modelView = new ModelView(view);

        return modelView;
    }

    @Override
    public void onBindViewHolder(@NonNull ModelView holder, int position) {

        holder.binding.modelName.setText(dummyDataList.get(position).getModelName());
        holder.binding.modelDescription.setText(dummyDataList.get(position).getModelDescription());
        holder.binding.modelImg.setImageResource(dummyDataList.get(position).getModelImg());
    }

    @Override
    public int getItemCount() {
        return dummyDataList.size();
    }

    public class ModelView extends RecyclerView.ViewHolder{


        SingleModelBinding binding;
        public ModelView(@NonNull View itemView) {
            super(itemView);

            binding = SingleModelBinding.bind(itemView);
        }
    }
}
