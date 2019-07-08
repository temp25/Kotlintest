package demo

import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.extensions.authentication
import com.github.kittinunf.fuel.core.Headers
import com.google.gson.Gson;

import com.github.kittinunf.fuel.gson.responseObject

import pojo.Instance
import pojo.Team
import pojo.Region

fun getGreeting(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("world!")

    return words.joinToString(separator = " ")
}

fun main(args: Array<String>) {
    println(getGreeting())
    
    FuelManager.instance.basePath = "https://customer.cloudkarafka.com/api"
    
    //list instances
    /*val (request, response, result) = Fuel.get("/instances", listOf())
    .header(Headers.AUTHORIZATION, "Basic YTNkOTljOTEtNTQyMi00NTFkLWEyM2UtMTQzYTQ1OTgzOGE5OkdvdGhhbUAyNQ==")
    .responseObject(Instance.ArrayDeserializer())

    //println(request)
    var (instanceArr, err) = result
    //println(instanceArr)
    instanceArr?.forEach(System.out::println)
    
    //instance brief detail
    val (request2, response2, result2) = Fuel.get("/instances/9474", listOf())
    .header(Headers.AUTHORIZATION, "Basic YTNkOTljOTEtNTQyMi00NTFkLWEyM2UtMTQzYTQ1OTgzOGE5OkdvdGhhbUAyNQ==")
    .responseObject(Instance.Deserializer())
    
    var (instance2, err2) = result2
    println("\n\n$instance2")
   
   //instance creation
    val (request3, response3, result3) = Fuel.post("/instances", listOf(
        "name" to "cli_test_instance_${System.currentTimeMillis()}",
        "plan" to "ducky",
        "region" to "amazon-web-services::us-east-1"
    ))
    .header(Headers.AUTHORIZATION, "Basic YTNkOTljOTEtNTQyMi00NTFkLWEyM2UtMTQzYTQ1OTgzOGE5OkdvdGhhbUAyNQ==")
    .responseObject(Instance.Deserializer())
    
    var (instance3, err3) = result3
    println("\n\n$instance3")*/
   
   //println("test")
   
   //GenericDeserializer().getType<Instance.ArrayDeserializer>(Instance.ArrayDeserializer())
   
   //instance info change
   /*val (request4, response4, result4) = Fuel.put("/instances/3333", listOf(
        "name" to "cli_test_instance_03"
    ))
    .header(Headers.AUTHORIZATION, "Basic YTNkOTljOTEtNTQyMi00NTFkLWEyM2UtMTQzYTQ1OTgzOGE5OkdvdGhhbUAyNQ==")
    .responseObject(Instance.Deserializer())
    
    var (instance4, err4) = result4
    println("\n\n$instance4")
   
   //instance delete
   val (request5, response5, result5) = Fuel.delete("/instances/9524", listOf())
    .header(Headers.AUTHORIZATION, "Basic YTNkOTljOTEtNTQyMi00NTFkLWEyM2UtMTQzYTQ1OTgzOGE5OkdvdGhhbUAyNQ==")
    .responseObject(Instance.Deserializer())
    
    var (instance5, err5) = result5
    println("\n\n$instance5")
    
    //teams info
    val (request6, response6, result6) = Fuel.get("/team", listOf())
    .header(Headers.AUTHORIZATION, "Basic YTNkOTljOTEtNTQyMi00NTFkLWEyM2UtMTQzYTQ1OTgzOGE5OkdvdGhhbUAyNQ==")
    //.responseString()
    .responseObject(Team.ArrayDeserializer())
    
    var (instance6, err6) = result6
    //println("\n\n$instance6")
    instance6?.forEach(System.out::println)*/
    
    //regions list
    val (request7, response7, result7) = Fuel.get("/regions", listOf())
    .header(Headers.AUTHORIZATION, "Basic YTNkOTljOTEtNTQyMi00NTFkLWEyM2UtMTQzYTQ1OTgzOGE5OkdvdGhhbUAyNQ==")
    //.responseString()
    .responseObject(Region.ArrayDeserializer())
    
    var (instance7, err7) = result7
    instance7?.forEach(System.out::println)
    
    
    
}