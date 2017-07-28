package com.bignerdranch.android.criminalintent;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.FileProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.File;
import java.util.UUID;


public class CrimePictureDetailFragment extends DialogFragment {

    private Crime mCrime;
    private ImageView mCrimeImage;
    private File mPhotoFile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        UUID crimeId = mCrime.getId();
        mCrime = CrimeLab.get(getActivity()).getCrime(crimeId);
        mPhotoFile = CrimeLab.get(getActivity()).getPhotoFile(mCrime);

        Uri uri = FileProvider.getUriForFile(getActivity(),
                "com.bignerdranch.android.criminalintent.fileprovider",
                mPhotoFile);

        View rootView = inflater.inflate(R.layout.fragment_detail_display, container, false);
        getDialog().setTitle(R.string.crime_report_subject);


        mCrimeImage = rootView.findViewById(R.id.crime_photo_detail);
        mCrimeImage.setImageURI(uri);


        return rootView;
    }
}
