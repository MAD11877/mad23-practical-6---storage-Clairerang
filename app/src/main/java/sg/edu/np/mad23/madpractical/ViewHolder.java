package sg.edu.np.mad23.madpractical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView Name;
    TextView Description;
    ImageView profilepicture;

    public ViewHolder(View v) {
        super(v);
        profilepicture = v.findViewById(R.id.profilepic);
        Name = itemView.findViewById(R.id.username);
        Description = itemView.findViewById(R.id.Descript);
    }
}