package pojo

import java.util.Arrays

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson;


data class Region(val provider: String, val region: String, val name: String, val has_shared_plans: Boolean) {
    
    class ArrayDeserializer : ResponseDeserializable<Array<Region>> {
        override fun deserialize(content: String): Array<Region> = Gson().fromJson(content, Array<Region>::class.java)
    }
    
    override fun toString(): String = "name: $name, provider: $provider, region: $region, has_shared_plans: $has_shared_plans"
    
}