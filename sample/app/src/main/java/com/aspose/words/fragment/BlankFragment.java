/**
 *   Copyright (c) 2018 Aspose.Words for Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.aspose.words.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.aspose.asposewordscloudandroid.ApiException;
import com.aspose.asposewordscloudandroid.api.WordsApi;
import com.aspose.asposewordscloudandroid.model.HttpStatusCode;
import com.aspose.asposewordscloudandroid.model.AsposeResponse;
import com.aspose.words.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BlankFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment
{

    private WordsApi wordsApi;

    private Handler handler = new Handler();
    private Button btnInvoke;
    private EditText etName;
    private EditText etFolder;
    private ProgressBar pbInvoking;
    private TextView tvResult;
    private TextView tvResponse;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }

    private void init(View rootView)
    {
        btnInvoke = rootView.findViewById(R.id.btnInvoke);
        etName = rootView.findViewById(R.id.etName);
        etFolder = rootView.findViewById(R.id.etFolder);
        pbInvoking = rootView.findViewById(R.id.pbInvoking);
        tvResult = rootView.findViewById(R.id.tvResult);
        tvResponse = rootView.findViewById(R.id.tvResponse);

        wordsApiInit(rootView);

        btnInvoke.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                btnInvoke.setVisibility(View.GONE);
                pbInvoking.setVisibility(View.VISIBLE);
                tvResult.setVisibility(View.GONE);

                tvResult.setText("ERROR");
                tvResult.setTextColor(Color.RED);

                new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        try
                        {
                            final AsposeResponse response = wordsApi.putCreateDocument(etName.getText().toString(), null, null, null,
                                    null, etFolder.getText().toString(), null, null);

                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    if (response.getCode() == HttpStatusCode.OK)
                                    {
                                        tvResult.setText("SUCCESS");
                                        tvResult.setTextColor(Color.GREEN);
                                    }
                                    else
                                    {
                                        //tvResult.setText("ERROR");
                                        //tvResult.setTextColor(Color.RED);
                                    }
                                    tvResponse.setText(response.toString());
                                }
                            });


                        }
                        catch (ApiException e)
                        {
                            e.printStackTrace();
                            tvResponse.setText(e.getMessage());
                        }
                        finally {
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    //btnInvoke.setVisibility(View.VISIBLE);
                                    pbInvoking.setVisibility(View.GONE);
                                    tvResult.setVisibility(View.VISIBLE);
                                }
                            });
                        }

                    }
                }).start();
            }
        });


    }

    private void wordsApiInit(View rootView)
    {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(rootView.getContext());

        String appKey = prefs.getString(rootView.getContext().getString(R.string.pref_key_app_key), null);
        String appSID = prefs.getString(rootView.getContext().getString(R.string.pref_key_app_sid), null);
        String basePath = prefs.getString(rootView.getContext().getString(R.string.pref_key_base_path), "http://api-dev.aspose.cloud/v1.1");

        if (appKey == null || appSID == null)
        {
            btnInvoke.setVisibility(View.GONE);
            tvResult.setTextColor(Color.RED);
            tvResult.setVisibility(View.VISIBLE);
            tvResult.setText("Please set AppSid and AppKey");
        }

        wordsApi = new WordsApi();
		ApiClient apiClient = wordsApi.getApiClient();
        apiClient.setAppKey(appKey).setAppSid(appSID).setBasePath(basePath);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        init(rootView);
        // Inflate the layout for this fragment
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
