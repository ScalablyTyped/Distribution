package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the implementations zip.js uses to compress/decompress data.
  */
trait ZipLibrary extends StObject {
  
  /**
    * The class used to compress data.
    * 
    * @defaultValue {@link ZipDeflate}
    */
  var Deflate: Instantiable0[ZipDeflate]
  
  /**
    * The class used to decompress data.
    * 
    * @defaultValue {@link ZipInflate}
    */
  var Inflate: Instantiable0[ZipInflate]
}
object ZipLibrary {
  
  inline def apply(Deflate: Instantiable0[ZipDeflate], Inflate: Instantiable0[ZipInflate]): ZipLibrary = {
    val __obj = js.Dynamic.literal(Deflate = Deflate.asInstanceOf[js.Any], Inflate = Inflate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipLibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZipLibrary] (val x: Self) extends AnyVal {
    
    inline def setDeflate(value: Instantiable0[ZipDeflate]): Self = StObject.set(x, "Deflate", value.asInstanceOf[js.Any])
    
    inline def setInflate(value: Instantiable0[ZipInflate]): Self = StObject.set(x, "Inflate", value.asInstanceOf[js.Any])
  }
}
