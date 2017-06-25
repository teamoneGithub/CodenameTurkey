package com.example.android.hackathon;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {
    private static final String jsonString = "{\"Sheet1\":[{\"Name\":\"Drewskis\",\"Type\":\"American\",\"Status\":1,\"Menu\":\"http://drewskis.com/wp-content/uploads/2013/02/Drewski-revised-full-menu-Jan-2017-2.png\",\"Image\":\"https://roaminghunger.com/img/trucks/original/4ec94f80-c288-4c85-b033-288e46204482.jpg\",\"Lat\":38.573713,\"Lon\":-121.497451},{\"Name\":\"Cousins Maine Lobster\",\"Type\":\"Seafood\",\"Status\":1,\"Menu\":\"https://www.cousinsmainelobster.com/sacramento/wp-content/uploads/sites/3/2014/11/SACRAMENTOFINAL.jpg\",\"Image\":\"https://wanderingsheppard.files.wordpress.com/2015/03/cousins-maine-lobster-raleigh.jpg\",\"Lat\":38.575583,\"Lon\":-121.493546},{\"Name\":\"Chando's Tacos\",\"Type\":\"Mexican\",\"Status\":1,\"Menu\":\"https://s3-media2.fl.yelpcdn.com/bphoto/GbQF5188owtTFT5kb-aSdA/o.jpg\",\"Image\":\"https://s3-media2.fl.yelpcdn.com/bphoto/1-UjDqDoCcuIlf0FZnrmyQ/o.jpg\",\"Lat\":38.570432,\"Lon\":-121.503182},{\"Name\":\"Squeeze Inn\",\"Type\":\"American\",\"Status\":0,\"Menu\":\"https://s3-media1.fl.yelpcdn.com/bphoto/M4fdh1NypZt_a8KKXizxDw/o.jpg\",\"Image\":\"https://roaminghunger.com/img/trucks/original/507ee840-ed3c-4284-b0cc-3e1446204482.jpg\",\"Lat\":38.566942,\"Lon\":-121.502486},{\"Name\":\"RC Pizza Wagon\",\"Type\":\"Pizza\",\"Status\":0,\"Menu\":\"https://pbs.twimg.com/media/CRu0HO6UkAAHtUG.jpg\",\"Image\":\"http://rcpizzawagon.com/wp-content/uploads/photo-018.jpg\",\"Lat\":38.57168,\"Lon\":-121.489267},{\"Name\":\"Cowtown Creamery\",\"Type\":\"Desserts\",\"Status\":1,\"Menu\":\"https://img1.etsystatic.com/064/1/7640213/il_570xN.785720823_mmrj.jpg\",\"Image\":\"http://nebula.wsimg.com/984ee11b2c099d66d63f96137ed2d0dc?AccessKeyId=4213DB90F6D0621F4520&disposition=0&alloworigin=1\",\"Lat\":38.576161,\"Lon\":-121.496966},{\"Name\":\"Wondering Boba\",\"Type\":\"Filipino\",\"Status\":0,\"Menu\":\"https://s3-media1.fl.yelpcdn.com/bphoto/FOBDEeLWHNn7sVSXXIvYAA/o.jpg\",\"Image\":\"https://roaminghunger.com/img/trucks/original/541241e4-d1e4-4bc4-99d0-791d46204482.jpg\",\"Lat\":38.584451,\"Lon\":-121.490179},{\"Name\":\"Gyro King\",\"Type\":\"Greek\",\"Status\":1,\"Menu\":\"http://image.zmenu.com/menupic/1882080/d889e274-9af7-43e4-855a-245acf1bea66.jpg\",\"Image\":\"https://roaminghunger.com/img/trucks/original/56a67d08-b9d4-4ba5-946f-2eaf46204482.jpg\",\"Lat\":38.58655,\"Lon\":-121.482924},{\"Name\":\"Bacon Mania\",\"Type\":\"American\",\"Status\":0,\"Menu\":\"http://baconmaniatruck.com/live/wp-content/uploads/BACON-MANia-Truck-Menu.jpg\",\"Image\":\"https://farm4.staticflickr.com/3850/14596215067_ab895b641c.jpg\",\"Lat\":38.581102,\"Lon\":-121.500021},{\"Name\":\"It's Nacho Truck\",\"Type\":\"Mexican\",\"Status\":1,\"Menu\":\"https://s3-media2.fl.yelpcdn.com/bphoto/TuOzMHeTsp7k9lNPS3nsFA/o.jpg\",\"Image\":\"https://s3-media1.fl.yelpcdn.com/bphoto/zTEPYrzTCeZbpusuAPT4NA/o.jpg\",\"Lat\":38.577793,\"Lon\":-121.462212},{\"Name\":\"The Salty Pineapple\",\"Type\":\"Hawaiian\",\"Status\":1,\"Menu\":\"https://www.slcmenu.com/wp/wp-content/uploads/2017/03/The-Salty-Pineapple-food-truck-menu.jpg\",\"Image\":\"https://static1.squarespace.com/static/588d7b36ebbd1aab3fb2fddc/t/58b46c14579fb351d16b3e5f/1488219190100/?format=2500w\",\"Lat\":38.57552,\"Lon\":-121.460202},{\"Name\":\"Taco Fresh\",\"Type\":\"Mexican\",\"Status\":0,\"Menu\":\"https://b.zmtcdn.com/data/menus/079/16934079/746002070c1b5c6d0a14095afed3bee3.jpg\",\"Image\":\"https://www.jupitermag.com/sites/default/files/wellington-food-truck-invasion-wellington-food-truck-area-shots-taco-fresh-04706_0.jpg\",\"Lat\":38.575059,\"Lon\":-121.463673},{\"Name\":\"Good Dog\",\"Type\":\"American\",\"Status\":1,\"Menu\":\"http://3.bp.blogspot.com/-TDs3DzmcJBE/T5OqQCBF0gI/AAAAAAAAAB4/-5i0mj8vhKo/s1600/Good+Dog+Pic+3.jpg\",\"Image\":\"https://roaminghunger.com/img/trucks/original/4e684eff-7300-4931-bb4e-417246204482.jpg\",\"Lat\":38.574263,\"Lon\":-121.469371},{\"Name\":\"Boston's Baddest Burger\",\"Type\":\"American\",\"Status\":1,\"Menu\":\"https://s-media-cache-ak0.pinimg.com/originals/0d/45/1c/0d451cfb4a7b03ff6af7b5fba29495e0.jpg\",\"Image\":\"http://www.bostonsbaddestburger.com/wp-content/uploads/2014/03/201403_Stratton_Mountain_Heineken_06.jpg\",\"Lat\":38.574263,\"Lon\":-121.469372},{\"Name\":\"Ducky's Grub\",\"Type\":\"American\",\"Status\":0,\"Menu\":\"http://foodtruckfiesta.com/wp-content/uploads/2012/07/duckys_menu_d.jpg\",\"Image\":\"http://1.bp.blogspot.com/-SL9FGrFmmIk/UU53-JQta6I/AAAAAAAAAwA/XCkYxEyKmNc/s1600/IMG_0829.JPG\",\"Lat\":38.574263,\"Lon\":-121.469373},{\"Name\":\"Dedo's\",\"Type\":\"Mediterranean\",\"Status\":1,\"Menu\":\"https://pbs.twimg.com/media/C-W65TdUAAAg1OH.jpg\",\"Image\":\"http://cdn.streetfoodapp.com/images/dedos/header/1-1.jpg\",\"Lat\":38.576426,\"Lon\":-121.497794},{\"Name\":\"Oh My Dog!\",\"Type\":\"American\",\"Status\":0,\"Menu\":\"https://s-media-cache-ak0.pinimg.com/736x/c8/48/78/c84878e0e25dc3026d1b168f2f0277df.jpg\",\"Image\":\"https://s3-media3.fl.yelpcdn.com/bphoto/aLZL1CvpEkUN70l2gnr8NA/o.jpg\",\"Lat\":38.579184,\"Lon\":-121.478875},{\"Name\":\"Blue Basil\",\"Type\":\"Vietnamese\",\"Status\":1,\"Menu\":\"http://austinfoodcarts.com/wp-content/uploads/2013/02/Blue-Basil-Trailer-Menu-1024x768.jpg\",\"Image\":\"https://bluebasilmobiledotcom.files.wordpress.com/2012/10/20150914_110346.jpg?w=624\",\"Lat\":38.579109,\"Lon\":-121.479531},{\"Name\":\"The Garbage Truck\",\"Type\":\"American\",\"Status\":1,\"Menu\":\"http://www.foodtruckmaps.com/img/menus/940/the_garbage_truck.jpg\",\"Image\":\"https://roaminghunger.com/img/trucks/original/576d9595-1c74-4e48-8941-143146204482.jpg\",\"Lat\":38.579419,\"Lon\":-121.478613}]}";

    private ArrayList<Truck> truckList;

    private class Truck {
        private String _name;
        private String _type;
        private boolean _status;
        private String _menu;
        private String _image;
        private double _lat;
        private double _long;
        private Drawable _icon;

        public void setName(String name) { _name = name; }
        public void setType(String type) { _type = type; }
        public void setStatus(boolean val) { _status = val; }
        public void setMenu(String val) { _menu = val; }
        public void setImage(String val) { _image = val; }
        public void setLat(double val) { _lat = val; }
        public void setLong(double val) { _long = val; }
        public void setIcon(int val) {
            try {
                _icon = getDrawable(val);
            } catch (Resources.NotFoundException ex) {
                ex.getMessage();
            }
        }

        public String getName() {return _name; }
        public String getType() {return _type; }
        public boolean getStatus() {return _status; }
        public String getMenu() {return _menu; }
        public String getImage() {return _image; }
        public double getLat() {return _lat; }
        public double getLong() {return _long; }
        public Drawable getIcon() { return _icon; }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        truckList = new ArrayList<Truck>();

        try {
            JSONObject jobj = new JSONObject(jsonString);
            JSONArray jarr  = jobj.getJSONArray("Sheet1");

            for (int i=0; i<jarr.length(); i++) {
                JSONObject json_data = jarr.getJSONObject(i);
                Truck temp = new Truck();
                temp.setName(json_data.getString("Name"));
                temp.setType(json_data.getString("Type"));
                temp.setMenu(json_data.getString("Menu"));
                temp.setStatus(json_data.getBoolean("Status"));
                temp.setImage(json_data.getString("Image"));
                temp.setLat(json_data.getDouble("Lat"));
                temp.setLong(json_data.getDouble("Lon"));

                switch (temp.getType()) {
                    case "Mexican":
                        temp.setIcon(R.drawable.taco_truck_marker);
                        break;
                    case "American":
                        temp.setIcon(R.drawable.burger_truck_marker);
                        break;
                    case "Desserts":
                        temp.setIcon(R.drawable.twinkie_truck_marker);
                        break;
                    case "Seafood":
                        temp.setIcon(R.drawable.twinkie_truck_marker);
                        break;
                    case "Pizza":
                        temp.setIcon(R.drawable.pizza_truck_marker);
                        break;
                    default:
                        temp.setIcon(R.drawable.spec_truck_marker);
                }

                truckList.add(i, temp);
            }




        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
