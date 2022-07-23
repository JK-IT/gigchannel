package kodojo.gigchannel.component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayout
import kodojo.gigchannel.R


class PostFragment : Fragment()
{
   private val TAG : String = "===FFF >>>>>  POST FRAGMENT  <<<<< KKK===";
   
   private lateinit var navCon : NavController;
   
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
   
}