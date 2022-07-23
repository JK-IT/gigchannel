package kodojo.gigchannel.component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import kodojo.gigchannel.R

class GigFragment : Fragment() {

   private val TAG : String = "===FFF >>>>>  GIG FRAGMENT  <<<<< KKK===";
    private lateinit var navcon : NavController;
    // ==========  .....------------......... #########
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        navcon = findNavController();
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag_gig, container, false)
    }

}