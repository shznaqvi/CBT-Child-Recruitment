package edu.aku.hassannaqvi.cbt_child_recruitment.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.cbt_child_recruitment.AndroidDatabaseManager;
import edu.aku.hassannaqvi.cbt_child_recruitment.AppMain;
import edu.aku.hassannaqvi.cbt_child_recruitment.DatabaseHelper;
import edu.aku.hassannaqvi.cbt_child_recruitment.R;
import edu.aku.hassannaqvi.cbt_child_recruitment.contracts.HFacilitiesContract;
import edu.aku.hassannaqvi.cbt_child_recruitment.contracts.LHWsContract;
import edu.aku.hassannaqvi.cbt_child_recruitment.contracts.TehsilsContract;
import edu.aku.hassannaqvi.cbt_child_recruitment.getclasses.GetHFacilities;
import edu.aku.hassannaqvi.cbt_child_recruitment.getclasses.GetLHWs;
import edu.aku.hassannaqvi.cbt_child_recruitment.getclasses.GetTehsil;
import edu.aku.hassannaqvi.cbt_child_recruitment.getclasses.GetUCs;
import edu.aku.hassannaqvi.cbt_child_recruitment.getclasses.GetUsers;
import edu.aku.hassannaqvi.cbt_child_recruitment.getclasses.GetVillages;
import edu.aku.hassannaqvi.cbt_child_recruitment.syncclasses.SyncForms;
import edu.aku.hassannaqvi.cbt_child_recruitment.syncclasses.SyncIMs;

public class MainActivity extends Activity {

    public static String TAG = MainActivity.class.getSimpleName();
    public List<String> lhwName;
    String dtToday = new SimpleDateFormat("dd-MM-yy HH:mm").format(new Date().getTime());
    @BindView(R.id.adminsec)
    LinearLayout adminsec;
    @BindView(R.id.recordSummary)
    TextView recordSummary;
    @BindView(R.id.clusterNo)
    EditText clusterNo;
    @BindView(R.id.MN01)
    Spinner mN01;
    @BindView(R.id.MN02)
    Spinner mN02;
    @BindView(R.id.MN03)
    Spinner mN03;
    Map<String, String> tehsils, lhws;
    DatabaseHelper db;
    private String rSumText = "";

    List<String> hfCodes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // Reset working variables
        AppMain.mnb1 = "Test";
        AppMain.chCount = 0;
        AppMain.chTotal = 0;

        if (AppMain.admin) {
            adminsec.setVisibility(View.VISIBLE);
        } else {
            adminsec.setVisibility(View.GONE);
        }


        db = new DatabaseHelper(this);
        //Collection<FormsContract> todaysForms = new ArrayList<>();

        //todaysForms = db.getTodayForms();

        rSumText += "TODAY'S RECORDS SUMMARY\r\n";
        rSumText += "=======================";
        rSumText += "\r\n\r\n";
        //rSumText += "Total Forms Today: " + todaysForms.size();
        rSumText += "\r\n";
        rSumText += "    Forms List: \r\n";
        String iStatus = "";
//        for (FormsContract fc : todaysForms) {
//
//            switch (fc.getiStatus()) {
//                case "1":
//                    iStatus = "Complete";
//                    break;
//                case "2":
//                    iStatus = "House Locked";
//                    break;
//                case "3":
//                    iStatus = "Refused";
//                    break;
//                case "4":
//                    iStatus = "Refused";
//                    break;
//            }
//
//            rSumText += fc.getLhwCode() + " " + fc.getHouseHold() + " " + iStatus;
//            rSumText += "\r\n";
//
//        }

        rSumText += "--------------------------------------------------\r\n";
        if (AppMain.admin) {
            adminsec.setVisibility(View.VISIBLE);
            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            rSumText += "Last Update: " + syncPref.getString("LastUpdate", "Never Updated");
            rSumText += "\r\n";
            rSumText += "Last Synced(DB): " + syncPref.getString("LastSyncDB", "Never Synced");
            rSumText += "\r\n";
        }
        recordSummary.setText(rSumText);

        //        Sync Spinners

        AppMain.fc = null;

        // Spinner Drop down elements
        tehsils = new HashMap<>();
        final List<String> Tname = new ArrayList<>();
        Collection<TehsilsContract> Tc = db.getAllTehsil();
        Log.d(TAG, "onCreate: " + Tc.size());
        for (TehsilsContract hf : Tc) {
            tehsils.put(hf.getTehsil_name(), hf.getTehsil_code());
            Tname.add(hf.getTehsil_name());
        }

