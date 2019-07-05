package pojo

import java.util.Arrays

import com.github.kittinunf.fuel.core.ResponseDeserializable
import com.google.gson.Gson;

data class Instance(
    val id: Int,
    val name: String,
    val plan: String,
    val region: String,
    val tags: Array<String>,
    
    val message: String,
    val topic_prefix: String,
    val brokers: String,
    val username: String,
    val password: String,
    val apikey: String,
    val ready: Boolean,
    
    val error: String
) {
    class Deserializer : ResponseDeserializable<Instance> {
        override fun deserialize(content: String): Instance = Gson().fromJson(content, Instance::class.java)
    }
    
    class ArrayDeserializer : ResponseDeserializable<Array<Instance>> {
        override fun deserialize(content: String): Array<Instance> = Gson().fromJson(content, Array<Instance>::class.java)
    }
    
    override fun toString(): String = "id: $id, name: $name, plan: $plan, region: $region, tags: ${Arrays.toString(tags)}, message: $message, topic_prefix: $topic_prefix, brokers: $brokers, username: $username, password: $password, apikey: $apikey, ready: $ready"
}