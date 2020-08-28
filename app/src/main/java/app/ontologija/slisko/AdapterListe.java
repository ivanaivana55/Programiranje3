package app.ontologija.slisko;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class AdapterListe extends RecyclerView.Adapter<AdapterListe.Red> {

    private List<Ontologija> podaci;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterListe(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        View view = mInflater.inflate(R.layout.red_liste, roditelj, false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(Red red, int position) {
        Ontologija i = podaci.get(position);
        red.sifra.setText(String.valueOf(i.getSifra()));
        red.izvodac.setText(i.getIzvodac());
        red.simfonijski_orkestar.setText(i.getSimfonijskiOrkestar());
        red.nalaziSeU.setText(i.getNalaziSeU());;
        red.dobilaJe.setText(i.getDobilaJe());
        red.brojIzvedbi.setText(String.valueOf(i.getBrojIzvedbi()));
        red.mjesec.setText(i.getMjesec());
    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }

    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView sifra;
        private TextView izvodac;
        private TextView simfonijski_orkestar;
        private TextView nalaziSeU;
        private TextView dobilaJe;
        private TextView brojIzvedbi;
        private TextView mjesec;

        Red(View itemView) {
            super(itemView);
            sifra = itemView.findViewById(R.id.sifra);
            izvodac = itemView.findViewById(R.id.izvodac);
            simfonijski_orkestar = itemView.findViewById(R.id.simfonijski_orkestar);
            dobilaJe = itemView.findViewById(R.id.dobilaJe);
            nalaziSeU = itemView.findViewById(R.id.nalaziSeU);
            brojIzvedbi = itemView.findViewById(R.id.brojIzvedbi);
            mjesec = itemView.findViewById(R.id.mjesec);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public Ontologija getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Ontologija> itemList) {
        this.podaci = itemList;
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
