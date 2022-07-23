package kodojo.gigchannel.component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayout
import com.google.android.material.textfield.TextInputEditText
import kodojo.gigchannel.R


class PostFragment : Fragment()
{
   private val TAG : String = "===FFF >>>>>  POST FRAGMENT  <<<<< KKK===";
   
   private lateinit var navCon : NavController;

    private lateinit var post_btn: Button;
    private lateinit var cancel_btn: Button;

    private lateinit var gig_title: TextInputEditText;
    private lateinit var gig_fone: TextInputEditText;
    private lateinit var gig_email: TextInputEditText;
    private lateinit var gig_descrip: TextInputEditText;

   // >>>>>>>  _______.-.________ ........
   override fun onCreate(savedInstanceState: Bundle?)
   {
	  super.onCreate(savedInstanceState);
	  navCon = (findNavController()?: null) as NavController;
   }
   // >>>>>>>  _______.-.________ ........
   override fun onCreateView(
	  inflater: LayoutInflater, container: ViewGroup?,
	  savedInstanceState: Bundle?
   ): View?
   {
	  // Inflate the layout for this fragment
	  return inflater.inflate(R.layout.frag_post, container, false)
   }
    // ==========  .....------------......... #########
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState);

        // -------- ###### $$$ #########
        gig_title = view.findViewById(R.id.post_title);
        gig_fone = view.findViewById(R.id.post_fone);
        gig_email = view.findViewById(R.id.post_email);
        gig_descrip = view.findViewById(R.id.post_descp);
        // -------- ###### $$$ #########
        post_btn = view.findViewById(R.id.post_post_btn);
        cancel_btn = view.findViewById(R.id.post_cancel_btn);
        // -------- ###### $$$ #########
        // -------- ###### $$$ #########
        post_btn.setOnClickListener{

        }
        cancel_btn.setOnClickListener{
            navCon.navigate(R.id.entryFragment);
        }

    }
}