package cg.ltenshi.app.lomi.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.animation.DecelerateInterpolator;
import cg.ltenshi.app.lomi.*;

import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Activity_Splash extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_splash);

		showSplash();
		
		new Handler().postDelayed(() -> {
			//overridePendingTransition(android.R.anim.slide_in, android.R.anim.slide_out);
			startActivity(new Intent(this, MainActivity.class));
		}, 3000);
	}

	private void showSplash() {
		// Récupération des vues à animer
		TextView splashLeaf = findViewById(R.id.splash_leaf);
		TextView splashTitle = findViewById(R.id.splash_title);
		TextView splashSlogan = findViewById(R.id.splash_slogan);

		// Animation de la feuille : chute légère
		splashLeaf.setTranslationY(-60);
		splashLeaf.animate().translationY(0).setDuration(900).setInterpolator(new DecelerateInterpolator()).start();

		// Apparition du titre
		splashTitle.animate().alpha(1f).setDuration(700).setStartDelay(500).start();

		// Apparition du slogan
		splashSlogan.animate().alpha(1f).setDuration(800).setStartDelay(1000).start();

	}
}