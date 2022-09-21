package typings.zipJsZipJs.mod

import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an instance used to write data into a `WritableStream` instance.
  */
trait WritableWriter extends StObject {
  
  /**
    * The `WritableStream` instance.
    */
  var writable: WritableStream[Any]
}
object WritableWriter {
  
  inline def apply(writable: WritableStream[Any]): WritableWriter = {
    val __obj = js.Dynamic.literal(writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[WritableWriter]
  }
  
  extension [Self <: WritableWriter](x: Self) {
    
    inline def setWritable(value: WritableStream[Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
