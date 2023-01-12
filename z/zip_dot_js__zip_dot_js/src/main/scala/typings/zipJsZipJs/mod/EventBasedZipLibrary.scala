package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents event-based implementations used to compress/decompress data.
  */
trait EventBasedZipLibrary extends StObject {
  
  /**
    * The class used to compress data.
    */
  var Deflate: Instantiable0[EventBasedCodec]
  
  /**
    * The class used to decompress data.
    */
  var Inflate: Instantiable0[EventBasedCodec]
}
object EventBasedZipLibrary {
  
  inline def apply(Deflate: Instantiable0[EventBasedCodec], Inflate: Instantiable0[EventBasedCodec]): EventBasedZipLibrary = {
    val __obj = js.Dynamic.literal(Deflate = Deflate.asInstanceOf[js.Any], Inflate = Inflate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventBasedZipLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventBasedZipLibrary] (val x: Self) extends AnyVal {
    
    inline def setDeflate(value: Instantiable0[EventBasedCodec]): Self = StObject.set(x, "Deflate", value.asInstanceOf[js.Any])
    
    inline def setInflate(value: Instantiable0[EventBasedCodec]): Self = StObject.set(x, "Inflate", value.asInstanceOf[js.Any])
  }
}
