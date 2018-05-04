package com.example.user.locatietaak.provider;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by user on 01-04-2018.
 */

public class PlaceContract {

    //which Content Provider to access
    public static final String AUTHORITY = "com.example.user.locatietaak";

    // The base content URI
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);


    public static final String PATH_PLACES = "places";

    public static final class PlaceEntry implements BaseColumns {

        // TaskEntry content URI
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_PLACES).build();

        public static final String TABLE_NAME = "places";
        public static final String COLUMN_PLACE_ID = "placeID";
    }
}