        mN01.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Tname));

        final List<String> hfCodes = new ArrayList<>();

        mN01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Spinner Drop down elements
                List<String> hfNames = new ArrayList<>();

                AppMain.tehsilCode = tehsils.get(Tname.get(position));

                Collection<HFacilitiesContract> hfc = db.getAllHFacilitiesByTehsil(AppMain.tehsilCode);
                Log.d(TAG, "onCreate: " + hfc.size());
                for (HFacilitiesContract hf : hfc) {
                    hfNames.add(hf.gethFacilityName());
                    hfCodes.add(hf.gethFacilityCode());
                }

                // attaching data adapter to spinner
                mN02.setAdapter(new ArrayAdapter<>(getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item, hfNames));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mN02.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                AppMain.hfCode = hfCodes.get(position);

                lhwName = new ArrayList<String>();
                lhws = new HashMap<String, String>();
                Collection<LHWsContract> lhwc = db.getAllLhwsByHf(hfCodes.get(position));
                for (LHWsContract lhw : lhwc) {
                    lhws.put("" + (lhw.getLHWName() + " (" + lhw.getLHWCode() + ")"), lhw.getLHWCode());
                    lhwName.add(lhw.getLHWName() + " (" + lhw.getLHWCode() + ")");
                }
                ArrayAdapter<String> psuAdapter = new ArrayAdapter<>(getBaseContext(),
                        android.R.layout.simple_spinner_dropdown_item, lhwName);

                psuAdapter
                        .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mN03.setAdapter(psuAdapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        mN03.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                AppMain.lhwCode = lhws.get(lhwName.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void openForm(View v) {
        Intent oF = new Intent(this, SectionAActivity.class);
        startActivity(oF);
    }

    public void openA(View v) {
        Intent iA = new Intent(this, SectionAActivity.class);
        startActivity(iA);
    }

    public void openB(View v) {
        Intent iB = new Intent(this, SectionBActivity.class);
        startActivity(iB);
    }

    /*public void openC(View v) {
        Intent iC = new Intent(this, SectionCActivity.class);
        startActivity(iC);
    }

    public void openD(View v) {
        Intent iD = new Intent(this, SectionDActivity.class);
        startActivity(iD);
    }

    public void openE(View v) {
        Intent iD = new Intent(this, SectionEActivity.class);
        startActivity(iD);
*/    //}

    public void openF(View v) {
        Intent iD = new Intent(this, SectionFActivity.class);
        startActivity(iD);
    }

   /* public void openIM(View v) {
        Intent iIM = new Intent(this, SectionIMActivity.class);
        startActivity(iIM);
    }*/

    public void openG(View v) {
        Intent iG = new Intent(this, SectionGActivity.class);
        startActivity(iG);
    }

    public void openEnd(View v) {
        Intent iEnd = new Intent(this, EndingActivity.class);
        startActivity(iEnd);
    }

    public void openDB(View v) {
        Intent dbmanager = new Intent(getApplicationContext(), AndroidDatabaseManager.class);
        startActivity(dbmanager);
    }

    /*public void CheckCluster(View v) {
        Intent cluster_list = new Intent(getApplicationContext(), FormsList.class);
        cluster_list.putExtra("clusterno", clusterNo.getText().toString());
        startActivity(cluster_list);

    }*/
    public void syncServer(View view) {

        String formsUrl = AppMain.PROJECT_URI + "cash_basedtransferchildrecruitment/api/forms.php";
        String imsUrl = AppMain.PROJECT_URI + "cash_basedtransferchildrecruitment/api/ims.php";

        // Require permissions INTERNET & ACCESS_NETWORK_STATE
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(getApplicationContext(), "Syncing Forms", Toast.LENGTH_SHORT).show();
            new SyncForms(this).execute();

            Toast.makeText(getApplicationContext(), "Syncing IMs", Toast.LENGTH_SHORT).show();
            new SyncIMs(this).execute();
            Toast.makeText(getApplicationContext(), "Syncing IMs", Toast.LENGTH_SHORT).show();

            SharedPreferences syncPref = getSharedPreferences("SyncInfo", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = syncPref.edit();

            editor.putString("LastSyncServer", dtToday);

            editor.apply();

        } else {
            Toast.makeText(this, "No network connection available.", Toast.LENGTH_SHORT).show();
        }

    }

    public void syncDevice(View view) {
        if (isNetworkAvailable()) {

            syncData sync =new syncData(this);
            sync.execute();
        }
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private boolean isHostAvailable() {

        if (isNetworkAvailable()) {
            try {
                SocketAddress sockaddr = new InetSocketAddress(AppMain._IP, AppMain._PORT);
                // Create an unbound socket
                Socket sock = new Socket();

                // This method will block no more than timeoutMs.
                // If the timeout occurs, SocketTimeoutException is thrown.
                int timeoutMs = 2000;   // 2 seconds
                sock.connect(sockaddr, timeoutMs);
                return true;
            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "Server Not Available for Update", Toast.LENGTH_SHORT).show();
                return false;
            }

        } else {
            Toast.makeText(getApplicationContext(), "Network not available for Update", Toast.LENGTH_SHORT).show();
            return false;

        }
    }


    public class syncData extends AsyncTask<String, String, String> {

        private Context mContext;

        public syncData(Context mContext) {
            this.mContext = mContext;
        }

        @Override
        protected String doInBackground(String... strings) {
            runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    GetUsers us = new GetUsers(mContext);
                    Toast.makeText(mContext, "Syncing Users", Toast.LENGTH_SHORT).show();
                    us.execute();

                    GetTehsil gt = new GetTehsil(mContext);
                    Toast.makeText(mContext, "Syncing Tehsils", Toast.LENGTH_SHORT).show();
                    gt.execute();

                    GetVillages gv = new GetVillages(mContext);
                    Toast.makeText(mContext, "Syncing Villages", Toast.LENGTH_SHORT).show();
                    gv.execute();

                    GetUCs gu = new GetUCs(mContext);
                    Toast.makeText(mContext, "Syncing Ucs", Toast.LENGTH_SHORT).show();
                    gu.execute();

                    GetHFacilities gh = new GetHFacilities(mContext);
                    Toast.makeText(mContext, "Syncing Health Facilities", Toast.LENGTH_SHORT).show();
                    gh.execute();

                    GetLHWs gp = new GetLHWs(mContext);
                    Toast.makeText(mContext, "Syncing LHWs", Toast.LENGTH_SHORT).show();
                    gp.execute();

                    SharedPreferences syncPref = getSharedPreferences("SyncInfo(DOWN)", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = syncPref.edit();

                    editor.putString("LastSyncDevice", dtToday);

                    editor.apply();
                }
            });


            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {

                    //        Sync Spinners

                    AppMain.fc = null;

                    // Spinner Drop down elements
                    tehsils = new HashMap<>();
                    final List<String> Tname = new ArrayList<>();
                    Collection<TehsilsContract> Tc = db.getAllTehsil();
                    Log.d(TAG, "onCreate: " + Tc.size());
                    for (TehsilsContract hf : Tc) {
                        tehsils.put(hf.getTehsil_name(), hf.getTehsil_code());
                        Tname.add(hf.getTehsil_name());
                    }

                    mN01.setAdapter(new ArrayAdapter<>(mContext, android.R.layout.simple_spinner_dropdown_item, Tname));

                    mN01.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            // Spinner Drop down elements
                            List<String> hfNames = new ArrayList<>();

                            hfCodes = new ArrayList<>();

                            AppMain.tehsilCode = tehsils.get(Tname.get(position));

                            Collection<HFacilitiesContract> hfc = db.getAllHFacilitiesByTehsil(AppMain.tehsilCode);
                            Log.d(TAG, "onCreate: " + hfc.size());
                            for (HFacilitiesContract hf : hfc) {
                                hfNames.add(hf.gethFacilityName());
                                hfCodes.add(hf.gethFacilityCode());
                            }

                            // attaching data adapter to spinner
                            mN02.setAdapter(new ArrayAdapter<>(mContext,
                                    android.R.layout.simple_spinner_dropdown_item, hfNames));
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                    mN02.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            AppMain.hfCode = hfCodes.get(position);

                            lhwName = new ArrayList<String>();
                            lhws = new HashMap<String, String>();
                            Collection<LHWsContract> lhwc = db.getAllLhwsByHf(hfCodes.get(position));
                            for (LHWsContract lhw : lhwc) {
                                lhws.put("" + (lhw.getLHWName() + " (" + lhw.getLHWCode() + ")"), lhw.getLHWCode());
                                lhwName.add(lhw.getLHWName() + " (" + lhw.getLHWCode() + ")");
                            }
                            ArrayAdapter<String> psuAdapter = new ArrayAdapter<>(mContext,
                                    android.R.layout.simple_spinner_item, lhwName);

                            psuAdapter
                                    .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                            mN03.setAdapter(psuAdapter);

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                    mN03.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            AppMain.lhwCode = lhws.get(lhwName.get(position));
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }
            },1200);
        }
    }
}
