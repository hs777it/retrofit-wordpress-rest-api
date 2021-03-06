package com.moo.wordpress.rest.api;

import com.moo.wordpress.rest.api.model.Post;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * An interface for the MOO Wordpress API
 * See http://wp-api.org/
 */
public interface Api {

    public final static String API_VERSION = "1.2.5";
    public final static String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm";

    @GET("posts")
    Call<List<Post>> getPosts(@QueryMap Map<String, String> filter);
}

