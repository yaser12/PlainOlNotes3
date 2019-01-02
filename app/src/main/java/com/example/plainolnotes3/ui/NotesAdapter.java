package com.example.plainolnotes3.ui;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.plainolnotes3.R;
import com.example.plainolnotes3.database.NoteEntity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotesAdapter extends RecyclerView.Adapter <NotesAdapter.ViewHolder>{
    private final List<NoteEntity> mNotes;
    private final AppCompatActivity mContext;

    public NotesAdapter(List<NoteEntity> mNotes, AppCompatActivity mContext) {
        this.mNotes = mNotes;
        this.mContext = mContext;
        Log.d("NotesAdapter","NotesAdapter,getItemCount="+getItemCount());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.note_list_item,parent,false);
        Log.d("NotesAdapter","onCreateViewHolder,getItemCount="+getItemCount());
        return  new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final NoteEntity note=mNotes.get(position);
        holder.mtTextView.setText(note.getText());
        Log.d("NotesAdapter","onBindViewHolder,getItemCount="+getItemCount());

    }

    @Override
    public int getItemCount() {
        return mNotes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
         @BindView(R.id.note_text)         TextView mtTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
         //   mtTextView=(TextView)mContext.findViewById(R.id.note_text);
            Log.d("NotesAdapter","ViewHolder");
        }
    }
}
