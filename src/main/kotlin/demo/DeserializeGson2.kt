package demo

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import com.google.gson.Gson

internal class Container {
    var a: Int = 0
    var b: String? = null
    var c: Boolean = false
}

internal class ListOf<T>(private val type: Class<T>) : ParameterizedType {

    override fun getActualTypeArguments(): Array<Type> {
        return arrayOf(type)
    }

    override fun getRawType(): Type {
        return List::class.java
    }

    override fun getOwnerType(): Type? {
        return null
    }
}

class DeserializeGson2 {
    @Throws(Exception::class)
    fun <T> getUsingGeneric(json: String, type: Class<T>): List<T> {
        return Gson().fromJson(json, ListOf(type))
    }

    companion object {

        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            val json = " [ " +
                    " { " +
                    " \"a\": 100, " +
                    " \"b\": \"value1\", " +
                    " \"c\": true " +
                    " }, " +
                    " { " +
                    " \"a\": 200, " +
                    " \"b\": \"value2\", " +
                    " \"c\": false " +
                    " }, " +
                    " { " +
                    " \"a\": 300, " +
                    " \"b\": \"value3\", " +
                    " \"c\": true " +
                    " } " +
                    " ] "

            for (c in DeserializeGson2().getUsingGeneric(json, Container::class.java)) {
                System.out.printf("\n %d %s %b", c.a, c.b, c.c)
            }
        }
    }
}
