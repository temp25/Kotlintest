package pojo

import java.util.Arrays

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson;

data class Team(val email: String, val id: String, val tfa_auth_enabled: Boolean) {
    
    class ArrayDeserializer : ResponseDeserializable<Array<Team>> {
        override fun deserialize(content: String): Array<Team> = Gson().fromJson(content, Array<Team>::class.java)
    }
    
    override fun toString(): String = "email: $email, id: $id, tfa_auth_enabled: $tfa_auth_enabled"
    
}