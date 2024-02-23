package com.coderfaysal.flower;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView it_recycle;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        it_recycle = findViewById(R.id.it_recycle);

        FLOWER();


        MyAdapter myAdapter = new MyAdapter();
        it_recycle.setAdapter(myAdapter);
        it_recycle.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }



    public void FLOWER(){

        hashMap = new HashMap<>();
        hashMap.put("img", "https://i.ibb.co/pRzLXhG/pexels-pixabay-46216.jpg");
        hashMap.put("title", "Sunflower");
        hashMap.put("desc", "Sunflower, (genus Helianthus), genus of nearly 70 species of herbaceous plants of the aster family (Asteraceae). Sunflowers are native primarily to North and South America, and some species are cultivated as ornamentals for their spectacular size and flower heads and for their edible seeds. The Jerusalem artichoke (Helianthus tuberosus) is cultivated for its edible underground tubers.\n Close-up of the head of a common sunflower (Helianthus annuus).\n The common sunflower (H. annuus) is an annual herb with a rough hairy stem 1–4.5 metres (3–15 feet) high and broad, coarsely toothed, rough leaves 7.5–30 cm (3–12 inches) long arranged in spirals. The attractive heads of flowers are 7.5–15 cm wide in wild specimens and often 30 cm or more in cultivated types. The disk flowers are brown, yellow, or purple, while the petallike ray flowers are yellow. The fruit is a single-seeded achene. Oilseed varieties typically have small black achenes, while those grown for direct seed consumption, known as confection varieties, have larger black-and-white achenes that readily separate from the seed within.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img", "https://i.ibb.co/ws1LCwt/pexels-pixabay-56866.jpg");
        hashMap.put("title", "Rose");
        hashMap.put("desc", "A rose is either a woody perennial flowering plant of the genus Rosa (/ˈroʊzə/),[2] in the family Rosaceae (/roʊˈzeɪsiːˌiː/),[2] or the flower it bears. There are over three hundred species and tens of thousands of cultivars.[citation needed] They form a group of plants that can be erect shrubs, climbing, or trailing, with stems that are often armed with sharp prickles.[3] Their flowers vary in size and shape and are usually large and showy, in colours ranging from white through yellows and reds. Most species are native to Asia, with smaller numbers native to Europe, North America, and northwestern Africa.[3] Species, cultivars and hybrids are all widely grown for their beauty and often are fragrant. Roses have acquired cultural significance in many societies. Rose plants range in size from compact, miniature roses, to climbers that can reach seven meters in height.[3] Different species hybridize easily, and this has been used in the development of the wide range of garden roses.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img", "https://i.ibb.co/6bVXW8s/pexels-erik-karits-15335258.jpg");
        hashMap.put("title", "Latus");
        hashMap.put("desc", "The lotus flower is an aquatic perennial. Sometimes mistaken for the water-lily, the lotus has a distinctively different structure. It also only comes in pink hues or white, whereas the lily comes in many different colors. The roots are implanted in the soil of a river or pond, and the leaves float on the surface. In some research reports, the lotus can control the temperature of itself just like humans and animals can.\nBack in Egyptians times, the lotus flower was very important in their religion. Meaning creation and rebirth, it was a symbol of the sun, because at nightfall it closes and goes beneath the water and at dawn it climbs up above the water and reopens. It was the only plant to flower and fruit at the same time, as it would emerge as pure white from the depths of the muddy swamp and grow above the water. One myth that revolves around the lotus is during creation time a giant lotus flower grew out of a pond and from it the sun rose. Also, throughout ancient Egypt the lotus has been pictured in various works of art.  It would act as a border to outline a section of artwork, or held in the hands of a god or human. The lotus was also used in their math, helping to count to high decrees. One lotus would act as 1,000 and two lotus as 2,000 and so on.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img", "https://i.ibb.co/7ks29Cd/pexels-pixabay-67857.jpg");
        hashMap.put("title", "Daisy");
        hashMap.put("desc", "Daisy, any of several species of flowering plants belonging to the aster family (Asteraceae). The name daisy commonly denotes the oxeye daisy (Leucanthemum vulgare), the Shasta daisy (L. ×superbum), and the English, or true, daisy (Bellis perennis). These and other plants called daisies are distinguished by a composite flower head composed of 15 to 30 white ray flowers surrounding a centre consisting of bright yellow disk flowers, though other colour combinations are common. The oxeye daisy is native to Europe and Asia but has become a common wild plant in the United States and elsewhere. This perennial grows to a height of about 60 cm (2 feet) and has oblong incised leaves and long petioles (leafstalks).");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img", "https://i.ibb.co/BBGM7Gw/pexels-indika-dissanayake-12903749.jpg");
        hashMap.put("title", "China Rose");
        hashMap.put("desc", "Chinese hibiscus, (Hibiscus rosa-sinensis), perennial species of hibiscus of the mallow family (Malvaceae), cultivated for its large brightly coloured flowers. Chinese hibiscus is the most common species of hibiscus and is grown as an ornamental hedge in tropical and subtropical regions worldwide. The origins of Chinese hibiscus are disputed; it is likely from Southeast Asia, though some authorities point to Vanuatu in Oceania or various other tropical regions. No wild populations of the plant have been found in modern times.");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("img", "https://i.ibb.co/qjZHGxY/pexels-shiebi-al-4666303.jpg");
        hashMap.put("title", "Marigold");
        hashMap.put("desc", "Marigold, (genus Tagetes), genus of about 50 species of annual herbs of the aster family (Asteraceae), native to southwestern North America, tropical America, and South America. The name marigold also refers to the pot marigold (genus Calendula) and unrelated plants of several families. Members of the genus Tagetes have attractive yellow, orange, or red composite flowers that are solitary on the stems or clustered. The leaves are arranged opposite each other on the stem and are usually finely cut. Characteristic bracts (leaflike structures) form a cup-shaped base below each flower head.");
        arrayList.add(hashMap);





    }


    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.items, parent, false);

            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String imagesURL = hashMap.get("img");
            String name = hashMap.get("title");
            String dec = hashMap.get("desc");

            holder.it_name.setText(name);
            Picasso.get().load(imagesURL).into(holder.it_img);

            holder.click_lay.setOnClickListener(view -> {

                    Details.TITLE = name;
                    Details.IMAGE = imagesURL;
                    Details.DESC = dec;
                    startActivity(new Intent(MainActivity.this, Details.class));

            });

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class MyViewHolder extends RecyclerView.ViewHolder{

            LinearLayout click_lay;
            ImageView it_img;
            TextView it_name;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                click_lay = itemView.findViewById(R.id.click_lay);
                it_img = itemView.findViewById(R.id.it_img);
                it_name = itemView.findViewById(R.id.it_name);


            }
        }

    }


}