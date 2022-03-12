package com.codepath.apps.restclienttemplate.models

import org.json.JSONObject

data class User(
    val name: String,
    val screeName:String,
    val publicImageUrl: String
){
    companion object{
        fun fromJson(jsonObject: JSONObject):User{
            val user = User(
                name = jsonObject.getString("name"),
                screeName = jsonObject.getString("screen_name"),
                publicImageUrl = jsonObject.getString("profile_image_url_https")
            )
            return user
        }
    }
}