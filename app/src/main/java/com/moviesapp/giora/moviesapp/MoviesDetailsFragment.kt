package com.moviesapp.giora.moviesapp

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class MoviesDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = MoviesDetailsFragment()
    }

    private lateinit var viewModel: MoviesDetailsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.movies_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MoviesDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
