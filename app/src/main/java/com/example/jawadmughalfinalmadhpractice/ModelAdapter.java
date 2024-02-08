package com.example.jawadmughalfinalmadhpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
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


        holder.itemView.setOnClickListener(v -> {


            // first step for create alert box is create object
            AlertDialog.Builder deleteBuilder = new AlertDialog.Builder(context);
            deleteBuilder.setTitle("are your shower");


            deleteBuilder.setPositiveButton("delete" , ((dialog, which) -> {

                dummyDataList.remove(position);
                notifyItemRemoved(position);


            })).setNeutralButton("Cancel"  , ((dialog, which) -> {

            }));
            deleteBuilder.show();

        });
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
