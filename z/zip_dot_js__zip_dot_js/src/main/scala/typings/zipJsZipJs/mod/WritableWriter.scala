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
    * The maximum size of split data when creating a {@link ZipWriter} instance or when calling {@link Entry#getData} with a generator of {@link WritableWriter} instances.
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  
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
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setWritable(value: WritableStream[Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
