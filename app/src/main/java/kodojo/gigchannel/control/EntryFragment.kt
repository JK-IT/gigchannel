package kodojo.gigchannel.control

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import kodojo.gigchannel.R
import kotlinx.coroutines.delay


class EntryFragment : Fragment()
{

    private val TAG: String = "===FFF >>>>>  ENTRY FRAGMENT  <<<<< KKK===";
        // #### -----
    private lateinit var navController: NavController;
    private lateinit var post_btn: Button;
    private lateinit var gigs_btn: Button;
    private lateinit var profile_btn: Button;
    
        // #### -----
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        navController=findNavController();
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_entry, container, false)
    }
    
    override fun onViewCreated(v: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(v, savedInstanceState);
        // #### -----
        post_btn = v.findViewById(R.id.entryfrag_post_btn);
        // #### -----
        gigs_btn = v.findViewById(R.id.entryfrag_gig_btn);
        // #### -----
        profile_btn = v.findViewById(R.id.entryfrag_profile_btn);
        // #### ----- assigning functions to views
        post_btn.setOnClickListener {
            navController.navigate(R.id.postFragment);
        }
        // ==========  .....------------......... #########
        gigs_btn.setOnClickListener{
            navController.navigate(R.id.gigFragment);
        }
    }

        // #### -----
    
}