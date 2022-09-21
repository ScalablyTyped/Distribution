package typings.zipJsZipJs.mod

import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an instance used to read data from a `ReadableStream` instance.
  */
trait ReadableReader extends StObject {
  
  /**
    * The `ReadableStream` instance.
    */
  var readable: ReadableStream[Any]
}
object ReadableReader {
  
  inline def apply(readable: ReadableStream[Any]): ReadableReader = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableReader]
  }
  
  extension [Self <: ReadableReader](x: Self) {
    
    inline def setReadable(value: ReadableStream[Any]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
  }
}
