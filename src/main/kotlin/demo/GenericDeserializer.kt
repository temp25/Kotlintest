package demo

import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken


class GenericDeserializer {
    
    inline fun <reified T> getType(t: T): Unit {
        println("test getType ${T::class}");
    }
    
}