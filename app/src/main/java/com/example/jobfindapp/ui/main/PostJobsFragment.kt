package com.example.jobfindapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.jobfindapp.R


/**
 * A simple [Fragment] subclass.
 * Use the [PostJobsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PostJobsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post_jobs, container, false)
    }


}
