package com.example.hotelafisha.ui.registration

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hotelafisha.R

class RegistrationProfileFragment : Fragment() {

    companion object {
        fun newInstance() = RegistrationProfileFragment()
    }

    private lateinit var viewModel: RegistrationProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_registration_profile, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegistrationProfileViewModel::class.java)
        // TODO: Use the ViewModel
    }

}