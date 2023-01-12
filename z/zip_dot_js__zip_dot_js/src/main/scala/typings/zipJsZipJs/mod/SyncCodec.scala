package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncCodec extends StObject {
  
  /**
    * Appends a chunk of decompressed data to compress
    * 
    * @param data The chunk of decompressed data to append.
    * @returns A chunk of compressed data.
    */
  def append(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array
}
object SyncCodec {
  
  inline def apply(append: js.typedarray.Uint8Array => js.typedarray.Uint8Array): SyncCodec = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append))
    __obj.asInstanceOf[SyncCodec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncCodec] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
  }
}
