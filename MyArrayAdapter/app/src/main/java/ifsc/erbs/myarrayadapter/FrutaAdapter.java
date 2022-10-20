package ifsc.erbs.myarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FrutaAdapter extends ArrayAdapter<Fruta> {
    Context mcontext;
    int mResource;
    public FrutaAdapter(@NonNull Context context, int resource, @NonNull Fruta[] objects) {
        super(context, resource, objects);
        mcontext = context;
        mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        //inflar layout
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
        view = layoutInflater.inflate(mResource, parent, false);

        //recuperando dado do array de objetos

        Fruta fruta = getItem(position);
        
        //Associar as views

        TextView tvNome = view.findViewById(R.id.textViewNome);
        ImageView fotinha = view.findViewById(R.id.imageView);
        tvNome.setText(fruta.getNome());
        fotinha.setImageResource(fruta.getImagem());


        return view;
    }
}
