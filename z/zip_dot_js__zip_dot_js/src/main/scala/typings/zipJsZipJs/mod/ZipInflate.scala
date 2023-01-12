package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a codec used to decompress data.
  */
trait ZipInflate
  extends StObject
     with SyncCodec {
  
  /**
    * Flushes the data
    */
  def flush(): Unit
}
object ZipInflate {
  
  inline def apply(append: js.typedarray.Uint8Array => js.typedarray.Uint8Array, flush: () => Unit): ZipInflate = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), flush = js.Any.fromFunction0(flush))
    __obj.asInstanceOf[ZipInflate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZipInflate] (val x: Self) extends AnyVal {
    
    inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
  }
}
