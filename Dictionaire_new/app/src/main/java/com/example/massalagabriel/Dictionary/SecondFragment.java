package com.example.massalagabriel.Dictionary;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "position";

    private int position;



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param position Parameter 1.
     *
     * @return A new instance of fragment SecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(int position) {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();// passer les valeur entre fragments
        args.putInt(ARG_PARAM1, position);// la posiitoin sera put into a bundle
        fragment.setArguments(args);
        return fragment;
    }

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_second, container, false);
        TextView myTextView = (TextView) myView.findViewById(R.id.result);
        //set the value of the text view to include the position
        if (position+1 == 1){
            myTextView.setText("Graphic design (n.), also known as communication design, is the art and practice of planning and projecting ideas and experiences with visual and textual content" );// pour incrementer quand on clique


        }else if (position+1 ==2){

            myTextView.setText("A programmer  (redirected from programer) n,  is a person who writes computer programs, a person who programs a device, especially a computer. " );// pour incrementer quand on clique


        }else if (position+1 ==3){

            myTextView.setText(" RAM is the most common type of memory found in computers and other devices, such as printers.");

        }else if (position+1 ==4) {

            myTextView.setText("Software means computer instructions or data. Anything that can be stored electronically is software, in contrast to storage devices and display devices which are called hardware.");

        }else if (position+1 ==5) {

            myTextView.setText("Java is a programming language and computing platform first released by Sun Microsystems in 1995." +
                    " It is is a general-purpose computer programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible");

        }else if (position+1 ==6) {

            myTextView.setText("Python is a programming language that is freely available and that makes solving a computer problem almost as easy as writing out one's thoughts about the solution.");

        }


        return myView;
    }


}
