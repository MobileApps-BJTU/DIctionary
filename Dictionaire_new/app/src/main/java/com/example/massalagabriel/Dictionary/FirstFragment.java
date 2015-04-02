package com.example.massalagabriel.Dictionary;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FirstFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class FirstFragment extends ListFragment {

    private static String[] ListItems =  {
        "Graphic Design",
         "Programmer",
         "RAM",
         "Software",
         "Java",
         "Python"


    };

    private OnFragmentInteractionListener mListener;// ce le contrat entre l'activite et le fragment

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ArrayAdapter<String> list = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1,ListItems
        );
        setListAdapter(list);
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event

    @Override
    public void onListItemClick (ListView l, View v, int position, long id) {
        if (mListener != null) {
            mListener.sendPositionToFragment2(position);//
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
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
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {//

        void onBackPresse();

        // TODO: Update argument type and name
        public void onFragment1ListItemClicked(int position);

        void sendPositionToFragment2(int position);
    }

}
