package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an intance used to compress data.
  */
trait ZipDeflate
  extends StObject
     with SyncCodec {
  
  /**
    * Flushes the data
    * 
    * @returns A chunk of compressed data.
    */
  def flush(): js.typedarray.Uint8Array
}
object ZipDeflate {
  
  inline def apply(
    append: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
    flush: () => js.typedarray.Uint8Array
  ): ZipDeflate = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), flush = js.Any.fromFunction0(flush))
    __obj.asInstanceOf[ZipDeflate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZipDeflate] (val x: Self) extends AnyVal {
    
    inline def setFlush(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
  }
}
