package com.affectiva.affdexme.Networking;

import com.affectiva.affdexme.Question;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Sachin on 9/4/2016.
 */
public interface ApiInterfaceChatbot {
    @GET("chatbot.php")
    Call<Question> getAnswer(@Query("q") String question);
}
