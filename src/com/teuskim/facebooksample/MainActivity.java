package com.teuskim.facebooksample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.teuskim.facebooksample.friendpicker.FriendPickerSampleActivity;
import com.teuskim.facebooksample.graphapi.GraphApiSampleActivity;
import com.teuskim.facebooksample.hellofacebook.HelloFacebookSampleActivity;
import com.teuskim.facebooksample.placepicker.PlacePickerSampleActivity;
import com.teuskim.facebooksample.profilepicture.ProfilePictureSampleActivity;
import com.teuskim.facebooksample.rps.RpsActivity;
import com.teuskim.facebooksample.scrumptious.ScrumptiousActivity;
import com.teuskim.facebooksample.sessionlogin.SessionLoginSampleActivity;
import com.teuskim.facebooksample.switchuser.SwitchUserActivity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		View.OnClickListener l = new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				switch (v.getId()) {
				case R.id.btn_friend_picker_sample:
					moveToActivity(FriendPickerSampleActivity.class);
					break;
					
				case R.id.btn_graph_api_sample:
					moveToActivity(GraphApiSampleActivity.class);
					break;
					
				case R.id.btn_hello_facebook_sample:
					moveToActivity(HelloFacebookSampleActivity.class);
					break;
					
				case R.id.btn_place_picker_sample:
					moveToActivity(PlacePickerSampleActivity.class);
					break;
					
				case R.id.btn_profile_picture_sample:
					moveToActivity(ProfilePictureSampleActivity.class);
					break;
					
				case R.id.btn_rps_sample:
					moveToActivity(RpsActivity.class);
					break;
					
				case R.id.btn_scrumptious_sample:
					moveToActivity(ScrumptiousActivity.class);
					break;
					
				case R.id.btn_session_login_sample:
					moveToActivity(SessionLoginSampleActivity.class);
					break;
					
				case R.id.btn_switch_user_sample:
					moveToActivity(SwitchUserActivity.class);
					break;
				}
			}
		};
		findViewById(R.id.btn_friend_picker_sample).setOnClickListener(l);
		findViewById(R.id.btn_graph_api_sample).setOnClickListener(l);
		findViewById(R.id.btn_hello_facebook_sample).setOnClickListener(l);
		findViewById(R.id.btn_place_picker_sample).setOnClickListener(l);
		findViewById(R.id.btn_profile_picture_sample).setOnClickListener(l);
		findViewById(R.id.btn_rps_sample).setOnClickListener(l);
		findViewById(R.id.btn_scrumptious_sample).setOnClickListener(l);
		findViewById(R.id.btn_session_login_sample).setOnClickListener(l);
		findViewById(R.id.btn_switch_user_sample).setOnClickListener(l);
	}
	
	private void moveToActivity(Class<?> cls) {
		startActivity(new Intent(getApplicationContext(), cls));
	}

}
