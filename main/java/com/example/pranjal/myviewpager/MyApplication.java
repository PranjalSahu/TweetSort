package com.example.pranjal.myviewpager;

import android.app.Application;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.services.AccountService;
import com.twitter.sdk.android.core.services.FavoriteService;
import com.twitter.sdk.android.core.services.StatusesService;

/**
 * Created by pranjal on 28/05/15.
 */
public class MyApplication extends Application {
    public TwitterAuthConfig authConfig            = null;
    public TwitterSession currentSession           = null;
    public MyTwitterApiClient  twitterApiClient    = null;
    public StatusesService statusesService         = null;
    public AccountService accountService           = null;
    public FavoriteService favoriteService         = null;
    public String username                         = null;
}
