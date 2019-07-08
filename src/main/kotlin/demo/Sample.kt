internal class Container {
  var a:Int = 0
  var b:String
  var c:Boolean = false
}
internal class DeserializeGson {
  @Throws(Exception::class)
  fun <T> getUsingGeneric(json:String, type:Class<T>):List<T> {
    return Gson().fromJson(json, ListOf<T>(type))
  }
  companion object {
    @Throws(Exception::class)
    @JvmStatic fun main(args:Array<String>) {
      val json = ("[ " +
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
                  "]")
      for (c in DeserializeGson().getUsingGeneric<Container>(json, Container::class.java!!))
      {
        System.out.printf("%d %s %b%n", c.a, c.b, c.c)
      }
    }
  }
}